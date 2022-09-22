package com.example.usuarios;

public class Person {
    private String nombre;
    private String apellido;
    private int edad;

    public Person(String nombre, String apellido, int edad){
        this.apellido=apellido;
        this.nombre=nombre;
        this.edad=edad;
    }
    public Person(){

    }
    public Person(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombres(){return nombre+" "+apellido;}
}
