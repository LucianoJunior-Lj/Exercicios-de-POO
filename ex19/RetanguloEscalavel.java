
public class RetanguloEscalavel implements ObjetoGeometrico,Escalavel {
	
	private Ponto esquerdoSuperior, direitoInferior;
	
	public RetanguloEscalavel(double _x1, double _y1, double _x2, double _y2) throws Exception { 
		this.setEsquerdoSuperior(new Ponto(_x1, _y1));
		this.setDireitoInferior(new Ponto(_x2, _y2));
	}
	public RetanguloEscalavel(Ponto _esquerdoSuperior, Ponto _direitoInferior) throws Exception {
		this.setEsquerdoSuperior(_esquerdoSuperior);
		this.setDireitoInferior(_direitoInferior);
	}
	
	public Ponto getEsquerdoSuperior() {
		return this.esquerdoSuperior;
	}

	public void setEsquerdoSuperior(Ponto _esquerdoSuperior) {
		this.esquerdoSuperior = _esquerdoSuperior;
	}

	public Ponto getDireitoInferior() {
		return this.direitoInferior;
	}

	public void setDireitoInferior(Ponto _direitoInferior) {
		this.direitoInferior = _direitoInferior;
	}
	
	public double ladoX() {
		return this.getDireitoInferior().getX() - this.getEsquerdoSuperior().getX();
	}

	public double ladoY() {
		return this.getEsquerdoSuperior().getY() - this.getDireitoInferior().getY();
	}

	
	public void amplia(double escala) throws Exception  {
		this.esquerdoSuperior.setY(escala + this.esquerdoSuperior.getY());
		this.direitoInferior.setY(escala + this.direitoInferior.getX()); 
		
	}

	
	public void espelha() throws Exception {
		this.setDireitoInferior(new Ponto(getDireitoInferior().getX() * (-1), getDireitoInferior().getY()));
		this.setEsquerdoSuperior(new Ponto(getEsquerdoSuperior().getX() * (-1), getEsquerdoSuperior().getY()));	
		
	}

	
	public Ponto centro() throws Exception  {
		Ponto centro = new Ponto(this.ladoX() / 2, this.ladoY() / 2);
		return centro;
	}

	
	public double calculaÁrea() {
		return this.ladoX() * this.ladoY();
	}

	
	public double calculaPerímetro() {
		return (this.ladoX() * 2) + (this.ladoY() * 2);
	}
	
	@Override
	public ObjetoGeometrico clona() throws Exception {
		RetanguloEscalavel clone = new RetanguloEscalavel(this.getEsquerdoSuperior(), this.getDireitoInferior());
		return clone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RetanguloEscalavel [esquerdoSuperior =");
		builder.append(this.getEsquerdoSuperior());
		builder.append(", direitoInferior=");
		builder.append(this.getDireitoInferior());
		builder.append("]");
		return builder.toString();
	}
		
}
