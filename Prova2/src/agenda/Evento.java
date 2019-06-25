package agenda;

import java.io.Serializable;
import tempo.*;

/**
 * 
 * @author Luciano A S Junior
 * @version 1.0(junho-2019)
 *
 */
public class Evento extends ItemAgenda implements Serializable {
	String local;
	
	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 * @param _local
	 */
	public Evento(String _titulo, String _descricao, Periodo _periodo, String _local) {
		super(_titulo, _descricao, _periodo);
		this.setLocal(_local);
		
	}

	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _dataInicio
	 * @param _horarioInicio
	 * @param _dataFim
	 * @param _horarioFim
	 * @param _local
	 * @throws Exception
	 */
	public Evento(String _titulo, String _descricao, Data _dataInicio,Horario _horarioInicio,
			Data _dataFim, Horario _horarioFim,String _local) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setLocal(_local);
	}
	/**
	 * 
	 * @return local do evento
	 */
	public String getLocal() {
		return this.local;
	}
	
	/**
	 * 
	 * @param _local
	 */
	public void setLocal(String _local) {
		this.local = _local;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(this.getLocal());
		builder.append("\n");
		return builder.toString();
	}
	
	
	
	
}
