package agenda;

import tempo.*;
import java.io.Serializable;

/** 
 * @author Luciano A S Junior
 * @version 1.0(junho-2019)
 *
 */

public abstract class ItemAgenda implements Serializable {
	String titulo, descricao;
	Periodo periodo;
	
	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 */
	public ItemAgenda(String _titulo, String _descricao, Periodo _periodo) {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
	}
	
	/**
	 * 
	 * @param _titulo
	 * @param _descricao
	 * @param _dataInicio
	 * @param _horarioInicio
	 * @param _dataFim
	 * @param _horarioFim
	 * @throws Exception
	 */
	public ItemAgenda(String _titulo, String _descricao,Data _dataInicio,
			Horario _horarioInicio, Data _dataFim, Horario _horarioFim) throws Exception  {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(new Periodo(_dataInicio, _horarioInicio, _dataFim, _horarioFim));
	}
	
	/**
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return this.titulo;
	}
	/**
	 * 
	 * @param _titulo
	 */
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	/**
	 * 
	 * @return descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}
	/**
	 * 
	 * @param _descricao
	 */
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	/**
	 * 	
	 * @return periodo
	 */
	public Periodo getPeriodo() {
		return this.periodo;
	}
	/**
	 * 
	 * @param _periodo
	 */
	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getTitulo());
		builder.append("\n");
		builder.append(getDescricao());
		builder.append("\n");
		builder.append(getPeriodo());
		builder.append("\n");
		return builder.toString();
	}
	
	
}
