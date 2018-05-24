import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		
		/*Uzrakstît programmu klasç BasicMath
		1) Programma pieprasa no lietotâja ievadît vienu veselu skaitli un pieðíir tâ vçrtîbu
	atbilstoða tipa mainîgajam
	2) Programma pieprasa no ievadît decimâlskaitli(ar peldoðo komatu) un pieðíir tâ vçrtîbu
	atbilstoðâ tipa mainîgajam
	3) Uz erkâna izvada ðo skaitïu summu, starpîbu, dalîjumu, reizinâjumu un summas
	kvadrâtu(summu reizinâjums). Katru lielumu izvadam jaunâ rindâ ar paskaidrojoðo
	tekstu.(aizstâjot A/B un pârçjos)
	“Skaitïu A un B summa ir: SUM”
	“Skaitïu A un B starpîba ir: SUB”
	utt*/
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Ievadi veselu skaitli A: ");		
		int sk1 = scanner.nextInt();

		System.out.println("Ievadi skaitli ar komatu B: ");		
		double sk2 = scanner.nextDouble();
				
		double SUM = sk1 + sk2;
		double SUB = sk1 - sk2;		
		double DAL = sk1 / sk2;
		double REZ = sk1 * sk2;
		double SUMkvad = (sk1 + sk2)*(sk1 + sk2);
				System.out.println(" Skaitïu A un B summa ir: " + SUM);
				System.out.println(" Skaitïu A un B starpîba ir: " + SUB);
				System.out.println(" Skaitïu A un B dalijums ir: " + DAL);
				System.out.println(" Skaitïu A un B reizinajums ir: " + REZ);
				System.out.println(" Skaitïu A un B summas kvadrâts (summu reizinâjums): " + SUMkvad);
	}

}
