import java.util.*;

class Book
{
String name;
Author author;
double price;int qty=0;
Book(String name,Author author,double price)
{
this.name=name;
this.author=author;
this.price=price;
}
Book(String name,Author author,double price,int qty)
{
this.name=name;
this.author=author;
this.price=price;
this.qty=qty;
}
String getName()
{
return name;
}
String getAuthor()
{
return author;
}
double getPrice()
{
return price;
}
void setPrice(double price)
{
this.price=price;
}
int getQty()
{
return qty;
}
void setQty(int qty)
{
this.qty=qty;
}
public String toString()
{
return "Book[name=?,Author[name=?,email=?,gender=?],price=?,qty=?]";
}
public static void main(String args[])
{
Book book=new Book("abc",a,100,50);
}
}