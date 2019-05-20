public class Cliente extends Contato{
	private String endere�o, celular;
	static final double DEFAULT_RENDAFAMILIAR = 2000.0;
	static private double rendaFamiliar = Cliente.DEFAULT_RENDAFAMILIAR;

	public Cliente(String _descEmail, String _nome, String _celular, String _endere�o) throws Exception {
		super(_descEmail, _nome);
		this.setCelular(_celular);
		this.setEndere�o(_endere�o);
	}

	public Cliente(String _nome, String celular, String endere�o) throws Exception {
		super(_nome);
		this.celular = celular;
		this.endere�o = endere�o;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String _celular) {
		this.celular = _celular;
	}

	public String getEndere�o() {
		return this.endere�o;
	}

	public void setEndere�o(String _endere�o) {
		this.endere�o = _endere�o;
	}

	public static double getRendaFamiliar() {
		return rendaFamiliar;
	}

	public static void setRendaFamiliar(double _rendaFamiliar) {
		Cliente.rendaFamiliar = _rendaFamiliar;
	}

	public String categoriaCliente(double _renda){
		String categoria;
		if(_renda < DEFAULT_RENDAFAMILIAR){
			categoria = "usual";
		}else{
			categoria = "top";
		}
		return categoria;
	}
	//sobreposicao
	@Override
	public boolean equals(Object obj) {
		Cliente aux = (Cliente)obj;
		if( (this.getNome() == aux.getNome()) && (this.getDescEmail() == aux.getDescEmail()) &&
			(this.getCelular() == aux.getCelular()) && (this.getEndere�o() == aux.getEndere�o())){
			return true;
		}
		return false;
	}
	//sobreposicao
	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("Celular: ");
		dados.append(this.getCelular());
		dados.append("Endere�o: ");
		dados.append(this.getEndere�o());
		return dados.toString();
	}


}