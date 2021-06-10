import java.util.*;

public class ejercicio7{
	
	public static void main(String[] args){
		double porcimpares;
	    double porcpares;
		double porcnulo;
		
		Scanner scanner = new Scanner(System.in);
		
		double contadornulo = 0;
		double contadorpares = 0;
		double contadorimpares = 0;
		
		for (int i= 1; i<=15; i++){
			int numero = (int)(Math.random()*36+1);
			System.out.println("Numero aleatorio de la ruleta "+i+": "+numero);
			
			if(numero == 0){
				contadornulo = contadornulo + 1;
			}else
				if((numero%2)==0){
					contadorpares = contadorpares + 1;
				}else{
					contadorimpares = contadorimpares + 1;
				}
		}
		
		porcpares = contadorpares/15*100;
		porcimpares = contadorimpares/15*100;
		porcnulo = contadornulo/15*100;
		
		System.out.println("Hay un "+porcpares+" % de numeros pares.");
		System.out.println("Hay un "+porcimpares+" % de numeros impares.");
		System.out.println("Hay un "+porcnulo+" % de numeros nulos.");
	}
}