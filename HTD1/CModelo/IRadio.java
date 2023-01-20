/**
 * Autores:
 *  Angela García #22869
 *  Carlos Valladares #221164
 *  Santiago Pereira #22318
 */


package CModelo;


public interface IRadio{

    /**
     * 
     * @return
     */
    //Tiene que iniciar apagada y funciona para cambiar la radio de encendida a apagada
    public boolean power();

    /**
     * 
     * @return
     */
    //Treue es Fm y false AM, cuando se llama a la funcion esta cambia entre true o false
    public boolean frecuencia();

    /**
     * 
     * @param subirBajar
     */
    //True es para arriba y false es para abajo.
    public void cambiarEmisora(boolean subirBajar);

    /**
     * 
     * @return
     */
    //obtener la emisora actual
    public double emisoraActual();
/**
 * 
 * @param emisora
 */
    //guardar la emisora en un ArrayList es el cual solo guarda al final de la lista la emisora
    public void guardarEmisora(double emisora);

    /**
     * 
     * @param posicion
     */
    //Se le manda la posicion en la que se encuentra la emisora seleccionada
    public void cargarEmisoraGuardada(int posicion);
}
