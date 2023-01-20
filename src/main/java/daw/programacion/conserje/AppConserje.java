package daw.programacion.conserje;


public class AppConserje 
{
    public static void main( String[] args )
    {

        Puerta puerta1 = new Puerta(5);
        Conserje paco = new Conserje(new Llave(5));

        paco.abrirPuerta(puerta1);

        System.out.println(puerta1.isAbierta());

        paco.abrirPuerta(puerta1);

    }
}
