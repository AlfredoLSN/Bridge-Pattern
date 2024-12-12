package org.example;

public class DispositivoTelevisao extends Dispositivo{
    public DispositivoTelevisao(float consumoBase) {
        super(consumoBase);
    }

    @Override
    public float calcularConsumo() {
        return this.consumoBase - this.modoEconomia.obterConsumoReduzido();
    }
}
