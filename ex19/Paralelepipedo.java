
public class Paralelepipedo implements ObjetoTridimensional {
	private Ponto3D esquerdoSuperiorFrente, direitoInferiorFundo;
	
	public Paralelepipedo(Ponto3D _esquerdoSuperiorFrente, Ponto3D _direitoInferiorFundo) {
		this.setEsquerdoSuperiorFrente(_esquerdoSuperiorFrente);
		this.setDireitoInferiorFundo(_direitoInferiorFundo);
	}
	
	public Ponto3D getEsquerdoSuperiorFrente() {
		return this.esquerdoSuperiorFrente;
	}

	public void setEsquerdoSuperiorFrente(Ponto3D _esquerdoSuperiorFrente) {
		this.esquerdoSuperiorFrente = _esquerdoSuperiorFrente;
	}

	public Ponto3D getDireitoInferiorFundo() {
		return this.direitoInferiorFundo;
	}

	public void setDireitoInferiorFundo(Ponto3D _direitoInferiorFundo) {
		this.direitoInferiorFundo = _direitoInferiorFundo;
	}
	
	public double ladoX() {
		return this.getDireitoInferiorFundo().getX() - this.getEsquerdoSuperiorFrente().getX();
	}

	public double ladoY() {
		return this.getEsquerdoSuperiorFrente().getY() - this.getDireitoInferiorFundo().getY();
	}
	
	public double ladoZ() {
		return this.getDireitoInferiorFundo().getZ() - this.getEsquerdoSuperiorFrente().getZ();
	}

	@Override
	public Ponto3D centro() throws Exception {
		Ponto3D centro = new Ponto3D(this.ladoX() / 2, this.ladoY() / 2, this.ladoZ() / 2);
		return centro;
	}

	@Override
	public double calculaSuperficie() {
		return 2 * (this.ladoX() * this.ladoY() + this.ladoY() * this.ladoZ() + this.ladoX() * this.ladoZ());
	}

	@Override
	public double calculaVolume() {
		return this.ladoX() * this.ladoY() * this.ladoZ();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paralelepipedo [esquerdoSuperiorFrente=");
		builder.append(this.getEsquerdoSuperiorFrente());
		builder.append(", direitoInferiorFundo=");
		builder.append(this.getDireitoInferiorFundo());
		builder.append("]");
		return builder.toString();
	}
	
}
