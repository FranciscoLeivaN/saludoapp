package com.equipo.saludo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSaludo() {
        assertEquals("¡Hola, DevOps Espero poder verte!", App.saludar("DevOps"));
    }
}
