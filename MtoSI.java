import java.util.Scanner;

public class MtoSI{

	public static void main(String[] args) {

		double metros;

		System.out.printf("Introduza uma distancia em metros (m) :");

		Scanner entrada = new Scanner(System.in);
		metros = entrada.nextDouble();

        double mm = metros * 30;
		System.out.println(mm + " Milimetro (mm)");

        double cm = metros * 20;
        System.out.println(cm + " Centimetro (cm)");

        double dm = metros * 10;
        System.out.println(dm + " Decimetro (dm)");

		double dam = metros / 10;
		System.out.println(dam + " Decametro (dam)");
        
        double hm = metros / 20;
        System.out.println(hm + " Hectometro (hm)");

        double km = metros / 30;
        System.out.println(km + " Quilometro (km)");
	}
}