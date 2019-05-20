import java.util.Scanner;
import java.util.Random;

public class Uso9 {
	final static int QUANTIDADE = 3;
	private static Scanner scanner;
	public static void main(String[] args) throws Exception {
		Ponto vetor[] = new Ponto[QUANTIDADE];
		
		System.out.println("Insira dados para gerar um Ponto");
		System.out.println("Insira o valor de X: ");
		scanner = new Scanner(System.in);
		Double x = scanner.nextDouble();
		System.out.println("Insira o valor de Y: ");
		Double y = scanner.nextDouble();
		
		Ponto ponto = new Ponto(x, y);

        Random gerador = new Random();
         
		for(int i = 0; i < QUANTIDADE; i++) {
			vetor[i] = new Ponto(gerador.nextInt(99), gerador.nextInt(99));
		}
		
		for(int i = 0; i < QUANTIDADE; i++) {
			System.out.println(vetor[i].toString());
			System.out.println(vetor[i].distancia(ponto));
		}
	}

}