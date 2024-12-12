package org.example;

public class ModoSuperEco implements ModoEconomia{
    @Override
    public float obterConsumoReduzido() {
        return ModoEconomiaReducoes.getInstance().getReducaoModoSuperEco();
    }
}
