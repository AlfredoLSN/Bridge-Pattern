package org.example;

public class DispositivoFactory {
    public static Dispositivo obterDispositivo(String dispositivo, float consumoBase){
        Class classe = null;
        Object objeto =  null;
        try{
            classe = Class.forName("org.example.Dispositivo" + dispositivo);
            objeto = classe.getConstructor(float.class).newInstance(consumoBase);
        }catch(Exception ex){
            throw new IllegalArgumentException("Servico inexistente");
        }
        if(!(objeto instanceof Dispositivo)){
            throw new IllegalArgumentException("Servico invalido");
        }
        return (Dispositivo) objeto;
    }

}
