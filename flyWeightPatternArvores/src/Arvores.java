public class Arvores {
    private Integer altura;
    private Integer largura;
    private String cor;
    private static Integer id;

    public Arvores(Integer altura, Integer largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.id = Arvores.id+1;
        id++;
    }
//    public static int contador;

//    public Computador(int ram, int hd) {
//        this.ram = ram;
//        this.hd = hd;
////        contador = Computador.contador + 1;
//        contador++;
//        System.out.println("contador: " + Computador.contador);
//    }
    public Integer getAltura() {
        return Altura;
    }
    public void setAltura(Integer altura) {
        Altura = altura;
    }
    public Integer getLargura() {
        return Largura;
    }
    public Integer getId() {
        return id;
    }
    public Integer setId() {
        return id;
    }
    public void setLargura(Integer largura) {
        Largura = largura;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
