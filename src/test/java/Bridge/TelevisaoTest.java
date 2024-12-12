package Bridge;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisaoTest {
    @Test
    void deveRetornarConsumoTelevisaoModoNormal(){
        ModoEconomiaReducoes.getInstance().setReducaoModoNormal(0.0f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("Normal");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("Televisao", 150.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(150.0f, dispositivo.calcularConsumo(), 0.01f);
    }
    @Test
    void deveRetornarConsumoTelevisaoModoEco(){
        ModoEconomiaReducoes.getInstance().setReducaoModoEco(50.5f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("Eco");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("Televisao", 150.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(99.5f, dispositivo.calcularConsumo(), 0.01f);
    }
    @Test
    void deveRetornarConsumoTelevisaoModoSuperEco(){
        ModoEconomiaReducoes.getInstance().setReducaoModoSuperEco(80.75f);
        ModoEconomia modoEconomia = ModoEconomiaFactory.obterModoEconomia("SuperEco");
        Dispositivo dispositivo = DispositivoFactory.obterDispositivo("Televisao", 150.0f);
        dispositivo.setModoEconomia(modoEconomia);
        assertEquals(69.25f, dispositivo.calcularConsumo(), 0.01f);
    }

}
