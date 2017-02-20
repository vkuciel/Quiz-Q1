import java.util.Scanner;
public class Football_Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Touchdowns (TD): ");
		double TD = input.nextDouble();
		
		System.out.print("Enter total yards (YDS): ");
		double YDS = input.nextDouble();
		
		System.out.print("Enter Interceptions (INT): ");
		double INT = input.nextDouble();
		
		System.out.print("Enter Completions (COMP): ");
		double COMP = input.nextDouble();
		
		System.out.print("Enter number of attempted passes (ATT): ");
		double ATT = input.nextDouble();
		
		input.close();
		
		double a = Math.max(Math.min((COMP/ATT - .3) * 5, 2.375),0);
		double b = Math.max(Math.min((YDS/ATT - 3) * .25, 2.375),0);
		double c = Math.max(Math.min((TD/ATT) * 20, 2.375),0);
		double d = Math.max(Math.min(2.375 - (INT/ATT * 25), 2.375), 0);
		double QBRating = (a+b+c+d)/6 * 100;
		System.out.println("The Quarterback Rating is: "+QBRating);

	}

}
