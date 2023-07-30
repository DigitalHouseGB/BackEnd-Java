public class CheckQuality {
    Gerenciador gerenciador;

    public CheckQuality(){
//        gerenciador = new GerenciadorEmbalagem();
//        Gerenciador lote = new GerenciadorLote();
//        gerenciador.setGerenciadorSeguinte(lote);
//        Gerenciador peso = new GerenciadorPeso();
//        gerenciador.setGerenciadorSeguinte(peso);
        gerenciador = new GerenciadorEmbalagem().setGerenciadorSeguinte(new GerenciadorLote().setGerenciadorSeguinte(new GerenciadorPeso()));
    }
    public void verificar (Produto produto){
        gerenciador.verificar(produto);
    }
}
