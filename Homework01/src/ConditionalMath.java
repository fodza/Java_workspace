import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		/*
		 * Uzrakst�t programmu klas� ConditionalMath 1) Programma pieprasa no lietot�ja
		 * ievad�t vi�a v�rdu. 2) Programma pieprasa no lietot�ja ievad�t divus veselus
		 * skait�us(piem., i, j) un pie��irt to v�rt�bu atbilsto�a tipa main�gajiem 3)
		 * Sal�dzinot abus ievad�tos skait�us programma izvada a) Pazi�ojumu par to kur�
		 * skaitlis ir liel�ks un kur� maz�ks, attiec�gi aizst�jot B �Skaitlis B ir
		 * liel�ks par skaitli S� vai gad�jum�, ja abi skait�i ir vien�di, tad �Skaitlis
		 * i un j ir vien�di!� b) Pazi�ojumu vai �o skait�u summa ir gar�ka par
		 * lietot�ja v�rdu. �Skait�u i un j summa ir x, kas ir vair�k nek�/maz�k
		 * nek�/tikpat cik burtu Tav� v�rd�!� Lai izmantotu rezult�tu no rel�ciju
		 * oper�toriem(<,>,<=,>=,==, !=) var izmantot if konstrukc�ju. Piem., if (a > b)
		 * { text = �a ir liel�ks par b�; // text is defined outside if condition } Lai
		 * noskaidrotu ievad�t� v�rda garumu var izmantot String objekta metodi length()
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
				String leadMessage = "Skait�u i un j summa ir " + sum1 + " kas ir ";
				String trailMessage = " burtu Tav� v�rd�!";

				if (sum1 == name.length()) {
					System.out.println(leadMessage + "tikpat cik" + trailMessage);
				} else {
					if (sum1 < name.length()) {
						System.out.println(leadMessage + "maz�k nek�" + trailMessage);
					} else {
						System.out.println(leadMessage + "vair�k nek�" + trailMessage);
					}
			} }
				else {

				System.out.println("i<j");

				int sum = i + j;
				String leadMessage = "Skait�u i un j summa ir " + sum + " kas ir ";
				String trailMessage = " burtu Tav� v�rd�!";

				if (sum == name.length()) {
					System.out.println(leadMessage + "tikpat cik" + trailMessage);
				} else {
					if (sum < name.length()) {
						System.out.println(leadMessage + "maz�k nek�" + trailMessage);
					} else {
						System.out.println(leadMessage + "vair�k nek�" + trailMessage);
					}

				}
			}

			
		}
	}
}
