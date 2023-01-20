package daw.programacion.conserje;

public class Llave {

    private int numero;

    public Llave(int numero) {
        this.numero = numero;
    }

    public boolean abrirPuerta(Puerta puerta) {
        if (this.numero == puerta.getNumero()) {
            puerta.setAbierta(true);
        }
        return puerta.isAbierta();
    }

    public int getNumero() {
        return numero;
    }

}
