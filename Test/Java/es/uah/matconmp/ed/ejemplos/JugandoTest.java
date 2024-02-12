package es.uah.matconmp.ed.ejemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JugandoTest {

    @org.junit.jupiter.api.Test
    void tocarvariables() {
        Jugando j = new Jugando();
        assertDoesNotThrow(()->j.tocarvariables());
    }

    @org.junit.jupiter.api.Test
    void estructurasDeControl() {
        Jugando j = new Jugando();
        assertDoesNotThrow(()->j.tocarvariables());
    }

    @org.junit.jupiter.api.Test
    void getSegundos() {
        Jugando j = new Jugando();
        long rdo = j.getSegundos();
        assertNotEquals(rdo, 0L);
        assertTrue((rdo>0), "Error, es menor o igual a 0");
        }
    }
