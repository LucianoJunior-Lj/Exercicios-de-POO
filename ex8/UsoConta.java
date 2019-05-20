import java.util.Scanner;

public class UsoConta {
	private static Scanner scanner;
	public static void main(String[] args) {
		try{
			int quantidade = 2;			
			Conta conta[] = new Conta[quantidade];

			for(int i = 0 ; i < quantidade ; i++){
				scanner = new Scanner(System.in);
				System.out.println("Digite o nome do correntista: ");
				String _nome = scanner.nextLine();

				scanner.nextLine();
				System.out.println("Digite o saldo do correntista: ");
				double _saldo = scanner.nextDouble();
				conta[i] = new Conta(_nome,_saldo);
			}

			scanner.nextLine();
			System.out.println("Digite qual correntista você quer corrigir o saldo 1 ou 2: ");
			int escolha = scanner.nextInt();
			scanner.nextLine();



			if(escolha == 1) {
				scanner.nextLine();
				System.out.println("Digite a taxa de juros: ");
				double _taxaJuros = scanner.nextDouble();
				Conta.setTaxaJuros(_taxaJuros);
				
				conta[0].setSaldo(conta[0].getSaldo());
			}
			else {
				System.out.println("Digite a taxa de juros: ");
				double _taxaJuros = scanner.nextDouble();
				Conta.setTaxaJuros(_taxaJuros);
				conta[1].setSaldo(conta[1].getSaldo());
			}

			for(int j = 0 ; j < quantidade; j++){
				System.out.println(conta[j].toString());
			}
		}catch (Exception e){
			System.out.println("Nao foi possivel cadastrar.L"); 
		}
	}
}


