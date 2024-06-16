package curso.javaexecutavel;

public class primeiroclaasejava {
	/*main é um metodo auto executado em Java*/
	public static void main (String [] args) {
		
		int nota1= 90;
		int nota2= 90;

		int key = 1;
		
				switch (key) {
				case 1:
					System.out.println("é 1");
					break;
				case 2:
					System.out.println("é 2");
					break;
					
				case 3:
					System.out.println("é 3");
					break;

				default:
					System.out.println("nenhuma das opções");
					break;
				}
		
		if (nota1!=nota2) {
			System.out.println("As notas sao diferente");
			
		}else {
			System.out.println("As notas sao iguais");
			
		}
		
		
		if (nota1 <= 100) {
			System.out.print("menor que 100");
		}
		
		if(nota2 == 90) {
			System.out.print("");
		}
		

		
	}
	
}

	
