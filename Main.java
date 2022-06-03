package com.upchiapas.act_c1;
import com.upchiapas.act_c1.models.Chofer;
import com.upchiapas.act_c1.models.Taxis;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Chofer[] ChoferLista = new Chofer[5];
    public static Taxis[] VehiculoLista = new Taxis[5];
    private static Scanner tecla = new Scanner(System.in);
    Taxis unidad = new Taxis();
    Chofer chofersito = new Chofer((byte) 124);

    public static void main(String[] args)
    {

        int op;
        do
        {
            System.out.println(">>>>Imprimir menu<<<<");
            System.out.println("1. Regristo de vehiculo");
            System.out.println("2. Registro de choferes");
            System.out.println("3. Imprimir lista de unidades con los choferes asignados");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion: ");
            op = tecla.nextInt();

            switch(op)
            {
                case 1: addVehiculo();
                    break;
                case 2:
                    addChofer();
                    break;
                case 3: impresion();
                    break;
            }
        }while(op < 4);
    }

    public static void addChofer(){
        short id;
        String nombre;
        int numeroVehiculos;
        Chofer persona;

        //Seccion para capturar datos
        System.out.println("Ingresa el ID: ");
        id = tecla.nextShort();
        tecla.nextLine();
        System.out.println("Ingresa el nombre: ");
        nombre = tecla.nextLine();
        System.out.println("Matricula del vehiculo: ");
        numeroVehiculos = tecla.nextInt();

        //Seccion para almacenar datos
        persona = new Chofer(numeroVehiculos); //Envia el argumento de numeroVehiculos al constructor de la clase Chofer
        //pasar a la clase
        persona.setId(id);
        persona.setNombre(nombre);

        byte indice = 0;
        //El espacio indice es diferente de nullo?
        while(ChoferLista[indice] != null) // falso porque todos los espacion valen null
            indice++;
        System.out.println(""+ChoferLista[indice]);
        //agrega el objeto persona al espacio indice y vuelve a preguntar
        ChoferLista[indice] = persona;
    }

    public static void addVehiculo()
    {
        int matricula;
        String modelo, año,color;
        System.out.println("Matricula: ");
        matricula = tecla.nextInt();
        System.out.println("Modelo del vehiculo: ");
        modelo = tecla.nextLine();
        System.out.println("Color del vehiculo: ");
        color = tecla.nextLine();
        System.out.println("Año del vehiculo: ");
        año = tecla.nextLine();


    }
    public static void impresion(){
        System.out.println("El vehiculo asignado para el chofer: "+ tecla.nextLine()+ tecla.nextInt());
    }
}