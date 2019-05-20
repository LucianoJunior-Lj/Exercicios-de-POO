import java.util.Scanner;

public class Uso14 {
	private static Scanner scanner;
	public static void main(String[] args) {

		System.out.print("Digite a quantidade de clientes: ");
		int quantidade = scanner.nextInt();
		scanner.nextLine();
		Cliente cliente[] = new Cliente[quantidade];

		for(int i = 0; i < quantidade; i++) {
			scanner = new Scanner(System.in);
			try {
				System.out.print("Digite o email: ");
				String _email = scanner.nextLine();
				scanner.nextLine();
				System.out.print("Digite o nome do cliente: ");
				String _nome = scanner.nextLine();
				scanner.nextLine();
				System.out.print("Digite o numero de celular: ");
				String _celular = scanner.nextLine();
				scanner.nextLine();
				System.out.print("Digite o endereço: ");
				String _endereço = scanner.nextLine();
				scanner.nextLine();

				cliente[i] = new Cliente(_email, _nome, _celular, _endereço);
				System.out.println("\n ============================= \n");				
			
			} catch (Exception e) {
				System.out.println("\nNão foi possível cadastrar o cliente, tente novamente!");
				System.out.println(e);
			}
		}
		for(int i = 0; i < quantidade; i++) {
			//polimorfismo
			System.out.println(cliente[i].toString());
			System.out.println("\n ============================= \n");	
		}
	}
}