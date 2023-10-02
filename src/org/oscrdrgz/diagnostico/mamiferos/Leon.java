package org.oscrdrgz.diagnostico.mamiferos;

public class Leon extends Felino{
    private Integer numManada;
    private Float potenciaRugidoDecibel;

    public Leon() {
    }
    public Leon(String habitat, Float altura, Float largo, String nombreCientifico,
                Float tamanoGarras, Integer velocidad, Integer numManada,
                Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(Float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon come presas";
    }

    @Override
    public String dormir() {
        return "El leon duerme 7 horas";
    }

    @Override
    public String correr() {
        return "El leon corre a 80 kmh";
    }

    @Override
    public String comunicarse() {
        return "El leon ruge";
    }

    @Override
    public String toString() {
        return "Leon{" +
                "numManada=" + numManada +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
