package test;

import model.ENumHotel;
import model.Hotel;
import model.Voos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.IFacadeBuscaHotelVoo;
import service.impl.FacadeBuscaHotelmpl;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IBuscaHotelVooTest {
    private Hotel hotel;
    private Voos voos;
    @BeforeEach
    void setup() {
        hotel = new Hotel("AGO.", "AGO.", ENumHotel.SAO_PAULO);
        voos = new Voos(ENumHotel.RIO_DE_JANEIRO, "AGO.", "AGO.", ENumHotel.SAO_PAULO);

    }
    @Test
    void dadoUmHotelEumVoo_quandoChamamosBuscaHotelVoo_entaoRetornaQueDestinoEstaOK(){
            IFacadeBuscaHotelVoo iFacadeBuscaHotelVoo = new FacadeBuscaHotelmpl();
            iFacadeBuscaHotelVoo.buscaHotelVoo(hotel,voos);
        }

}
