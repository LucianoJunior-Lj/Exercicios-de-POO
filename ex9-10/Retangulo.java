public class Retangulo {
	private Ponto esquerdoSuperior, direitoInferior;

	public Retangulo() throws Exception {
		this(new Ponto(), new Ponto());
	}

	public Retangulo(double _x1, double _y1, double _x2, double _y2) throws Exception { 
		this.setEsquerdoSuperior(new Ponto(_x1, _y1));
		this.setDireitoInferior(new Ponto(_x2, _y2));
	}

	public Retangulo(Ponto _esquerdoSuperior, Ponto _direitoInferior) throws Exception {
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
		double comprimento = 0;

		comprimento = this.getDireitoInferior().getX() - this.getEsquerdoSuperior().getX();

		return comprimento;
	}

	public double ladoY() {
		double largura = 0;

		largura = this.getEsquerdoSuperior().getY() - this.getDireitoInferior().getY();

		return largura;
	}

	public double calculaArea() {
		double area = 0;

		area = this.ladoX() * this.ladoY();

		return area;
	}

	public double calculaPerimetro() {
		double perimetro = 0;

		perimetro = (this.ladoX() * 2) + (this.ladoY() * 2);

		return perimetro;
	}

	public boolean equals(Retangulo _aux) {
		if ((this.getEsquerdoSuperior().equals(_aux.getEsquerdoSuperior())) && (this.getDireitoInferior().equals(_aux.getDireitoInferior()))) {
			return true;
		}
		return false;
	}

	public boolean equalsArea (Retangulo _aux) {
		if (this.calculaArea() == _aux.calculaArea()) {
			return true;
		}
		return false;
	}

	public int compareTo(Retangulo _aux) {
		if (this.calculaArea() > _aux.calculaArea()) {
			return -1;
		} 
		else if (this.calculaArea() == _aux.calculaArea()) {
			return 0;
		} 
		else {
			return 1;
		}
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(esquerdoSuperior);
		dados.append(" - ");
		dados.append(direitoInferior);
		return dados.toString();
	}

}