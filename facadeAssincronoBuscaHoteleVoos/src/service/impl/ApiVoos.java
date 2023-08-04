package service.impl;
import model.ENumHotel;
import model.Hotel;
import model.Voos;
import org.apache.log4j.Logger;

import java.time.LocalDate;
public class ApiVoos {
    private static final Logger logger = Logger.getLogger(ApiHotel.class);
    public String buscaVoo(Voos voos) {
        LocalDate dataPartida = LocalDate.now().withMonth(8);
        LocalDate dataRetoro = LocalDate.now().withMonth(8);
    if (voos.getDestino().equals(ENumHotel.SAO_PAULO) && voos.getDataPartida().equals(dataPartida) && voos.getDataRetorno().equals(dataRetoro)){
        logger.info("Há voos para "+ENumHotel.SAO_PAULO + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
    } else if (voos.getDestino().equals(ENumHotel.RIO_DE_JANEIRO) && voos.getDataPartida().equals(dataPartida) && voos.getDataRetorno().equals(dataRetoro)) {
        logger.info("Há voos para "+ENumHotel.RIO_DE_JANEIRO + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
    } else if (voos.getDestino().equals(ENumHotel.PIAUI) && voos.getDataPartida().equals(dataPartida) && voos.getDataRetorno().equals(dataRetoro)) {
        logger.info("Há voos para "+ENumHotel.PIAUI + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
    }
        return null;
    }
}
