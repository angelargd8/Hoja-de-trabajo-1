package CPruebas;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import CControlador.*;

public class ControladorTest {

    private Controlador controlador;

    public void escenario(){
        controlador = new Controlador();
    }

    @Test
    public void testPower(){
        escenario();
        assertTrue(controlador.power() == true);
    }

    @Test
    public void testFrecuencia(){
        escenario();
        assertTrue(controlador.sFrecuencia() == "AM");
    }

    @Test
    public void testEmisoraCambio(){
        escenario();
        assertTrue(controlador.getEm() == 0.00);
    }
}
