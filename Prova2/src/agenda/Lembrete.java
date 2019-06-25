package agenda;

import java.io.Serializable;
import tempo.*;
/**
 * 
 * @author Luciano A S Junior
 * @version 1.0(junho-2019)
 *
 */

public class Lembrete extends ItemAgenda implements Serializable {
	int minutosLembrete;
	
	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 * @param _minutosLembrete
	 */
	public Lembrete(String _titulo, String _descricao, Periodo _periodo, int _minutosLembrete) {
		super(_titulo, _descricao, _periodo);
		this.setMinutosLembrete(_minutosLembrete);
		
	}

	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _dataInicio
	 * @param _horarioInicio
	 * @param _dataFim
	 * @param _horarioFim
	 * @param _minutosLembrete
	 * @throws Exception
	 */
	public Lembrete(String _titulo, String _descricao, Data _dataInicio,Horario _horarioInicio,
			Data _dataFim, Horario _horarioFim, int _minutosLembrete) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setMinutosLembrete(_minutosLembrete);
	}
	
	/**
	 * 
	 * @return minutos restante para lembrete
	 */
	public int getMinutosLembrete() {
		return this.minutosLembrete;
	}
	/**
	 * 
	 * @param _minutosLembrete
	 */
	public void setMinutosLembrete(int _minutosLembrete) {
		this.minutosLembrete = _minutosLembrete;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(this.getMinutosLembrete());
		builder.append("\n");
		return builder.toString();
	}
	
	
	
	
}
