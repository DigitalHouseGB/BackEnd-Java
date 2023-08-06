package service.impl;

import model.Hotel;
import model.Voos;
import service.IFacadeBuscaHotelVoo;
import org.apache.log4j.Logger;
public class FacadeBuscaHotelmpl implements IFacadeBuscaHotelVoo {
    public static final Logger logger = Logger.getLogger(IFacadeBuscaHotelVoo.class);
    private ApiVoos apiVoos;
    private ApiHotel apiHotel;

    public FacadeBuscaHotelmpl() {
        logger.info("construindo facade busca de hotel e voo impl");
        this.apiHotel = new ApiHotel();
        this.apiVoos = new ApiVoos();
    }

//    @Override
//    public void buscaHotelVoo(Hotel hotel, Voos voo) {
//        if (hotel.getCidade().equals(voo.getDestino())){
//            if (hotel.getDataEntrada().equals(voo.getDataPartida())){
//                if (hotel.getDataSaida().equals(voo.getDataRetorno())){
//                    logger.info("Todos as datas coincidem seguir processo");
//                }else{
//                    logger.error("Data de Saida não coincide entre voo e hotel");
//                }
//            }else{
//                logger.error("Data de Entrada não coincide entre voo e hotel");
//            }
//        }else{logger.error("Cidade não coincide entre voo e hotel");}
//    }


    @Override
    public void buscaHotelVoo(Hotel hotel, Voos voo) {
        apiHotel.buscaHotel(hotel);
        apiVoos.buscaVoo(voo);
    }
}
