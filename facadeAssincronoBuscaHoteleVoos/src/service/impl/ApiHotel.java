package service.impl;

import model.ENumHotel;
import model.Hotel;
import model.Voos;
import org.apache.log4j.Logger;

import java.time.LocalDate;

public class ApiHotel {
    private static final Logger logger = Logger.getLogger(ApiHotel.class);
//    public String buscaHotelVoo(Hotel hotel, Voos voos){
//        if(hotel.getCidade().equals(voos.getDestino())){
//            logger.info("Há voos e hoteis disponiveis nessa mesma cidade");
//        }
//        return null;
//    }
    public String buscaHotel(Hotel hotel){
        LocalDate dataEntrada = LocalDate.now().withMonth(8);
        LocalDate dataSaida = LocalDate.now().withMonth(8);
        if(hotel.getCidade().equals(ENumHotel.SAO_PAULO) && hotel.getDataEntrada().equals(dataEntrada) && hotel.getDataSaida().equals(dataSaida)){
            logger.info("Há hoteis em "+ENumHotel.SAO_PAULO + " disponiveis para entrar no mes " + dataEntrada + " e sair mês "+ dataSaida);
        } else if (hotel.getCidade().equals(ENumHotel.PIAUI) && hotel.getDataEntrada().equals(dataEntrada) && hotel.getDataSaida().equals(dataSaida)) {
            logger.info("Há hoteis em "+ENumHotel.PIAUI + " disponiveis para entrar no mes " + dataEntrada + " e sair mês "+ dataSaida);
        } else if (hotel.getCidade().equals(ENumHotel.RIO_DE_JANEIRO) && hotel.getDataEntrada().equals(dataEntrada) && hotel.getDataSaida().equals(dataSaida)){
            logger.info("Há hoteis em "+ENumHotel.RIO_DE_JANEIRO + " disponiveis para entrar no mes " + dataEntrada + " e sair mês "+ dataSaida);
        }
        return null;
    }

}
