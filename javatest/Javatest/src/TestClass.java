import java.util.Scanner;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stringtoint a = new Stringtoint();
		Scanner x = new Scanner(System.in);
		System.out.print("Input String 1:: ");
		String input1=x.next();
		

		System.out.println("result="+a.getInt(input1));
		
		
		System.out.println("Input String 2:: ");
		String input2=x.next();
		
		
		System.out.println("result="+a.getInt(input2));
	}

}
