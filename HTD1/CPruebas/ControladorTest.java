/**
 * Autores:
 *  Angela García #22869
 *  Carlos Valladares #221164
 *  Santiago Pereira #22318
 */
package CPruebas;

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
        assertTrue(controlador.sFrecuencia() == "FM");
    }

    @Test
    public void testEmisoraCambio(){
        escenario();
        assertTrue(controlador.getEm() == 530);
    }
}
