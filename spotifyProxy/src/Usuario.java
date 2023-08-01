
public class Usuario {

    private static int sequence = 0;
    private Integer id;
    private String tipoUsuario;

    public Usuario(String tipoUsuario) {
        this.id = sequence++;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return this.id++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


}
