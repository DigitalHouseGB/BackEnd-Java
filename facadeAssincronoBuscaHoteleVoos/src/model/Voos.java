package model;

import java.time.LocalDate;

public class Voos {
    private ENumHotel origem;
    private String dataPartida;
    private String dataRetorno;
    private ENumHotel destino;

    public Voos(ENumHotel origem, String dataPartida, String dataRetorno, ENumHotel destino) {
        this.origem = origem;
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.destino = destino;
    }

    public ENumHotel getOrigem() {
        return origem;
    }

    public void setOrigem(ENumHotel origem) {
        this.origem = origem;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public ENumHotel getDestino() {
        return destino;
    }

    public void setDestino(ENumHotel destino) {
        this.destino = destino;
    }
}
