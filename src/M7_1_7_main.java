import java.util.Scanner;

public class M7_1_7_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		char car1 = ' ';
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdueix un caràcter: ");
		car1 = entrada.next().charAt(0);
		System.out.println("Introdeix un nombre de vegadas que vols cuadrar el caràcter: ");
		num1 = entrada.nextInt();
		
		for (int i = 0; i < num1 ; i++) {
			    System.out.println(" ");
			for(int z = 0; z < num1 ; z++) {
				System.out.print(car1);
				
			}
					
		}

	}

}
