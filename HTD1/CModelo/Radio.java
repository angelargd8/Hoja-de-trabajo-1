/**
 * Autores:
 *  Angela García #22869
 *  Carlos Valladares #221164
 *  Santiago Pereira #22318
 */


/**
 * Se importan las librerias a usar
 */
package CModelo;


public class Radio {
    
    /**
     * Atributos
     */
    String d;
    boolean estado;
    boolean frecuencia;
    int volumen;
    String ModulacionDeOnda;
    double emisoras;
    int NoLista;



    //Scanner in = new Scanner(System.in);

    /**
     * 
     * @param estado
     * @param frecuencia
     * @param modulacionDeOnda
     * @param emisoras
     */
    public Radio( Boolean estado, Boolean frecuencia, String modulacionDeOnda, double emisoras) {
        this.estado = estado;
        this.frecuencia = frecuencia;
        ModulacionDeOnda = modulacionDeOnda;
        this.emisoras = emisoras;
    }
    
    /**
     * 
     * @return
     */
    public boolean getestado() {
        return estado;
    }
/**
 * 
 * @return
 */
    public Boolean setEstado() {
        if (estado==false){
            estado= true;
        }else if (estado== true){
    
            estado= false;
        }
        return estado;
    }
    
    /**
     * 
     * @return
     */
    public boolean getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(boolean frecuencia) {
        this.frecuencia = frecuencia;
    }

/**
 * 
 * @return
 */
    public String getModulacionDeOnda() {
        return ModulacionDeOnda;
    }
/**
 * 
 * @param ModulacionDeOnda
 */
    public void setModulacionDeOnda(String ModulacionDeOnda) {
        this.ModulacionDeOnda = ModulacionDeOnda;
    }
/**
 * 
 * @return
 */
    public double getEmisoras() {
        return emisoras;
    }
/**
 * 
 * @param emisoras
 */
    public void setEmisoras(double emisoras) {
        this.emisoras = emisoras;
    }
/**
 * 
 * @return
 */
    public int getNoLista() {
        return NoLista;
    }
/**
 * 
 * @param NoLista
 */
    public void setNoLista(int NoLista) {
        this.NoLista = NoLista;
    }

/**
 * Constructor 
 */
  public Radio (){
        
    }
  /*
    public boolean power(){
        if(estado == true){
            estado = false;
        
        } else if (estado == false){
            estado = true;
        }

        return estado;
    }

    public void cambiarEstacion(){
        
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
        
    }*/

     
}
