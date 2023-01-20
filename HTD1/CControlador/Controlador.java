/**
 * Autores:
 *  Angela García #22869
 *  Carlos Valladares #221164
 *  Santiago Pereira #22318
 * aaaaaaaa
 */

/**
 * Se importan las librerias a usar
 */

package CControlador;
import java.util.ArrayList;

import CModelo.IRadio;
import CModelo.Radio;
import CVista.Vista;

public class Controlador implements IRadio  {
    
    /**
     * Se crean los atributos y objetos.
     */
    Vista  vista;

    Radio radio = new Radio(null, false, true, 0, "AM", 530,0 );
    //Array
    ArrayList<Double> ListaDeEmisorasGuardadas = new ArrayList<>();


    /**
     * Constructor
     */
    public Controlador(){

    }

    /**
     * 
     * @return
     */
    @Override
    public boolean power() {
        Boolean estado= radio.setEstado();
        System.out.println("estado :" + radio.getestado());
        return estado;

    }

    /**
     * 
     * @return
     */
    @Override
    public boolean frecuencia() {
        return false;
        //Boolean frecuencia = radio.setFrecuencia(frecuencia);
        //return frecuencia;
    }

    /**
     * 
     * @return
     */
    public String sFrecuencia(){
        //false = FM
        String sFrecuencia = "FM";
        if (radio.getFrecuencia() == false){
            sFrecuencia = "AM";
            radio.setFrecuencia(true);
            radio.setEmisoras(530);
            
        }else if(radio.getFrecuencia() == true){
            sFrecuencia = "FM";
            radio.setEmisoras(87.9);
            radio.setFrecuencia(false);
            
        }
        return sFrecuencia;
    }


  
    /**
     * 
     * @return
     */
    public double getEm(){
        return radio.getEmisoras();
    }

    /**
     * 
     * @param subirBajar
     */
    @Override
    public void cambiarEmisora(boolean subirBajar) {
        // TODO Auto-generated method stub
          /*if(ModulacionDeOnda.equals("AM")){
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

        }*/
    }

    /**
     * 
     * @param des
     */
    public void EmisoraCambio(int des){
        boolean ModulacionDeOnda = radio.getFrecuencia();
        double emisoras = radio.getEmisoras();
        if(ModulacionDeOnda == true){ //am
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
        } else if (ModulacionDeOnda == true){ //fm
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

    /**
     * 
     * @return 
     */
    @Override
    public double emisoraActual() {
        // TODO Auto-generated method stub
         return radio.getEmisoras();
    }

    /**
     * Guardar la emisora preferida
     */
    public void GuardarEm(){
        Double EmisoraActual = radio.getEmisoras();
        if (ListaDeEmisorasGuardadas.size()<12){
            ListaDeEmisorasGuardadas.add(EmisoraActual);
        }
        else{
            vista.validacion();
        }

    }

    /**
     * 
     * @param emisora
     */
    @Override
    public void guardarEmisora(double emisora) {
        // TODO Auto-generated method stub
        
    }

    /**
     * 
     * @param posicion
     */
    @Override
    public void cargarEmisoraGuardada(int posicion) {
        // TODO Auto-generated method stub
        double CargarEmisora = ListaDeEmisorasGuardadas.get(posicion);
        System.out.println(CargarEmisora);
        radio.setEmisoras(CargarEmisora);

        

        
    }


    

}
