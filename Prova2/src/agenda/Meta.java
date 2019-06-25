package agenda;

import java.io.Serializable;
import tempo.*;

/**
 * 
 * @author Luciano A S Junior
 * @version 1.0(junho-2019)
 *
 */

public class Meta extends ItemAgenda implements Serializable {
	private int prioridade;
	
	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 * @param _prioridade
	 */
	public Meta(String _titulo, String _descricao, Periodo _periodo, int _prioridade) {
		super(_titulo, _descricao, _periodo);
		this.setPrioridade(_prioridade);
	}
	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _dataInicio
	 * @param _horarioInicio
	 * @param _dataFim
	 * @param _horarioFim
	 * @param _prioridade
	 * @throws Exception
	 */
	public Meta(String _titulo, String _descricao, Data _dataInicio,
			Horario _horarioInicio, Data _dataFim, Horario _horarioFim, int _prioridade) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setPrioridade(_prioridade);
	}

	/**
	 * 
	 * @return prioridade
	 */
	public int getPrioridade() {
		return this.prioridade;
	}
	/**
	 * 
	 * @param _prioridade
	 */
	public void setPrioridade(int _prioridade) {
		this.prioridade = _prioridade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(this.getPrioridade());
		builder.append("\n");
		return builder.toString();
	}
	
	
	
}
