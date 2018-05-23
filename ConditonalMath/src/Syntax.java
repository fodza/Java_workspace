import java.util.Scanner;

public class Syntax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli: ");
		int someNumber = scanner.nextInt();
		int finalResult = someNumber;

		if (someNumber > 10) {
			System.out.println("lielaks par 10");
			finalResult = 10;
		} else if (someNumber < -10) {

			System.out.println("mazaks par -10");
			finalResult = 100;
		} else if (someNumber < -100) {

			System.out.println("ir 10");
			finalResult = -10;
		}
	}

}
