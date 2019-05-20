
public class Email {
	private String descEmail;



	public Email(String _descEmail) throws Exception{
		this.setDescEmail(_descEmail);;
	}
	//sobrecarregamento
	public Email() throws Exception{
		this.setDescEmail("Sem email");
	}
	public String getDescEmail() {
		return this.descEmail;
	}

	public void setDescEmail(String _descEmail) throws Exception {

		
		if (_descEmail.indexOf("@") >= 0){
			this.descEmail = _descEmail;
		}
		else {
			throw new Exception ("Faltou o @");
		}

	}
	//sobreposicao
	@Override
	public boolean equals(Object objeto) {
		Email aux = (Email)objeto;
		if( (this.getDescEmail()) == (aux.getDescEmail()))  {
			return true;
		}
		return false;
	}
	//sobreposiçao
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Email [Email=");
		builder.append(this.getDescEmail());
		builder.append("]");
		return builder.toString();
	}

}
