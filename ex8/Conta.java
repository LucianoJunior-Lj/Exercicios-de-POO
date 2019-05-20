//Referente ao exercicio 8
public class Conta {
	private String nome;
	private double saldo;
	public static final double DEFAULT_TAXAJUROS = 0.;
	private static double taxaJuros = Conta.DEFAULT_TAXAJUROS;

	public Conta(String _nome, double _saldo) throws Exception{
		this.setNome(_nome);
		this.setSaldo(_saldo);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double _saldo) throws Exception{
		if(_saldo>=0){
			this.saldo = corrige(_saldo);
		}
		else{
			throw new Exception("Saldo negativo.");
		}
	}
	public static double getTaxaJuros() {
		return Conta.taxaJuros;
	}
	public static void setTaxaJuros(double _taxaJuros) {
		Conta.taxaJuros = _taxaJuros;
	}
	
	public static double corrige(double _saldo){
		double corrige = _saldo - _saldo * Conta.getTaxaJuros();
		return corrige;
	}

	
	public int compareTo(Object obj){
        Conta aux = (Conta) obj;
            if(this.getSaldo() > aux.getSaldo()){
                return 1;
            }else if(this.getSaldo() < aux.getSaldo()){
                return -1;
            }
       return 0; 
    }
	
	@Override
	public boolean equals(Object objeto) {
		Conta aux = (Conta)objeto;
		if( this.getNome() == (aux.getNome()) && this.getSaldo() == (aux.getSaldo()) ) {
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [nome=");
		builder.append(this.getNome());
		builder.append(", saldo=");
		builder.append(this.getSaldo());
		builder.append("]");
		return builder.toString();
	}


}
