package org.oscrdrgz.diagnostico.mamiferos;

abstract public class Mamifero {
    protected String habitat;
    protected Float altura;
    protected Float largo;
    protected String nombreCientifico;

    public Mamifero() {
    }

    public Mamifero(String habitat, Float altura, Float largo, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    abstract public String comer();
    
    abstract public String dormir();

    abstract public String correr();

    abstract public String comunicarse();

    abstract public String toString();
    
}
