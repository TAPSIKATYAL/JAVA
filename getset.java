class student
{
int roll;
String name,add;
String getName()
{
return name;
}
int getRoll()
{
return roll;
}
String getAdd()
{
return add;
}
void setName(String a)
{
this.name=a;
System.out.println(name);
}
void setRoll(int r)
{
this.roll=r;
System.out.println(roll);
}
void setAdd(String add)
{
this.add=add;
System.out.println(add);
}
public static void main(String args[])
{
student s =new student();
s.getName();
s.getRoll();
s.getAdd();
s.setName("abc");
s.setRoll(10);
s.setAdd("abcd");