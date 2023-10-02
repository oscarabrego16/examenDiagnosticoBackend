package org.oscrdrgz.diagnostico.mamiferos;

public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro() {
    }

    public Perro(String habitat, Float altura, Float largo, String nombreCientifico,
                 String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro come croquetas";
    }

    @Override
    public String dormir() {
        return "El perro duerme 8 horas";
    }

    @Override
    public String correr() {
        return "El perro corre a 15 kmh";
    }

    @Override
    public String comunicarse() {
        return "El perro puede ladrar";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "fuerzaMordida=" + fuerzaMordida +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
