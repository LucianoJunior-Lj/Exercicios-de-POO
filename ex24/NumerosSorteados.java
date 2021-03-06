import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

/**
 * Encapsula a classe TreeSet facilitando o seu uso e tipificando os objetos para
 * inclus�o como inst�ncias da classe Sorteio
 *
 * @author Luciano Junior
 * @version 1.0 (junho-2019)
 */

public class NumerosSorteados {
	private Set<Integer> grupo;
	
	//inst�ncia um objeto da classe Random usando o construtor b�sico
	private Random gerador = new Random();

	NumerosSorteados(double quantidade) {
		grupo = new TreeSet<Integer>();
		while(this.grupo.size()<quantidade) {
			int _numero = gerador.nextInt(Sorteio.limiteSuperior);
			if(!this.existe(_numero ++)) {
				this.insere(_numero ++);	
			}
		}
	}
	
	/**
	 * Insere um novo n�mero.
	 *
	 * @param _numero objeto a ser inclu�do da cole��o
	 */
	public void insere(int _numero) {
		this.grupo.add(_numero);
	}

	/**
	 * Verifica a exist�ncia de uma int�ncia atrav�s do campo numero
	 * @param _numumero numero a ser pesquisado
	 * @return true se achou <p>
	 *     	false se n�o achou
	 */
	public boolean existe(int _numumero) {
		return this.grupo.contains(_numumero);
	}

	/**
	 * Sobreposi��o do m�todo toString para retornar todo o conte�do da cole��o
	 * separando os elementos por espa�os
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		Iterator<Integer> i = this.grupo.iterator();
		while (i.hasNext())
			s.append(i.next() + " ");
		return s.toString();
	}
}