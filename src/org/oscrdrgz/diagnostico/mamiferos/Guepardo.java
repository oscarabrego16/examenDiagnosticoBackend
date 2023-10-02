package org.oscrdrgz.diagnostico.mamiferos;

public class Guepardo extends Felino{

    public Guepardo() {
    }

    public Guepardo(String habitat, Float altura, Float largo, String nombreCientifico,
                    Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo es carnivoro";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme 9 horas";
    }

    @Override
    public String correr() {
        return "El guepardo corre a 99 kmh";
    }

    @Override
    public String comunicarse() {
        return "El guepardo puede gañir";
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
