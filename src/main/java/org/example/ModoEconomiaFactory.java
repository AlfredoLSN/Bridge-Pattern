package org.example;

public class ModoEconomiaFactory {
    public static ModoEconomia obterModoEconomia(String modoEconomia){
        Class classe = null;
        Object objeto =  null;
        try{
            classe = Class.forName("org.example.Modo" + modoEconomia);
            objeto = classe.newInstance();
        }catch(Exception ex){
            throw new IllegalArgumentException("Servico inexistente");
        }
        if(!(objeto instanceof ModoEconomia)){
            throw new IllegalArgumentException("Servico invalido");
        }
        return (ModoEconomia) objeto;
    }
}
