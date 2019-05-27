public class CilindroEscalavel implements ObjetoTridimensional,Escalavel{
    private double raio, altura;
    private Ponto3D centroBase;

    public CilindroEscalavel(Ponto3D ponto, double _raio) throws Exception{
        this.altura = ponto.getZ();
        this.centroBase = ponto;
        this.raio = _raio;
    }  
    
    
    @Override
    public Ponto3D centro() throws Exception{
        Ponto3D centro = new Ponto3D(this.centroBase.getX(), this.centroBase.getY(),this.altura/2);
        return centro;
    }

    @Override
    public double calculaSuperficie() {
        double areaSuperficie = 2*(Math.PI*this.raio*this.raio)+(this.altura*2*Math.PI*this.raio);
        return areaSuperficie;
    }

    @Override
    public double calculaVolume() {
        double volume = Math.PI*this.raio*this.raio*this.altura;
        return volume;
    }

    @Override
    public void amplia(double escala) throws Exception {
        this.altura *= escala;
        this.raio *= escala;
    }

    @Override
    public void espelha() throws Exception {
        this.centroBase = new Ponto3D(this.centroBase.getX()*(-1),this.centroBase.getY(),this.altura);
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("CilindroEscalavel{ raio= ");
        dados.append(this.raio);
        dados.append(", altura= ");
        dados.append(this.altura);
        dados.append(", centroBase= ");
        dados.append(this.centroBase);
        dados.append(" }");
        return dados.toString();
    }

}
