public class GerenciadorPeso extends Gerenciador{
    @Override
    public void verificar(Produto produto) {
        if (produto.getPeso() >= 1200 && produto.getPeso() <= 1300){
            System.out.println("Produto aceito");
        }else{
            System.out.println("Peso fora dos padrões aceitos !!");
        }
    }
}
