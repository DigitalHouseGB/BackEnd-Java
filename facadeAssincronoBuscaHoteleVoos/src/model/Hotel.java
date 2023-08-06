package model;

import java.time.LocalDate;

public class Hotel {
    private String dataEntrada;
    private String dataSaida;
    private ENumHotel cidade;

    public Hotel(String dataEntrada, String dataSaida, ENumHotel cidade) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cidade = cidade;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public ENumHotel getCidade() {
        return cidade;
    }

    public void setCidade(ENumHotel cidade) {
        this.cidade = cidade;
    }
}
