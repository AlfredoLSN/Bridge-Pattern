package org.example;

import java.lang.reflect.Parameter;

public class ModoEconomiaReducoes {
    private ModoEconomiaReducoes(){};
    private static ModoEconomiaReducoes instance = new ModoEconomiaReducoes();
    public static ModoEconomiaReducoes getInstance(){
        return instance;
    }
    private float reducaoModoNormal;
    private float reducaoModoEco;
    private float reducaoModoSuperEco;

    public float getReducaoModoNormal(){
        return reducaoModoNormal;
    }
    public void setReducaoModoNormal(float reducaoModoNormal){
        this.reducaoModoNormal = reducaoModoNormal;
    }

    public float getReducaoModoEco(){
        return reducaoModoEco;
    }
    public void setReducaoModoEco(float reducaoModoEco){
        this.reducaoModoEco = reducaoModoEco;
    }

    public float getReducaoModoSuperEco(){
        return reducaoModoSuperEco;
    }
    public void setReducaoModoSuperEco(float reducaoModoSuperEco){
        this.reducaoModoSuperEco = reducaoModoSuperEco;
    }
}
