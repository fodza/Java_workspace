import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		
		/*Uzrakst�t programmu klas� BasicMath
		1) Programma pieprasa no lietot�ja ievad�t vienu veselu skaitli un pie��ir t� v�rt�bu
	atbilsto�a tipa main�gajam
	2) Programma pieprasa no ievad�t decim�lskaitli(ar peldo�o komatu) un pie��ir t� v�rt�bu
	atbilsto�� tipa main�gajam
	3) Uz erk�na izvada �o skait�u summu, starp�bu, dal�jumu, reizin�jumu un summas
	kvadr�tu(summu reizin�jums). Katru lielumu izvadam jaun� rind� ar paskaidrojo�o
	tekstu.(aizst�jot A/B un p�r�jos)
	�Skait�u A un B summa ir: SUM�
	�Skait�u A un B starp�ba ir: SUB�
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
				System.out.println(" Skait�u A un B summa ir: " + SUM);
				System.out.println(" Skait�u A un B starp�ba ir: " + SUB);
				System.out.println(" Skait�u A un B dalijums ir: " + DAL);
				System.out.println(" Skait�u A un B reizinajums ir: " + REZ);
				System.out.println(" Skait�u A un B summas kvadr�ts (summu reizin�jums): " + SUMkvad);
	}

}
