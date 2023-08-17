package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    private UsuarioValidacion validacion;

    @BeforeEach

    public void configurarPruebas(){
        this.validacion=new UsuarioValidacion();
        System.out.println("iniciando prueba...");
    }
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Diego fuentes";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectamentePorNumerosCaracteres(){
        String nombrePrueba="Diego";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombresFuncionaIncorrectamentePorCaracteresInvalidos(){
        String nombrePrueba="1234567890";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.INVALIDO.getMensaje(),respuesta.getMessage());
    }

}