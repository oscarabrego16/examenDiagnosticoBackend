package org.oscrdrgz.diagnostico.mamiferos;

abstract public class Canino extends Mamifero{
    protected String color;
    protected Float tamanoColmillos;

    public Canino() {
    }

    public Canino(String habitat, Float altura, Float largo, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(Float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }
}
