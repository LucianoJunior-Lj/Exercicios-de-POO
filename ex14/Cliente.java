public class Cliente extends Contato{
	private String endereço, celular;
	static final double DEFAULT_RENDAFAMILIAR = 2000.0;
	static private double rendaFamiliar = Cliente.DEFAULT_RENDAFAMILIAR;

	public Cliente(String _descEmail, String _nome, String _celular, String _endereço) throws Exception {
		super(_descEmail, _nome);
		this.setCelular(_celular);
		this.setEndereço(_endereço);
	}

	public Cliente(String _nome, String celular, String endereço) throws Exception {
		super(_nome);
		this.celular = celular;
		this.endereço = endereço;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String _celular) {
		this.celular = _celular;
	}

	public String getEndereço() {
		return this.endereço;
	}

	public void setEndereço(String _endereço) {
		this.endereço = _endereço;
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
			(this.getCelular() == aux.getCelular()) && (this.getEndereço() == aux.getEndereço())){
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
		dados.append("Endereço: ");
		dados.append(this.getEndereço());
		return dados.toString();
	}


}