package CModelo;

public interface IRadio {
    public boolean power();
    public String cambiarEstacion();
    public void cambiarEmisora(double cambio);
    public void guardarEmisora(double emisora);
    public double emisoraGuardada(int posicion);
}
