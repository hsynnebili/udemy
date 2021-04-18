package udemy;

import java.util.Scanner;

public class YakitTutari {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Araciniz kilometrede kac kurus yakiyor? (Ornek:0.32)");
	double kurus=scanner.nextDouble();
	
	System.out.println("Aracinizla kac kilometre yol aldiniz?");
	double yol=scanner.nextDouble();
	
	double yakit=(kurus*yol);
	
	System.out.println("Toplam odemeniz gereken tutar: "+yakit);
			
}
}
