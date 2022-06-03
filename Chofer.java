package com.upchiapas.act_c1.models;


public class Chofer{
    private short id;
    private String nombre;
    private Taxis[]Listachofer;

    public Chofer(int numeroVehiculos){
        //El objeto recibe el parametro para determinar la cantidad de vehiculos que el usuario digite
        Listachofer = new Taxis[numeroVehiculos];
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public  String toString (){return " nombre " +nombre +" id " +id;}


}
