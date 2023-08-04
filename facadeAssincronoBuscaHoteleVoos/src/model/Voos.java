package model;

import java.time.LocalDate;

public class Voos {
    private String origem;
    private LocalDate dataPartida;
    private LocalDate dataRetorno;
    private String destino;

    public Voos(String origem, LocalDate dataPartida, LocalDate dataRetorno, String destino) {
        this.origem = origem;
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(LocalDate dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
