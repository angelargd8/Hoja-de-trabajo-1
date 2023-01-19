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
          if(ModulacionDeOnda.equals("AM")){
            System.out.println("Ingrese 1 para subir de estación o 0 para bajar de estación");
            int des = in.nextInt();
            
            if(des == 1){
                if( emisoras > 1610){
                    System.out.println(" Ya no se puede subir más de emisora");
                } else if ( emisoras <= 1610){
                    emisoras = emisoras + 10;
                }
                
            } else if(des == 0){
                if(emisoras < 530 ){
                    System.out.println("Ya no es posible bajar de emisora");
                } else if( emisoras >= 530)
                emisoras = emisoras - 10;
            }
        } else if (ModulacionDeOnda.equals("FM")){
            System.out.println("Ingrese 1 para subir de estación o 0 para bajar de estación");
            int des = in.nextInt();

            if(des == 1){
                if( emisoras > 107.9){
                    System.out.println(" Ya no se puede subir más de emisora");
                } else if ( emisoras <= 107.9){
                    emisoras = emisoras + 0.2;
                }
                
            } else if(des == 0){
                if(emisoras < 87.9 ){
                    System.out.println("Ya no es posible bajar de emisora");
                } else if( emisoras >= 87.9)
                emisoras = emisoras - 0.2;
            }

        }
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
