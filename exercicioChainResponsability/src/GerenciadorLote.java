public class GerenciadorLote extends Gerenciador{
    @Override
    public void verificar(Produto produto) {
        if (produto.getLote() >= 1000){
            this.gerenciadorSeguinte.verificar(produto);
        }else{
            System.out.println("Lote fora dos padrões aceitos !!");
        }
    }
}
