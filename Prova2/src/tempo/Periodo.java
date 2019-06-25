package tempo;

import java.io.Serializable;

/**
 * 
 * @author Luciano A S Junior
 * @version 1.0(junho-2019)
 *
 */
public class Periodo implements Serializable {
	private Data dataInicio, dataFim;
	private Horario horarioInicio, horarioFim;
	
	/**
	 * 
	 * @param _dataInicio
	 * @param _horarioInicio
	 * @param _dataFim
	 * @param _horarioFim
	 * @throws Exception
	 */
	public Periodo(Data _dataInicio, Horario _horarioInicio, Data _dataFim, Horario _horarioFim) throws Exception{
		this.setDataInicio(_dataInicio);
		this.setHorarioInicio(_horarioInicio);
		this.setDataFim(_dataFim);
		this.setHorarioFim(_horarioFim);
	}
	
	/**
	 * 
	 * @return data inicial
	 */
	public Data getDataInicio() {
		return this.dataInicio;
	}
	
	/**
	 * 
	 * @param _dataInicio
	 */
	public void setDataInicio(Data _dataInicio) {
		this.dataInicio = _dataInicio;
	}
	
	/**
	 * 
	 * @return data final
	 */
	public Data getDataFim() {
		return this.dataFim;
	}
	
	/**
	 * 
	 * @param _dataFim
	 * @throws Exception
	 */
	public void setDataFim(Data _dataFim) throws Exception {
		if(_dataFim.compareTo(getDataInicio()) == 1) {
			this.dataFim = _dataFim;
		}
		else {
			throw new Exception("Data Final maior que Inicial");
		}
		
	}
	/**
	 * 
	 * @return horario inicial
	 */
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	/**
	 * 
	 * @param _horarioInicio
	 */
	public void setHorarioInicio(Horario _horarioInicio) {
		this.horarioInicio = _horarioInicio;
	}
	/**
	 * 
	 * @return horario final
	 */
	public Horario getHorarioFim() {
		return this.horarioFim;
	}
	/**
	 * 
	 * @param _horarioFim
	 */
	public void setHorarioFim(Horario _horarioFim) {
		this.horarioFim = _horarioFim;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getDataInicio().toString());
		builder.append("\n");
		builder.append(this.getHorarioInicio().toString());
		builder.append("\n");
		builder.append(this.getDataFim().toString());
		builder.append("\n");
		builder.append(this.getHorarioFim().toString());
		builder.append("\n");
		return builder.toString();
	}
	
	
}
