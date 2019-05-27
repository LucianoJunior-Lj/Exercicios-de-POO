
public class Ponto3D extends Ponto {
	private double z;

	public Ponto3D(double _z) throws Exception {
		super();
		this.z = _z;
	}
	
	public Ponto3D(double _x, double _y, double _z) throws Exception {
		super(_x, _y);
		this.z = _z;
	}
	
	public Ponto3D() throws Exception {
		super();
	}


	public double getZ() {
		return this.z;
	}

	public void setZ(double _z) {
		if (Ponto.isLimite(_z))
			this.z = _z;
	}
	

	public Ponto3D clonar() throws Exception {
		return new Ponto3D(this.getX(), this.getY(), this.getZ());
	}
	
	public Ponto3D criaSwap() throws Exception {
		return new Ponto3D(this.getY(), this.getX(), this.getZ());
	}
	
	public boolean temEixoComum(Ponto3D _ponto){
		if (super.temEixoComum(_ponto))
			return this.getZ() == _ponto.getZ();
		return false;
	}
	
	static public double distancia(double x1, double y1, double z1, double x2, double y2, double z2){
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2) + Math.pow((z1 - z2), 2));
	}
	
	public double distancia(Ponto3D _ponto){
		return Ponto3D.distancia(this.getX(), this.getY(), this.getZ(), _ponto.getX(), _ponto.getY(), _ponto.getZ());
	}
	
	public double distancia(double _x, double _y, double _z){
		return Ponto3D.distancia(this.getX(),this.getY(), this.getZ(), _x, _y, _z);
	}

	public double distanciaDaOrigem(){
		return Ponto3D.distancia(this.getX(), this.getY(), this.getZ(), 0, 0, 0);
	}

	public int compareTo(Ponto3D _ponto){
		if (this.distanciaDaOrigem() > _ponto.distanciaDaOrigem())
			return 1;
		else if(this.distanciaDaOrigem() < _ponto.distanciaDaOrigem())
			return -1;
		else
			return 0;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Ponto3D other = (Ponto3D) obj;
		if (super.equals(obj))
			if (Double.doubleToLongBits(this.getZ()) != Double.doubleToLongBits(other.getZ()))
				return false;
		return true;
	}

	public String toString(){
		StringBuilder coord = new StringBuilder();
		coord.append("(");
		coord.append(this.getX());
		coord.append(",");
		coord.append(this.getY());
		coord.append(",");
		coord.append(this.getZ());
		coord.append(")");
		return coord.toString();
	}
}
	
	

