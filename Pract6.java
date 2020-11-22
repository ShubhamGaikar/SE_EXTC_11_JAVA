Import java.util.Scanner;
Public class A_string1{
 Public static void main(String[] args){
 String s1,s2,s3,s4,s5;
 Int i=0;

 Scanner s = new Scanner(System.in);
 // s1 for string length//
 System.out.println(“Enter a string in s1 :”);
 S1 = s.nextLine();
 System.out.println(“stringlength is “+s1.length());

 //s2 for compare//
 System.out.println(“Enter a string in s2 :”);
 S2 = s.nextLine();
 System.out.println(“Comparing s1 and s2 :” +s1.compareTo(s2));

 //s3 for lowercase//
 System.out.println(“Enter a string in s3 : “);
 S3 = s.nextLine();
 String s3lower = s3.toLowerCase();
 System.out.println(“converting to Lower case: “ +s3lower);

 //s4 for upeercase
 System.out.println(“Enter a string is s4: “);
 S4 = s.nextLine();
 String s4upper = s4.toUpperCase();
 System.out.println(“Converting to UpperCase:” +s4upper);

 //s5 for string into sequence of bytes and return an array of bytes//
 System.out.println(“Enter a string is s5 : “);
 S5 = s.nextLine();
 Byte[] b = s5.getBytes();
 System.out.println(b[i]);
 }
}
