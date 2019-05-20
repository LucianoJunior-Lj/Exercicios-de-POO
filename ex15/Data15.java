import java.util.Date;

public class Data15 extends Date {

	private static final long serialVersionUID = 6299565376922637204L;
	@SuppressWarnings("deprecation")
	public void setMonth(String _mes) {
		_mes = _mes.toLowerCase();

		if(_mes.equals("janeiro")) 
			this.setMonth(1);
		if(_mes.equals("fevereiro")) 
			this.setMonth(2);
		if(_mes.equals("março")) 
			this.setMonth(3);
		if(_mes.equals("abril")) 
			this.setMonth(4);
		if(_mes.equals("maio")) 
			this.setMonth(5);
		if(_mes.equals("junho")) 
			this.setMonth(6);
		if(_mes.equals("julho")) 
			this.setMonth(7);
		if(_mes.equals("agosto")) 
			this.setMonth(8);
		if(_mes.equals("setembro")) 
			this.setMonth(9);
		if(_mes.equals("outubro")) 
			this.setMonth(10);
		if(_mes.equals("novembro")) 
			this.setMonth(11);
		if(_mes.equals("dezembro")) 
			this.setMonth(12);
	}
	
	@SuppressWarnings("deprecation")
	public int getMonth() {
		return super.getMonth() + 1;
	}
	
	public long quantidadeDias(Data _aux) {
		long quantidade = 0;
		quantidade = ((this.getTime() - _aux.getTime()) / (1000 * 60 * 24));
		
		// Caso a quantidade de dias seja negativa, calcular o valor absoluto
		if (quantidade < 0)
			quantidade = (-1) * quantidade;
		return quantidade;

	}

	public void incrementa(long _milisegundos) {
		long dias;
		dias = this.getTime() + _milisegundos;
		this.setTime(dias);
	}
	
	public void incrementa(int dias) {
		long milisegundos = dias * 1000 * 60 * 24;
		
		this.incrementa(milisegundos);
	}

}