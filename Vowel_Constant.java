import java.util.*;
public class Vowel_Constant
{
public static void main(String args[])
{
String input;
Scanner s=new Scanner(System.in);
System.out.println("Enter your input");
input=s.next();
switch(input){
case "a":
case "A":
case "e":
case "E":
case "i":
case "I":
case "o":
case "O":
case "u":
case "U":
System.out.println("This is the Vowel");
break;
default:
System.out.println("This is the Constant");
}

}
}