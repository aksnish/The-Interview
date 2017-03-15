package Arrays;

public class DummyClassForTesting {
	public static void main(String[] args) {
		int x =0;
		
		//Because of the with a string at the beginning, 
		//Java is going to interpret + as a concatenation operator and joins the values of your variables 
		//with the string.
		
		System.out.println("Hello: "+ x + 1);
		System.out.println("Hello: "+ (x + 1));
		System.out.printf("Hello: %d", x + 1);
		System.out.println();
		System.out.println(""+ x + 1);
	}
}
