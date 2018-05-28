import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		/*
		 * Uzrakstît programmu klasç ConditionalMath 1) Programma pieprasa no lietotâja
		 * ievadît viòa vârdu. 2) Programma pieprasa no lietotâja ievadît divus veselus
		 * skaitïus(piem., i, j) un pieðíirt to vçrtîbu atbilstoða tipa mainîgajiem 3)
		 * Salîdzinot abus ievadîtos skaitïus programma izvada a) Paziòojumu par to kurð
		 * skaitlis ir lielâks un kurð mazâks, attiecîgi aizstâjot B “Skaitlis B ir
		 * lielâks par skaitli S” vai gadîjumâ, ja abi skaitïi ir vienâdi, tad “Skaitlis
		 * i un j ir vienâdi!” b) Paziòojumu vai ðo skaitïu summa ir garâka par
		 * lietotâja vârdu. “Skaitïu i un j summa ir x, kas ir vairâk nekâ/mazâk
		 * nekâ/tikpat cik burtu Tavâ vârdâ!” Lai izmantotu rezultâtu no relâciju
		 * operâtoriem(<,>,<=,>=,==, !=) var izmantot if konstrukcîju. Piem., if (a > b)
		 * { text = “a ir lielâks par b”; // text is defined outside if condition } Lai
		 * noskaidrotu ievadîtâ vârda garumu var izmantot String objekta metodi length()
		 * metodi.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadi vardu: ");
		String name = scanner.next();

		System.out.println("Ievadi 1.veselo skaitli i: ");
		int i = scanner.nextInt();

		System.out.println("Ievadi 2.veselo skaitli i: ");
		int j = scanner.nextInt();

		if (i==j) {
			System.out.println("Kluda ciparu ievade, abi ir vienadi!!! Programma apstasies!");
		}
		if (i != j) {

			if (i > j) {

				System.out.println("i>j");
				
				int sum1 = i + j;
				String leadMessage = "Skaitïu i un j summa ir " + sum1 + " kas ir ";
				String trailMessage = " burtu Tavâ vârdâ!";

				if (sum1 == name.length()) {
					System.out.println(leadMessage + "tikpat cik" + trailMessage);
				} else {
					if (sum1 < name.length()) {
						System.out.println(leadMessage + "mazâk nekâ" + trailMessage);
					} else {
						System.out.println(leadMessage + "vairâk nekâ" + trailMessage);
					}
			} }
				else {

				System.out.println("i<j");

				int sum = i + j;
				String leadMessage = "Skaitïu i un j summa ir " + sum + " kas ir ";
				String trailMessage = " burtu Tavâ vârdâ!";

				if (sum == name.length()) {
					System.out.println(leadMessage + "tikpat cik" + trailMessage);
				} else {
					if (sum < name.length()) {
						System.out.println(leadMessage + "mazâk nekâ" + trailMessage);
					} else {
						System.out.println(leadMessage + "vairâk nekâ" + trailMessage);
					}

				}
			}

			
		}
	}
}
