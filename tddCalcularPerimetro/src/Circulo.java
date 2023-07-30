public class Circulo extends Figura{
    private Integer raio;

    public Integer getRaio() {
        return raio;
    }

    public void setRaio(Integer raio) {
        this.raio = raio;
    }

    public Circulo(String forma, Integer raio) {
        super(forma);
        this.raio = raio;
    }

    @Override
    Double calcularPerimetro() {
        Double perimetro = 2*Math.PI*this.raio;
        System.out.println(Math.round(perimetro*100.0) / 100.0);
        return perimetro;
    }
}
