package org.example;

public class DispositivoArCondicionado extends Dispositivo{
    public DispositivoArCondicionado(float consumoBase) {
        super(consumoBase);
    }

    @Override
    public float calcularConsumo() {
        return this.consumoBase - this.modoEconomia.obterConsumoReduzido();
    }
}
