public class ServicoProxyDownload implements IDownload{

    @Override
    public void download(Integer id, String tipoUsuario) {
        if (tipoUsuario.equals("Premium")){
            System.out.println(
                    """
                     Usuario %s do Id: %s está autorizado a baixar músicas.
                 """.formatted(tipoUsuario,id)
            );
        }else if(tipoUsuario.equals("Free")){
            System.out.println(
                    """
                         Usuario %s do Id: %s não está autorizado a baixar músicas.
                     """.formatted(tipoUsuario,id)
            );
        }
    }
}
