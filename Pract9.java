//11.Illustrate method overloading

Public class prac9 {

Double result ;
Double areac(int a)
{
Result = 3.14* a * a ;
Return result;
}
Double areac(int a , int b)
{
Result = a * b;
Return result;
}
Double areac(int a , int b , int c)
{
Result = a *b *c;
Return result;
}

Public static void main(String[] args) {
Prac11 obj = new prac11();
Double a , b , c;
A=obj.areac(2);
System.out.println(“area of circle is “ + a);
B=obj.areac(2,3);
System.out.println(“area of rectangle is “+b);
C= obj.areac(2,3,5);
System.out.println(“volume of cuboid is “+ c);

}
}
