
public class Contato extends Email{
	private String nome;

	public Contato(String _descEmail, String _nome) throws Exception{
		super(_descEmail);
		this.setNome(_nome);
	}
	//sobrecarregamento
	public Contato(String _nome) throws Exception{
		super();
		this.setNome(_nome);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}
	//sobrecarregamento
	@Override
	public boolean equals(Object objeto) {
		Contato aux = (Contato)objeto;
		if( (this.getNome() == aux.getNome()) && (this.getDescEmail() == aux.getDescEmail()))  {
			return true;
		}
		return false;
	}
	//sobreposicao
	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Contato: ");
		dados.append(this.getNome());
		dados.append(super.toString());
		return dados.toString();
	}

}

