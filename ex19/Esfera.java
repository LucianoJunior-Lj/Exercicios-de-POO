
public class Esfera implements ObjetoTridimensional{
	
	private double raio;
    private Ponto3D centro;

    public Esfera(double _raio, Ponto3D _centro) {
        this.setRaio(_raio);
        this.setCentro(_centro);
    }
    
	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double _raio) {
		this.raio = _raio;
	}

	public Ponto3D getCentro() {
		return this.centro;
	}

	public void setCentro(Ponto3D _centro) {
		this.centro = _centro;
	}

	
	@Override
	public Ponto3D centro() {
		return this.centro;
	}

	
	@Override
	public double calculaSuperficie() {
        return 4 * Math.PI * Math.pow(this.getRaio(), 2);
	}

	
	@Override
	public double calculaVolume() {
        return (4 / 3)* (Math.PI * Math.pow(this.getRaio(), 3));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Esfera [raio=");
		builder.append(this.getRaio());
		builder.append(", centro=");
		builder.append(this.getCentro());
		builder.append("]");
		return builder.toString();
	}
	
	

}
