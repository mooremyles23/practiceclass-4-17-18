import java.util.Scanner;
public class numb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]Colors={"red","blue","yellow","green","orange"};
				Scanner Scanner= new Scanner(System.in);
				System.out.print("Enter the color you are looking for");
	String Color=Scanner.nextLine();
	String check= "No match found";
	
	for (int i=0; i<Color.length();i++)
	{
		if (Color.equals(Colors[i]))
{
	check= "Match found";
}
		else System.out.println (check);
	}
}}
