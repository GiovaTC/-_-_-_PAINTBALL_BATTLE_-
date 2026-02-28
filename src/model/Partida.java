package model;

public class Partida {
    private int jugadorId;
    private int puntaje;
    private int disparos;
    private long duracionSeg;

    public Partida(int jugadorId, int puntaje, int disparos, long duracionSeg) {
        this.jugadorId = jugadorId;
        this.puntaje = puntaje;
        this.disparos = disparos;
        this.duracionSeg = duracionSeg;
    }

    public int getJugadorId() {
        return jugadorId;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getDisparos() {
        return disparos;
    }

    public long getDuracionSeg() {
        return duracionSeg;
    }
}
