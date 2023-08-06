package service.impl;
import model.ENumHotel;
import model.Hotel;
import model.Voos;
import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class ApiVoos {
    private static final Logger logger = Logger.getLogger(ApiHotel.class);
    public String buscaVoo(Voos voos) {
        Calendar calendar = Calendar.getInstance();
        Locale local = new Locale("pt", "BR");
        DateFormat dateFormat = new SimpleDateFormat("MMM", local);
        String dataPartida = dateFormat.format(calendar.getTime()).toUpperCase();
        String dataRetoro = dateFormat.format(calendar.getTime()).toUpperCase();
    if (voos.getDestino().equals(ENumHotel.SAO_PAULO) && voos.getDataPartida().equals(dataPartida) && voos.getDataRetorno().equals(dataRetoro)){
        logger.info ("Há voos para "+ENumHotel.SAO_PAULO + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
        return ("Há voos para "+ENumHotel.SAO_PAULO + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
    } else if (voos.getDestino().equals(ENumHotel.RIO_DE_JANEIRO) && voos.getDataPartida().equals(dataPartida) && voos.getDataRetorno().equals(dataRetoro)) {
        logger.info("Há voos para "+ENumHotel.RIO_DE_JANEIRO + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
        return ("Há voos para "+ENumHotel.RIO_DE_JANEIRO + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
    } else if (voos.getDestino().equals(ENumHotel.PIAUI) && voos.getDataPartida().equals(dataPartida) && voos.getDataRetorno().equals(dataRetoro)) {
        logger.info("Há voos para "+ENumHotel.PIAUI + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
        return ("Há voos para "+ENumHotel.PIAUI + " disponiveis para entrar no mes " + dataPartida + " e sair mês "+ dataRetoro);
    }
        logger.error("Nenhum voo encontrado nas condições informadas !");
        return null;
    }
}
