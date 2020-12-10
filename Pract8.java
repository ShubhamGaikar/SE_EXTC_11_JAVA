//10.Define a class, describe its constructor,
overload the Constructors and instantiate its object.
Class prac10{
Int value1;
Int value2;
Prac10(){
System.out.println(“Inside default Constructor”);
Value1 = 10;
Value2 = 20;

}
Prac10(int a){

System.out.println(“Inside paramaterized
Constructor1”);
Value1 = a;
}
Prac10(int a,int b){

System.out.println(“Inside paramaterized
Constructor2”);
Value1 = a;
Value2 = b;
}
Public void display(){
System.out.println(“Value1 === “+value1);

System.out.println(“Value2 === “+value2);
}
Public static void main(String args[]){
Prac10 d1 = new prac10();
D1.display();
Prac10 d2 = new prac10(30);
D2.display();
Prac10 d3 = new prac10(30,40);
D3.display();
}
}
