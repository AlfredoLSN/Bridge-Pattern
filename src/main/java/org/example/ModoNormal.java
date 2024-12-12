package org.example;

public class ModoNormal implements ModoEconomia{
    @Override
    public float obterConsumoReduzido() {
        return ModoEconomiaReducoes.getInstance().getReducaoModoNormal();
    }
}
