public class Quadrado extends Figura{
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Quadrado(String forma, Double lado) {
        super(forma);
        this.lado = lado;
    }

    @Override
    Double calcularPerimetro() {
        Double perimetro = 4*this.lado;
        System.out.println(Math.round(perimetro*100.0) / 100.0);
        return perimetro;
    }
}
