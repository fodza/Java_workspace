import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	

System.out.println("Ievadi vecumu: ");		
int AGE = scanner.nextInt();

System.out.println("Ievadi vardu: ");		
String NAME = scanner.next();
		
		
		System.out.println("Sveiki, mani sauc: " + NAME+ " esmu " +AGE +" jauna");

	}

}
