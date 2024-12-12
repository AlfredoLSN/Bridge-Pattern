package Bridge;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArCondicionadoTest {
    @Test
    void deveRetornarConsumoArCondicionadoModoNormal(){
        ModoEconomiaReducoes.getInstance().setReducaoModoNormal(0.0f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("Normal");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("ArCondicionado", 1200.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(1200.0f, dispositivo.calcularConsumo(), 0.01f);
    }
    @Test
    void deveRetornarConsumoArCondicionadoModoEco(){
        ModoEconomiaReducoes.getInstance().setReducaoModoEco(50.5f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("Eco");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("ArCondicionado", 1200.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(1149.5f, dispositivo.calcularConsumo(), 0.01f);
    }
    @Test
    void deveRetornarConsumoArCondicionadoModoSuperEco(){
        ModoEconomiaReducoes.getInstance().setReducaoModoSuperEco(80.75f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("SuperEco");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("ArCondicionado", 1200.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(1119.25f, dispositivo.calcularConsumo(), 0.01f);
    }

}
