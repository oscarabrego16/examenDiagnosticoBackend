package org.oscrdrgz.diagnostico.mamiferos;

public class Lobo extends Canino{
    private Integer numCamada;
    private String especieLobo;

    public Lobo() {
    }

    public Lobo(String habitat, Float altura, Float largo, String nombreCientifico,
                String color, Float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }
    @Override
    public String comer() {
        return "El lobo come presas del bosque";
    }

    @Override
    public String dormir() {
        return "El lobo duerme 3 horas por turnos";
    }

    @Override
    public String correr() {
        return "El lobo corre a 35 kmh";
    }

    @Override
    public String comunicarse() {
        return "El lobo aulla";
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "numCamada=" + numCamada +
                ", especieLobo='" + especieLobo + '\'' +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
