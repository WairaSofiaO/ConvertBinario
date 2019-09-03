import java.util.Scanner;

public class Binario1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Algoritmo para convertir un número decimal a binario. \n Escriba el numero a convertir <=0: ");
		int numero = sc.nextInt();
		
		//Validar si el numero es negativo
		if(numero<0) {
			while (numero<0) {
				System.out.print("El número debe ser mayor o igual a 0. \n Escribalo de nuevo: ");
				numero = sc.nextInt();
			}
			convertBinario(numero);
		}//Si es positivo
		else
			convertBinario(numero);
	}
	public static void convertBinario(int numero){
		String binario = ""; //string vacio para ir acoplando el resultado
		int numero1 = numero;
		if (numero==0)
			System.out.println("Resultado: "+numero1+" = "+numero);
		else {
			while (numero > 0) {
				if (numero % 2 == 0) 
					binario = "0" + binario; //Si es par, agrega 0, el primer binario, lo va poniendo de ultimo"
				else 
					binario = "1" + binario; //Si es par, agrega 1
				numero = numero/2;
				//System.out.println("resultado de la division: "+numero);
			}
			System.out.println("Resultado: "+numero1+" = "+binario);	
		}
	}
}
