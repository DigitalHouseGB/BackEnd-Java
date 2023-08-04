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
        hotel = new Hotel(LocalDate.of(2023, 8, 20), LocalDate.of(2023, 8, 30), "SAO_PAULO");
        voos = new Voos("LINS", LocalDate.of(2023, 8, 20), LocalDate.of(2023, 8, 30), "SAO_PAULO");

    }
    @Test
    void dadoUmHotelEumVoo_quandoChamamosBuscaHotelVoo_entaoRetornaQueDestinoEstaOK(){
            IFacadeBuscaHotelVoo iFacadeBuscaHotelVoo = new FacadeBuscaHotelmpl();
            iFacadeBuscaHotelVoo.buscaHotelVoo(hotel,voos);
        }

}
