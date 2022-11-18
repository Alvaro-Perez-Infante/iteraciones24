package pakage;

import java.util.Scanner;

public class iteraciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int desdeDia;
		int desdeHora;
		int hastaDia;
		int hastaHora;
		
		int tiempoTranscurrido;
		
		System.out.print("Desde qué día? [1-7]");
		desdeDia = Integer.parseInt(teclado.nextLine());
		System.out.print("a qué hora? [1-24]");
		desdeHora = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Hasta qué día? [1-7]");
		hastaDia = Integer.parseInt(teclado.nextLine());
		System.out.print("a qué hora? [1-24]");
		hastaHora = Integer.parseInt(teclado.nextLine());
		
		tiempoTranscurrido = (24-desdeHora) + ((hastaDia-desdeDia-1) *24) + hastaHora;
		
		System.out.println("Hay " + tiempoTranscurrido + "horas.");

}
}
