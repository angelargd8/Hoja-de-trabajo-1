/**
 * Autores:
 *  Angela García #22869
 *  Carlos Valladares #221164
 *  Santiago Pereira #22318
 */

package CVista;

import CControlador.Controlador;

public class MostrarMenu {
    Vista vista;
    Controlador controlador;
    int opcion=0;
    int opcionEmisora=0;
    int opcionEmisora2=0;


    
    public MostrarMenu(){
        vista = new Vista();
        controlador= new Controlador();
        
    }
    public void MostrarPrograma(){
        vista.Mensaje(); 
        
        

        while (opcion!=7){
            opcion= vista.SeleccioneMenu("\nBienvenido al simulador de radio \n Ingrese una opción:\n1. Encender el radio \n2. Cambiar de AM a FM \n3. Avanzar en el dial de las emisoras \n4. Guardar una emisora en uno de los 12 botones \n5. Seleccionar la emisora actual en un boton \n6. apagar el radio\n7. salir");
/////////////1. Encender el radio//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opcion==1){
                System.out.println("\nEncendiendo el radio... "  );
                controlador.power();
                System.out.println("\nEl radio esta encendido "  );
            }
/////////////n2. Cambiar de AM a FM//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            try{
                if (opcion==2){
                    System.out.println("Cambiando de frecuencia... ");
                    controlador.frecuencia();
                    System.out.println("La frecuencia se ha cambiado correctamente a " + controlador.sFrecuencia()); 
                }
    ///////////3. Avanzar en el dial de las emisoras ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==3){
                    opcionEmisora=  vista.SeleccioneMenu("0) para bajar de estación\n1) para subir de estación ");
                    controlador.EmisoraCambio(opcionEmisora);
                    System.out.println("Se cambio la emisora ");


                }
    /////////////4. Guardar emisora //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==4){
                    controlador.GuardarEm();
                    System.out.println("Se guardo la emisora");
                    
                }
    //////////////5. Permite seleccionar la emisora puesta en un boton /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==5){
                    opcionEmisora2=  vista.SeleccioneMenu("Ingrese el número de la emisora a cargar (de 0 a 11)");
                    controlador.cargarEmisoraGuardada(opcionEmisora2);
                
                }

    /////////////apagar el radio//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==6){
                    System.out.println("\nApagando el radio... "  );
                    controlador.power();
                    System.out.println("\nRadio apagado "  );

                }
            /////salir//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            }catch (Exception e){
                vista.validacion2();
            }
        }

  
    }
}
