public class Ponto {
	private double x;
	private double y;

	private final static double LIMTEINFERIOR = 0;
	private final static double LIMITESUPERIOR = 500;
	private static double limiteInf = Ponto.LIMTEINFERIOR;
	private static double limiteSup = Ponto.LIMITESUPERIOR;

	public Ponto() throws Exception{
		this.setPonto(0,0);
	}

	public Ponto(double _x, double _y) throws Exception{
		this.setPonto(_x, _y);
	}

	public Ponto(String ponto) throws Exception	{
		this.setPontoString(ponto);
	}
	
	public double getY()	{
		return this.y;
	}
	public void setY(double _y) throws Exception {
		if(_y >= Ponto.limiteInf && _y <= Ponto.limiteSup)
			this.y = _y;
		else
			throw new Exception("Fora do limite!");
	}
	
	public double getX(){
		return this.x;
	}

	public void setX(double _x) throws Exception {
		if(_x >= Ponto.limiteInf && _x <= Ponto.limiteSup)
			this.x = _x;
		else
			throw new Exception("Fora do limite!");
	}

	public void setPonto(double _x, double _y) throws Exception	{
		this.setX(_x);
		this.setY(_y);
	}

	public void setPontoString(String _ponto) throws Exception	{
		if (_ponto.indexOf("(") == 0){
			this.x = Double.parseDouble(_ponto.substring(1, _ponto.indexOf(",")));
			this.y = Double.parseDouble(_ponto.substring(_ponto.indexOf(",")));
		}
		else if (_ponto.indexOf("(") == -1)	{
			this.x = Double.parseDouble(_ponto.substring(0, _ponto.indexOf(",")));
			this.y = Double.parseDouble(_ponto.substring(_ponto.indexOf(",")));
		}

		this.setPonto(x,y);
	}

	public static void setLimiteInf(double l){
		Ponto.limiteInf = l;
	}

	public static void setLimiteSup(double l){
		Ponto.limiteSup = l;
	}

	public Ponto clonar(double x, double y) throws Exception{
		Ponto clone = new Ponto(this.x, this.y);
		return clone;
	}

	public Ponto criaSwap(double x, double y) throws Exception{
		Ponto inverso = new Ponto(this.y, this.x);
		return inverso;
	}

	public boolean temEixoComum(Ponto aux){
		if(this.getX() == aux.getX()) {
			return true;
		}
		else if (this.getY() == aux.getY()) {
			return true;
		}

		return false;
	}

	public double distancia(Ponto aux) {
		double d = 0;
		d = Math.sqrt((this.getX()-aux.getX())*(this.getX()-aux.getX())+(this.getY()-aux.getY())*(this.getY()-aux.getY()));

		return d;
	}

	public double distancia(double _x, double _y) throws Exception {
		Ponto aux = new Ponto(_x,_y);
		double d = 0;

		d = this.distancia(aux);

		return d;
	}

	public double distancia(double _x, double _y, double auxX, double auxY) throws Exception {
		Ponto aux1 = new Ponto(_x,_y);
		Ponto aux2 = new Ponto(auxX,auxY);

		double d = 0;

		d = aux1.distancia(aux2);

		return d;
	}

	public double distancia(Ponto aux, Ponto aux2) {
		double d = 0;

		d = aux.distancia(aux2);

		return d;
	}

	public double distanciaDaOrigem () throws Exception {
		double d = 0;

		// Utiliza o metodo distancia para calcular a distancia do ponto a origem (0,0)
		d = this.distancia(0, 0);

		return d;
	}

	public int compareTo(Ponto aux) throws Exception {
		if (this.distanciaDaOrigem() > aux.distanciaDaOrigem()) {
			return -1;
		} 
		else if (this.distanciaDaOrigem() == aux.distanciaDaOrigem()) {
			return 0;
		} 
		else {
			return 1;
		}
	}
	
	public boolean equals(Ponto _aux) {
		if ((this.getX() == _aux.getX()) && (this.getY() == _aux.getY())) {
			return true;
		}
		return false;
	}
	
	public String toString()	{
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.x);
		dados.append(",");
		dados.append(this.y);
		dados.append(")");
		return dados.toString();
	}


}