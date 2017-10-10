import java.util.Scanner;   //Java class Scanner to take input from user. 

public class TestDemo {   //Main class with methods and objects

	public static void main (String args[]) {   //Main function defined publically
		
		System.out.println("----------Program to check wheather a number is Zero, Positive or Negative:----------");
		
		System.out.println("\n\nEnter any number, positive, negative or Zero: ");
		Scanner AnyNumber = new Scanner(System.in);   //created object of class Scanner
		int num = AnyNumber.nextInt();				  //Taking any input integer from user  
		char StringAscii = (char) num;  			  // Converting Integer into its ASCII value

		
		if(num == 0) {   //checking if number is Zero or not
			System.out.println("you have entered Zero: \n"+ "ASCII value is: "+StringAscii);
		}
		
		else if (num > 0 && StringAscii > '0') {   //checking if number is greater than Zero or not with its ASCII value
			System.out.println("you have entered Positive Value: \n"+ "ASCII value is: "+StringAscii); //Printing Positive value
		}
		
		else  if (num < 0 && StringAscii < '0'){   //checking if number is smaller than Zero or not with its ASCII value.
			System.out.println("you have entered Negative Value: \n"+ "ASCII value is: "+StringAscii); //Printing Negative value 
		}
		
		else {
			System.out.println("Please eneter a value");
		}
				
System.out.println("\n\n-------Program to find the average marks of student and their grades acordingly-------");
		
		System.out.println("\nEnter the marks in Physics: ");
		Scanner Physics = new Scanner(System.in);   //Object of Scanner Class
		int PhysicsMarks = Physics.nextInt();		//Taking input of Physics marks from user
		
		System.out.println("\nEnter the marks in Chemestry: ");
		Scanner Chemestry = new Scanner(System.in);		//Object of Scanner Class
		int ChemestryMarks = Chemestry.nextInt();    //Taking input of Chemestry marks from user
		

		System.out.println("\nEnter the marks in Maths: ");
		Scanner Maths = new Scanner(System.in);		//Object of Scanner Class
		int MathsMarks = Maths.nextInt();			//Taking input of Maths marks from user
		
		int Average_Marks = (PhysicsMarks+ChemestryMarks+MathsMarks)/3;   //Calculating average of all the three marks
		 
		if (Average_Marks > 70) {     //Checked if average is greater than 70 will secure Grade A
			System.out.println("\nYou have secured grade A!");  
		}
		else if (Average_Marks >= 61 && Average_Marks <= 70) {  //Checked if average is between 61 and 70 will secure Grade B
			System.out.println("\nYou have secured grade B!");
		}
		else {   //else print C
			System.out.println("\nYou have secured grade C!");
		}
		
		//Closing all the opened Scanner class objects.
		AnyNumber.close();   
		Physics.close();
		Chemestry.close();
		Maths.close();
	}
	
}
