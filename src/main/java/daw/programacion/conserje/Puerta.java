package daw.programacion.conserje;

public class Puerta {

    private int numero;
    private boolean abierta = false;

    public Puerta(int numero) {
        this.numero = numero;
    }

    public Puerta(int numero, boolean abierta) {
        this.numero = numero;
        this.abierta = abierta;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    

}
