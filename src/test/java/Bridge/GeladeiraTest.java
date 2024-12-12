package Bridge;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeladeiraTest {
    @Test
    void deveRetornarConsumoGeladeiraModoNormal(){
        ModoEconomiaReducoes.getInstance().setReducaoModoNormal(0.0f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("Normal");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("Geladeira", 300.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(300.0f, dispositivo.calcularConsumo(), 0.01f);
    }
    @Test
    void deveRetornarConsumoGeladeiraModoEco(){
        ModoEconomiaReducoes.getInstance().setReducaoModoEco(50.5f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("Eco");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("Geladeira", 300.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(249.5f, dispositivo.calcularConsumo(), 0.01f);
    }
    @Test
    void deveRetornarConsumoGeladeiraModoSuperEco(){
        ModoEconomiaReducoes.getInstance().setReducaoModoSuperEco(80.75f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("SuperEco");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("Geladeira", 300.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(219.25f, dispositivo.calcularConsumo(), 0.01f);
    }

}
