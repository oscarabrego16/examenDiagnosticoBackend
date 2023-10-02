package org.oscrdrgz.diagnostico.mamiferos;

public class Tigre extends Felino{
    private String specieTigre;

    public Tigre() {
    }

    public Tigre(String habitat, Float altura, Float largo, String nombreCientifico, Float tamanoGarras, Integer velocidad, String specieTigre) {
        super(habitat, altura, largo, nombreCientifico, tamanoGarras, velocidad);
        this.specieTigre = specieTigre;
    }

    public String getSpecieTigre() {
        return specieTigre;
    }

    public void setSpecieTigre(String specieTigre) {
        this.specieTigre = specieTigre;
    }

    @Override
    public String comer() {
        return "El tigre come carne";
    }

    @Override
    public String dormir() {
        return "El tigre duerme 5 horas";
    }

    @Override
    public String correr() {
        return "El tigre corre a 75 kmh";
    }

    @Override
    public String comunicarse() {
        return "El tigre gruñe";
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "specieTigre='" + specieTigre + '\'' +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
