import java.lang.*;

public class Calculator {

	public static void main(String[] args) {
	}

	public int add(int a, int b) {
		System.out.println("This is add method for 2 params");
		return a + b;
	}

	public int add(int a, int b, int c) {
		System.out.println("This is add method for 3 params");
		return a + b + c;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int sqrt(int a) {
		return Math.sqrt(a);
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
}