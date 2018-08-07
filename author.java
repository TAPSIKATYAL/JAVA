import java.util.Scanner;
class Author
{
String name,email;
char gender;
Author(String name,String email,char gender)
{
this.name=name;
this.email=email;
this.gender=gender;
}
String getName()
{
return name;
}
String getEmail()
{
return email;
}
void setEmail(String email)
{
this.email=email;
}
char getGender()
{
return gender;
}
public String toString()
{
return "Author[name=?,email=?,gender=?]";
}

}


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
return author.name;
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
String str= "Book[name= "+this.name+" ,Author[name= "+this.author.name+",email= "+this.author.email+",gender="+this.author.gender+"],price="+this.price+",qty="+this.qty+"]";
return str;
}
public static void main(String args[])
{
Author aa = new Author("gaurav","gmail.com",'m');
Book book=new Book("abc",aa,100,50);
String sc=book.toString();
System.out.println(sc);
}
}
