package basicosFrancisco;

public class numericos {

	public static void numerico() {
        //Estos son los tipos b�sicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignaci�n de valores a las variables de tipos b�sicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos b�sicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);

        int operacion = 1;
        int num_uno = 1;
        int num_dos = 6;
        int resultado = 0;

        if (operacion == 1) {
            resultado = num_uno + num_dos;
            System.out.println("El resultado de la suma es" + resultado);
        } else if (operacion == 2) {
            resultado = num_uno - num_dos;
            System.out.println("El resultado de la resta es" + resultado);

        }

    }  

}

