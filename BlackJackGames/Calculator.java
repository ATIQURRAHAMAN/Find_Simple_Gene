
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		double res = 0;
		double a, b;
		char operator;
		while(true) {
			a = input.nextDouble();
			operator = input.next().charAt(0);
			b = input.nextDouble();
			if(a == 0.0) {
				System.out.println("Bye, now.");
				break;

		  }
		  switch(operator) {
		      case '+': res = a+b;
		      break;
		      case '-': res = a-b;
		      break;
		      case '*': res = a*b;
		      break;
		      case '/': res = a/b;
		      break;
		      case '^': res = Math.pow(a, b);
		      break;

		  }
		  System.out.println(res);

		}

	}
}



