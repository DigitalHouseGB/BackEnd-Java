public class GerenciadorEmbalagem extends Gerenciador{

    @Override
    public void verificar(Produto produto) {
        if (produto.getEmbalagem().equals("saudavel") || produto.getEmbalagem().equals("quase saudavel")){
            this.gerenciadorSeguinte.verificar(produto);
        }else{
            System.out.println("Embalagem fora dos padrões aceitos !!");
        }
    }
}
