import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x,y;
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println(x + " + " + y + " = " + (x+y));
	}
}
