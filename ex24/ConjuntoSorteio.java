import java.util.LinkedList;
import java.util.List;


public class ConjuntoSorteio {
	/**
	 * Encapsula a classe LinkedList facilitando o seu uso e tipificando os objetos
	 * para inclusão como instâncias da classe Sorteio
	 *
	 * @author Luciano Junior
	 * @version 1.0 (junho-2019)
	 */
	private List<Sorteio> grupo;

	ConjuntoSorteio() {
		grupo = new LinkedList<Sorteio>();
	}

	/**
	 * Insere uma instância da classe Sorteio
	 *
	 * @param _data data inicial para ser incluída na coleção
	 * @param _quantidade quantidade de sorteios que deverá realizar
	 * @throws Exception 
	 */
	public void insere(Data _data, int _quantidade) throws Exception {
		
		for(int i = 0; i < _quantidade; i++) {
			Sorteio sort = null;
			sort = new Sorteio(_data.incrementa(1));
			this.grupo.add(sort);
		}
	}

	/**
	 * Sobreposição do método toString para retornar todo o conteúdo da coleção
	 * separando os elementos em linhas.
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < this.grupo.size(); i++)
			s.append(this.grupo.get(i) + "\n");
		return s.toString();
	}
}