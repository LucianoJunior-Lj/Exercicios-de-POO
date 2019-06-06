//Referente aos exercicios 2,3,4,6,7
public class Data {
	private int dia, mes, ano;
	
	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}
	public Data(int _dia, String _mesString, int _ano) throws Exception {
		this.setData(_dia, _mesString, _ano);
	}
	public Data(String _dataString) throws Exception {
		this.setData(_dataString);
	}
	public Data() throws Exception {
		this(1, 1, 1900);
	}	
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
	public void setData(int _dia, int _mes, int _ano) throws Exception {
		if(Data.isDataValida(_dia, _mes, _ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		}else {
			throw new Exception("Data invalida.");
		}
	}
	public void setData(int _dia, String _mesString, int _ano) throws Exception {
		int _mes = 0;
		if(_mesString.equals("janeiro")) _mesString = "1" ;
		if(_mesString.contentEquals("fevereiro")) _mesString = "2" ;
		if(_mesString.contentEquals("março")) _mesString = "3";
		if(_mesString.contentEquals("abril")) _mesString = "4";
		if(_mesString.contentEquals("maio")) _mesString = "5";
		if(_mesString.contentEquals("junho")) _mesString = "6";
		if(_mesString.contentEquals("julho")) _mesString = "7";
		if(_mesString.contentEquals("agosto")) _mesString = "8";
		if(_mesString.contentEquals("setembro")) _mesString = "9";
		if(_mesString.contentEquals("outubro")) _mesString = "10";
		if(_mesString.contentEquals("novembro")) _mesString = "11";
		if(_mesString.contentEquals("dezembro")) _mesString = "12";
		_mes = Integer.parseInt(_mesString);
		this.setData(_dia, _mes, _ano);
	}
	public void setData(int _mes, int _ano) throws Exception {
		this.setData(1, _mes, _ano);
	}
	
	public void setData(String dataString) throws Exception {
		int _dia;
		int _mes;
		int _ano;
		int cont;
		cont = dataString.indexOf("/");
		if(cont == 2) {
			_dia = Integer.parseInt(dataString.substring(0,2));
			cont = dataString.indexOf("/",3);	
			if(cont == 4) {
				_mes = Integer.parseInt(dataString.substring(3,4));
				_ano = Integer.parseInt(dataString.substring(5,9));
			}else {		
				_mes = Integer.parseInt(dataString.substring(3,5));
				_ano = Integer.parseInt(dataString.substring(6,10));
			}
		
		}else {
			_dia = Integer.parseInt(dataString.substring(0,1));
			cont = dataString.indexOf("/",2);
			
			if(cont == 3) {
				_mes = Integer.parseInt(dataString.substring(2,3));
				_ano = Integer.parseInt(dataString.substring(4,8));
			}else {		
				_mes = Integer.parseInt(dataString.substring(2,4));
				_ano = Integer.parseInt(dataString.substring(5,9));
			}
		}	
		this.setData(_dia,_mes,_ano);
	}
	
	public static boolean isBissexto(int a) {
		if(a % 4 == 0) {
			if(a % 100 != 0) return true;
			else {
				if(a % 400 == 0) return true;
			}
		}
		return false;
	}
	public boolean isBissexto() {
		if(this.getAno() % 4 == 0) {
			if(this.getAno() % 100 != 0) return true;
			else {
				if(this.getAno() % 400 == 0) return true;
			}
		}
		return false;
	}
	
	public static boolean isDataValida(int d, int m, int a) {
		if(d < 1 || d > 31) return false;
		
		if(m < 1 || m > 12) return false;
			
		if(a < 1582) return false;
		
		if((m == 4 || m == 6 || m == 9 || m == 11) && (d > 30)) return false;
		
		if(m == 2 && d >= 29) {
			if(d > 29) return false;
			if( Data.isBissexto(a) == false ) return false;
		}
		return true;
	}
	
	public boolean equals(Object objeto) {
		Data aux = (Data)objeto;
		if( this.getDia() == (aux.getDia()) &&
				this.getMes() == (aux.getMes()) &&
				this.getAno() == (aux.getAno()) ) {
			return true;
		}
		return false;
	}
	public int compareTo(Data date2) throws Exception {
		if( this.getAno() > date2.getAno() ) {
			return 1;
		}
		if( this.getAno() < date2.getAno() ) {
			return -1;
		}
		else {
			if( this.getMes() > date2.getMes() ) {
				return 1;
			}
			if( this.getMes() < date2.getMes() ) {
				return -1;
			}
			else {
				if(this.getDia() > date2.getDia()) {
					return 1;
				}
				if(this.getDia() < date2.getDia()) {
					return -1;
				}
			}
		}
		return 0;
	}
		
	
	public void incrementa() {	
		try{
			this.setData(getDia() + 1, getMes(), getAno());
		}
		catch(Exception dia){
			try{
				this.setData(1, getMes() + 1, getAno());
			}
			catch(Exception mes){
				try {
					this.setData(1, 1, getAno() + 1);
				}
				catch(Exception ano) {
				}
			}
		}
		return;
	}
	
	public void incrementa(int n) {	
		try{
			this.setData(getDia() + n, getMes(), getAno());
		}
		catch(Exception dia){
			try{
				this.setData(n , getMes() + 1, getAno());
			}
			catch(Exception mes){
				try {
					this.setData(n , 1, getAno() + 1);
				}
				catch(Exception ano) {
				}
			}
		}
		return;
	}
	
	public static Data verificaECriaData(int d, int m, int a) throws Exception {
		Data data;
		try{
			data = new Data(d,m,a);
		}
		catch(Exception e){
			return null;
		}
		return data;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}	
}