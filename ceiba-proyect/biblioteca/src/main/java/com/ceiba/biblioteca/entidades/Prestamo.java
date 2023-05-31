package com.ceiba.biblioteca.entidades;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Prestamo {
    private String isbn;
    private String identificacionusuario;
    private Integer tipoUsuario;

    public Prestamo() {
    }

    public Prestamo(String isbn, String identificacionusuario, Integer tipoUsuario) {
        this.isbn = isbn;
        this.identificacionusuario = identificacionusuario;
        this.tipoUsuario = tipoUsuario;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIdentificacionusuario() {
        return identificacionusuario;
    }

    public void setIdentificacionusuario(String identificacionusuario) {
        this.identificacionusuario = identificacionusuario;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}

