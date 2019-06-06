/**
 * Usada como objeto de teste para compor as classes que encapsulam a coleção
 * TreeSet.
 * 
 * @author Luciano Junior
 * @version 1.0 (junho-2019)
 */
public class Sorteio {
	private final static int LIMITEINFERIOR = 1;
	private final static int LIMITESUPERIOR = 98;
	private final static int QUANTIDADE = 4;

	protected static int limiteInferior = Sorteio.LIMITEINFERIOR;
	protected static int limiteSuperior = Sorteio.LIMITESUPERIOR;
	protected static int quantidade = Sorteio.QUANTIDADE;

	/** */
	private Data data;
	
	private NumerosSorteados sorteio;

	/**
	 * Construtor para inicializar valores nos campos
	 *
	 * @param _data data inicial do sorteio.
	 */
	public Sorteio (Data _data) {
		this.data = _data;
		this.sorteio = new NumerosSorteados(quantidade);
	}
	
	/**
	 * @return o Valor Minimo
	 */
	public static int getLimiteInf() {
		return Sorteio.limiteInferior;
	}

	/**
	 * @param _limiteInferior o Valor Minimo
	 */
	public static void setLimiteInf(int _limiteInferior) {
		Sorteio.limiteInferior = _limiteInferior;
	}

	/**
	 * @return o Valor Maximo
	 */
	public static int getLimiteSup() {
		return Sorteio.limiteSuperior;
	}

	/**
	 * @param _limiteSuperior o Valor Maximo
	 */
	public static void setLimiteSup(int _limiteSuperior) {
		Sorteio.limiteSuperior = _limiteSuperior;
	}

	/**
	 * @return A quantidade de numeros
	 */
	public static int getQuantidade() {
		return Sorteio.quantidade;
	}

	/**
	 * @param _quantidade A Quantidade de numeros
	 */
	public static void setQuantidade(int _quantidade) {
		Sorteio.quantidade = _quantidade;
	}

	/**
	 * pega a data
	 * 
	 * @return data
	 */
	public Data getData() {
		return this.data;
	}
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getData());
		builder.append(" ");
		builder.append(sorteio);
		return builder.toString();
	}

}
