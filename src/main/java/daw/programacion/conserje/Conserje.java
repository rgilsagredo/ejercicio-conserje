package daw.programacion.conserje;

public class Conserje {

    private Llave llave;

    public Conserje(Llave llave) {
        this.llave = llave;
    }

    public void abrirPuerta(Puerta puerta) {

        if (puerta.isAbierta()) {
            System.out.println("La puerta ya está abierta");
        } else {
            if (this.llave.abrirPuerta(puerta)) {
                System.out.println("He abierto la puerta");
            } else {
                System.out.println("La llave " + this.llave.getNumero() +
                        " no abre la puerta " + puerta.getNumero());
            }
        }
    }
}
