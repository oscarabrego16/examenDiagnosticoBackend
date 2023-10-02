package org.oscrdrgz.diagnostico.mamiferos;

abstract public class Felino extends Mamifero{
    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino() {
    }

    public Felino(String habitat, Float altura, Float largo, String nombreCientifico,
                  Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(Float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
