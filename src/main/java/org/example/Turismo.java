package org.example;

import org.example.entidades.Local;
import org.example.entidades.Oferta;
import org.example.entidades.Reserva;
import org.example.entidades.Usuario;

import java.util.Scanner;

public class Turismo {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Local local = new Local();
        Oferta oferta = new Oferta();
        Reserva reserva = new Reserva();
        Scanner lea= new Scanner(System.in);

        System.out.println("\u001B[32m*********Bien*************\u001B[0m");
        System.out.println("\u001B[34m1.Datos Usuario: \u001B[0m");
        System.out.print("Digite su nombre y apellidos: ");
        usuario.setNombres(lea.nextLine());


        System.out.print("\u001B[34mDigite la fecha inicial : \u001B[0m");
        oferta.setFechainicio(lea.next());
        System.out.print("\u001B[34mDigite la fecha final : \u001B[0m");
        oferta.setFechafin(lea.next());

        System.out.print("digita el titulo del local: ");
        oferta.setTitulo(lea.next());

        System.out.print("Validar costo: ");
        oferta.setCostopersona(lea.nextDouble());

        System.out.print("ubicacion: ");
        usuario.setUbicacion(lea.nextInt());

        System.out.print("correo: ");
        usuario.setCorreo(lea.next());


        System.out.print("El nombre de la empresa: ");
        local.setNombre(lea.next());

        System.out.print("nit: ");
        local.setNit(lea.next());

        System.out.print("fecha reserva");
        reserva.setFechaReserva(lea.next());



    }
}










/*System.out.print("Digita su Correo: ");
        try{
            usuario.setCorreo(lea.nextLine());

        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() + "\u001B[0m");

        }
        System.out.print("Digita la ubicacion: ");
        try{
            usuario.setUbicacion(lea.nextLine());

        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() + "\u001B[0m");

        }

    System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\u001B[33m********resultado**********\u001B[0m");
        System.out.println("\u001B[33m***************************\u001B[0m");
        System.out.println("\u001B[33m***************************\u001B[0m");
        System.out.println("\u001B[33m***************************\u001B[0m");
        System.out.println("Su nombre es: " + usuario.getNombres());
        System.out.println("La ubicacion es: " + usuario.getUbicacion());


        */