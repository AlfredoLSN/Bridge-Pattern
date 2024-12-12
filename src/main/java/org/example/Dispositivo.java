package org.example;

public abstract class Dispositivo {
    protected ModoEconomia modoEconomia;
    protected float consumoBase;
    protected float eficiencia;
    public Dispositivo(float consumoBase){
        this.consumoBase = consumoBase;
    }
    public void setModoEconomia(ModoEconomia  modoEconomia){
        this.modoEconomia = modoEconomia;
    }
    public void setConsumoBase(float consumoBase){
        this.consumoBase = consumoBase;
    }


    public abstract float calcularConsumo();
}