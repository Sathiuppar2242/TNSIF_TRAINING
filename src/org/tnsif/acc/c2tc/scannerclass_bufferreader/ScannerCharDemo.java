package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerCharDemo{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
		 String name =  sc.nextLine();
		 System.out.println("Enter your age");
		 int age = sc.nextInt();
		 System.out.println("Enter your salary");
		 double salary =sc.nextDouble();
		 System.out.println("Enter your balance");
		 float balance = sc.nextFloat();
		 System.out.print("Enter a character: ");
         char ch = sc.next().charAt(1);
		 System.out.println("Name of the User: "+name);
		 System.out.println("Age of the User :"+age);
		 System.out.println("salry is :" + salary);
		 System.out.println("balance is :"+balance);
         System.out.print("Enter a character: ");
         System.out.println("You entered: " + ch);
         sc.close();
	}
}