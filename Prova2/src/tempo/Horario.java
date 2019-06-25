package tempo;

import java.io.Serializable;

/**Classe para manipulaçao do horario
 * 
 * @author Luciano A S Junior
 * @version 1.0(junho-2019)
 *
 */
public class Horario implements Serializable {
	private int horas, minutos;
	
	/**
	 * Construtor vazio
	 * @throws Exception
	 */
	public Horario() throws Exception {
		this(0,0);
	}
	
	/**
	 * @param _hora
	 * @throws Exception 
	 */
	public Horario(int _horas) throws Exception {
		this.setHorario(_horas, 0);
	}
	
	/**
	 * Construtor com o horario em String
	 * @param _horario
	 * @throws Exception 
	 */
	public Horario(String _horario) throws Exception {
		this.setHorario(_horario);
	}
	
	/**
	 * Construtor Completo 
	 * @param _hora
	 * @param _minuto
	 * @throws Exception 
	 */
	public Horario(int _horas, int _minutos) throws Exception {
		setHorario(_horas, _minutos);
	}
	/**
	 * 
	 * @return horas
	 */
	public int getHoras() {
		return this.horas;
	}
	
	/**
	 * 
	 * @param _horas: entre 0 e 23
	 * @throws Exception
	 */
	public void setHora(int _horas) throws Exception {
		if (_horas >= 0 && _horas < 24) {
			this.horas = _horas;
		}
		else {
			throw new Exception("Horas invalida");
		}
		
	}
	/**
	 * 
	 * @return minutos
	 */
	public int getMinutos() {
		return this.minutos;
	}
	/**
	 * 
	 * @param _minutos: entre 0 e 60
	 * @throws Exception
	 */
	public void setMinutos(int _minutos) throws Exception {
		if (_minutos >= 0 && _minutos < 60) {
			this.minutos = _minutos;
		}
		else {
			throw new Exception("Minutos invalido");
		}
	}
	
	/**
	 * 
	 * @param _horas
	 * @param _minutos
	 * @throws Exception
	 */
	public void setHorario(int _horas, int _minutos) throws Exception{
		this.setHora(_horas);
		this.setMinutos(_minutos);
	}
	
	/**
	 * 
	 * @param _horario
	 * @throws Exception
	 */
	public void setHorario(String _horario) throws Exception{
		String[] stringHorario = _horario.split(":");
		int _horas, _minutos;
		_horas = Integer.parseInt(stringHorario[0]);
		_minutos = Integer.parseInt(stringHorario[1]);
		
		this.setHorario(_horas, _minutos);
	}
	
	/**
	 * compara dois horarios, verificando o maior
	 * @param horario2
	 * @return
	 */
	public int compareTo(Horario horario2) {
		if (this.getHoras() > horario2.getHoras()) {
			return 1;
		}
		else if (this.getHoras() < horario2.getHoras()) {
			return -1;
		}
		else {
			if (this.getMinutos() > horario2.getMinutos()) {
				return 1;
			}
			else if (this.getMinutos() < horario2.getMinutos()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	
	/**
	 * verifica se objetos sao iguais
	 * @return boolean 
	 */
	public boolean equals(Object objeto) {
		Horario aux = (Horario)objeto;
		if (this.getHoras() == aux.getHoras() &&
				this.getMinutos() == aux.getMinutos()) {
			return true;
		}
		return false;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getHoras());
		builder.append(":");
		builder.append(this.getMinutos());
		return builder.toString();
	}
	
}
