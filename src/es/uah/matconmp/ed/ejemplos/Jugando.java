package es.uah.matconmp.ed.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;

/*** Esta clase se utiliza para jugar con el lenguaje Java
 * No tiene utilidad real
 */
public class Jugando {
    Boolean esVerdad = true;
    Boolean esMentira = false;
    String nombre;
    int edad;
    Integer miEdad = 47;

    public void tocarvariables() {
        esVerdad = !esMentira;
        nombre = "Irene Garcia Manceras";
        edad = miEdad.intValue();
    }


    public void estructurasDeControl() {
        //For
        for (int x = 1; x < 5; x++) {
            System.out.println("En el bucle, iteration" + x);
        }
        //for x2
        int y;
        for (y = 1; y < 5; y++) {
            //Iteracion del bucle
            System.out.println("En el bucle for x2, iteración" + y);
        }
        //for x3
        int z = 1;
        for (; z < 5; ) {
            //Iteracion del bucle
            System.out.println("En el bucle for x2, iteración" + z);
            z++;
            //Como se ha inicializado arriba entonces no hace falta poner el nada en el primer espacio
        }
        //////////////////////////////////////////////////////////
        //Bucle while
        while (z > 10) {
            System.out.println("Esto es un bucle while infinito");
            z++;
        }
        z = 1;
        while (z > 10) {
            System.out.println("Esto es un bucle while infinito");
            z++;
        }
        if (true) {
            // Cosas del true
        } else {
            //Cosas del false
        }
        int resultado;
        resultado = (z > y) ? 1 : 2;
        /*** Esto es un if comprimido
         * si se cumple la condición: 1
         * si no: 2
         */

    }

    public long getSegundos() {
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }
}
