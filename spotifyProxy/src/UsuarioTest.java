import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    void dadoUmUsuario_QuandoNaoSabeSeuPlano_EntaoRetornePlano(){
        Usuario usuarioFree = new Usuario("Free");
        Usuario usuarioPremium = new Usuario("Premium");
        Usuario usuarioPremium2 = new Usuario("Premium");
        ServicoDownload servicoDownload= new ServicoDownload();
        ServicoProxyDownload servicoProxyDownload= new ServicoProxyDownload();

        servicoDownload.download(usuarioFree.getId(),usuarioFree.getTipoUsuario());
        servicoProxyDownload.download(usuarioFree.getId(),usuarioFree.getTipoUsuario());
        servicoProxyDownload.download(usuarioPremium.getId(),usuarioPremium.getTipoUsuario());
        servicoProxyDownload.download(usuarioPremium2.getId(),usuarioPremium2.getTipoUsuario());
    };


}