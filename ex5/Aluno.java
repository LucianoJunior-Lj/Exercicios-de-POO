//Referente ao exercicio 5
public class Aluno {
	private String nome ;
	private double nota1 , nota2 , media , pontos;
	public static final double DEFAULT_LIMITE = 10.0;
	private static double notaLimite = Aluno.DEFAULT_LIMITE;
	// quatro construtores sobrecarregados
	public Aluno(String _nome, double _nota1, double _nota2, double _pontos) {
		this .setNome(_nome);
		this .setNotas(_nota1, _nota2, _pontos);
	}
	public Aluno( double _nota1, double _nota2, double _pontos) {
		this ( "sem nome" , _nota1, _nota2, _pontos);
	}
	public Aluno( double _nota1, double _nota2) {
		this (_nota1, _nota2, 0.0);
	}
	public Aluno() {
		this (0.0,0.0);
	}
	// métodos de interface para acesso aos campos privados
	public String getNome() {
		return this.nome ;
	}
	public void setNome(String _nome) {
		this . nome = _nome;
	}
	public double getNota1() {
		return this . nota1 ;
	}
	public double getNota2() {
		return this . nota2 ;
	}
	public double getMedia() {
		return this . media ;
	}
	public double getPontos() {
		return this . pontos ;
	}
	public void setPontos( double _pontos) {
		this . pontos = _pontos;
		this .calculaMedia(Aluno.notaLimite);
	}
	public static double getNotaLimite() {
		return Aluno.notaLimite;
	}
	public static void setNotaLimite( double _notaLimite) {
		Aluno.notaLimite = _notaLimite;
	}
	// tratamento de erro ainda inadequado, será melhorado mais adiante
	public boolean setNotas( double _nota1, double _nota2, double _pontos) {
		this . pontos = _pontos;
		if (_nota1>=0 && _nota1<=10 && _nota2>=0 && _nota2<=10) {
			this . nota1 = _nota1;
			this . nota2 = _nota2;
			this .calculaMedia(Aluno.notaLimite);
			return true ;
		}
		else
			return false ;
	}
	public void setNotas( double _nota1, double _nota2) {
		this .setNotas(_nota1, _nota2, 0);
	}
	// método para calcular a média. Privado pois o uso é apenas interno a classe
	private double calculaMedia() {
		this . media = ( this .getNota1() + this .getNota2() + this .getPontos())/2;
		return this . media ;
	}
	// sobrecarregamento do cálculo da média para limitar o valor máximo
	private double calculaMedia( double _limite) {
		this .calculaMedia();
		if (isNotaMaiorLimite(this.media))
			this.media = _limite;
		return this.media ;
	}
	static public boolean isNotaMaiorLimite( double _media) {
		if (_media > Aluno.notaLimite )
			return true ;
		else
			return false ;
	}
	// não é adequado que o método toString exiba mensagens, pois
	// é comum considerar que o programador de classes não conhece o usuário final
	// Evita-se também textos retornados, escritos em uma determinada língua.
	public String toString(){
		return this .getNome()+ ";"
				+ this .getNota1()+ ";"
				+ this .getNota2()+ ";"
				+ this .getPontos()+ ";"
				+ this .getMedia();
	}
}
