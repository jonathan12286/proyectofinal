/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Jeg.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author User
 */
public class dtoPersona {
    
   @NotBlank
    private String Nombre;
    @NotBlank
    private String Apellido;
    @NotBlank
    private String descripcion;    
      @NotBlank    
    private String  img  ;  

    public dtoPersona() {
    }

    public dtoPersona(String Nombre, String Apellido, String descripcion, String img) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
      
      
}
