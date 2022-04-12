package questao;
import java.util.Arrays;
import java.util.Scanner;
public class questao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i=0; i<numeros.length; i++) {
				System.out.println("Informe as Notas: ");
				numeros[i] = ler.nextInt();
		}
		
		Arrays.sort(numeros);

        System.out.println("Essas sao as nonats ordenadas:");
        for(int numero : numeros)
            System.out.println(numero);
       
        numeros  = entrada.nextInt();
		
		if(numero <= 35) {
			System.out.println ("Terceiro lugar ");
		}	
		if (numero <= 48) {
			System.out.println("Segundo lugar");
		}	
		if (numero == 50) {
			System.out.println("Primeiro lugar");

	}

}
