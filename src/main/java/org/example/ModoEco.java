package org.example;

public class ModoEco implements ModoEconomia{
    @Override
    public float obterConsumoReduzido() {
        return ModoEconomiaReducoes.getInstance().getReducaoModoEco();
    }
}
