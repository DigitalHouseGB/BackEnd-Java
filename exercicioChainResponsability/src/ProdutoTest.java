import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void teste() {
    Produto Nescau = new Produto("Nescau", 1000, 1200, "saudavel");
    CheckQuality checkQuality = new CheckQuality();
    checkQuality.verificar(Nescau);
    }

}