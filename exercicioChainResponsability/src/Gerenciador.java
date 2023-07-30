public abstract class Gerenciador {
    protected Gerenciador gerenciadorSeguinte;

    public Gerenciador setGerenciadorSeguinte(Gerenciador gerenciadorSeguinte) {
        this.gerenciadorSeguinte = gerenciadorSeguinte;
        return this;
    }

    public abstract void verificar(Produto produto);
}
