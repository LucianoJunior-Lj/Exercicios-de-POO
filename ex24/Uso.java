import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * <p>
 * <b> Coleções usadas: </b>
 * <p>
 * <b> LinkedList </b> - aceita elementos repetidos; permite acesso aleatório do
 * n-esimo elemento; apesar de percorrer sequencialmente a lista (da frente para trás
 * ou vice-versa, dependendo do que for mais próximo);
 * mantém a mesma ordem da inserção; para usar uma pesquisa binária (muito mais rápida que a linear), 
 * com o método estático Collections.binarySearch(lista), os elementos deverão estar ordenados.
 * <p>
 * <b> TreeSet </b> - não aceita elementos repetidos; mantém os elementos
 * ordenados a cada inserção, possui busca rápida; é ruim para acessar os
 * elementos sequencialmente
 * <p>
 * <p>
 * Estas classes de coleções foram encapsuladas em outras classes para facilitar o seu uso
 * <p>
 * Os objetos são depois gravados em disco através da serialização.
 * <p>
 * Tipos primitivos só podem ser inseridos em coleções por intermédio de
 * classes wrapper (em versões mais recente do Java é possível inserir tipos primitivos)
 * 
 * @author Luciano Junior
 * @version 1.0 (junho-2019)
 *
 */
public class Uso {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		try {
			ConjuntoSorteio sorteio = new ConjuntoSorteio();
			sorteio.insere(new Data("24/04/2007"), 8);
			System.out.println(sorteio);
			
			Arquivo.grava("conjunto.my",sorteio);
	      	LinkedList<Sorteio> sorteio2;
	      	sorteio2 = (LinkedList<Sorteio>)Arquivo.le("conjunto.my");
	      	System.out.println("Dados lidos do arquivo:\n"+sorteio2.toString());
	      	
	      	BufferedWriter arquivoSaida;
	      	arquivoSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));
	      
	      	arquivoSaida.write(sorteio.toString()+"\r\n");

	      	arquivoSaida.close();
		}
		
		catch(IOException e) {
          	System.out.println("Problemas na leitura ou gravação do arquivo");
    	}

		
    	catch(ClassNotFoundException e) {
          	System.out.println("Classe inexistente usada na conversão");
    	}

	}
}