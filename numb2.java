import java.util.Scanner;

public class numb2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]List= new int[3];
		Scanner Scanner= new Scanner(System.in);
		System.out.print("Enter 3 different numbers");
		
		int number1=Scanner.nextInt();
        int number2=Scanner.nextInt();
        int number3=Scanner.nextInt();
        
        if ((number1>number2)&&(number2>number3))
        {
        	System.out.println(number1+"is the largest");
        	System.out.println(number3+"is the smallest");
        }
		
        else if ((number2>number1)&&(number1>number3))
		
        {
        	System.out.println(number2+"is the largest");
        	System.out.println(number3+"is the smallest");
        }
		
        else if ((number2>number3)&&(number3>number1))
    		
        {
        	System.out.println(number2+"is the largest");
        	System.out.println(number1+"is the smallest");
        }
		
 
        else if ((number1>number3)&&(number3>number2))
    		
        {
        	System.out.println(number1+"is the largest");
        	System.out.println(number2+"is the smallest");
        }
		
		

        else if ((number3>number2)&&(number2>number1))
    		
        {
        	System.out.println(number3+"is the largest");
        	System.out.println(number1+"is the smallest");
        }
		
		
 
        else if ((number3>number1)&&(number1>number2))
    		
        {
        	System.out.println(number3+"is the largest");
        	System.out.println(number2+"is the smallest");
        }
		
        else System.out.print("Error");}
}	
		

