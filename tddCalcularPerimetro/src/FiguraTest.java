import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    @Test
    void calculaPerimetro() {
    Circulo circulo = new Circulo("circulo", 10);
    Quadrado quadrado = new Quadrado("quadrado", 10D);
    circulo.calcularPerimetro();
    quadrado.calcularPerimetro();
    }
}