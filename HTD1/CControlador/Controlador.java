package CControlador;
import java.util.ArrayList;

import CModelo.IRadio;
import CModelo.Radio;
import CVista.Vista;

public class Controlador implements IRadio  {
    Vista  vista;

    Radio radio = new Radio(null, false, 0, "AM", 0.00,0 );

    public Controlador(){

    }

    @Override
    public boolean power() {
        Boolean estado= radio.setEstado();
        System.out.println("estado :" + radio.getestado());
        return estado;

    }

    @Override
    public boolean frecuencia() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void cambiarEmisora(boolean subirBajar) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double emisoraActual() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void guardarEmisora(double emisora) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cargarEmisoraGuardada(int posicion) {
        // TODO Auto-generated method stub
        
    }


    

}
