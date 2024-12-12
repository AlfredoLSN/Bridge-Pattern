package org.example;

public class DispositivoGeladeira extends Dispositivo{
    public DispositivoGeladeira(float consumoBase) {
        super(consumoBase);
    }

    @Override
    public float calcularConsumo() {
        return this.consumoBase - this.modoEconomia.obterConsumoReduzido();
    }
}
