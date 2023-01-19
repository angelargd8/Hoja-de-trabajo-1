package CModelo;

import java.util.*;

public class Radio implements IRadio {
    
    private String d;
    private boolean estado;
    private int volumen;
    private String ModulacionDeOnda;
    private double emisoras;
    private int NoLista;
    private int IcancionActual;
    private boolean estadoTelefono;
    private String Audio;

    Scanner in = new Scanner(System.in);

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public boolean getestado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getModulacionDeOnda() {
        return ModulacionDeOnda;
    }

    public void setModulacionDeOnda(String ModulacionDeOnda) {
        this.ModulacionDeOnda = ModulacionDeOnda;
    }

    public double getEmisoras() {
        return emisoras;
    }

    public void setEmisoras(double emisoras) {
        this.emisoras = emisoras;
    }

    public int getNoLista() {
        return NoLista;
    }

    public void setNoLista(int NoLista) {
        this.NoLista = NoLista;
    }

    public int getIcancionActual() {
        return IcancionActual;
    }

    public void setIcancionActual(int IcancionActual) {
        this.IcancionActual = IcancionActual;
    }

    public boolean isEstadoTelefono() {
        return estadoTelefono;
    }

    public void setEstadoTelefono(boolean estadoTelefono) {
        this.estadoTelefono = estadoTelefono;
    }

    public String getAudio() {
        return Audio;
    }

    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    public Radio (){
        
    }

    public boolean power(){
        if(estado == true){
            estado = false;
        
        } else if (estado == false){
            estado = true;
        }

        return estado;
    }

    public String cambiarEstacion(){
        
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
}
