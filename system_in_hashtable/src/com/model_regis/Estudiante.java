package com.model_regis;

/**
 * Created by Ccama on 17/06/2017.
 */
public class Estudiante {
    private Integer DNI;
    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private Integer Celular;
    private String Fecha_Nacimiento;
    private String Grado;

    private String Curso = null;
    private Integer Nota_1 = 0;
    private Integer Nota_2 = 0;
    private Integer Nota_3 = 0;
    private Integer Nota_4 = 0;
    private float Promedio;


    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Integer getCelular() {
        return Celular;
    }

    public void setCelular(Integer celular) {
        Celular = celular;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public Integer getNota_1() {
        return Nota_1;
    }

    public void setNota_1(Integer nota_1) {
        Nota_1 = nota_1;
    }

    public Integer getNota_2() {
        return Nota_2;
    }

    public void setNota_2(Integer nota_2) {
        Nota_2 = nota_2;
    }

    public Integer getNota_3() {
        return Nota_3;
    }

    public void setNota_3(Integer nota_3) {
        Nota_3 = nota_3;
    }

    public Integer getNota_4() {
        return Nota_4;
    }

    public void setNota_4(Integer nota_4) {
        Nota_4 = nota_4;
    }

    public float getPromedio() {
        return (float)(Nota_1 + Nota_2 + Nota_3 + Nota_4)/4;
    }

    public void setPromedio(float promedio) {
        Promedio = promedio;
    }
}
