package com.ceiba.biblioteca.controlador;


import com.ceiba.biblioteca.entidad.Prestamo;
import com.ceiba.biblioteca.servicio.PrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestamoControlador {
    @Autowired
    public PrestamoServicio prestamoServicio;


    @PostMapping("/prestamo")
    public ResponseEntity<?> crearprestamo(@RequestBody Prestamo prestamo){

        try {
            Prestamo prestamoCreado = prestamoServicio.crearPrestamo(prestamo);
            return new ResponseEntity(prestamoCreado, HttpStatus.OK);

        }catch (Exception e){
            return ResponseEntity.badRequest().body("{\"mensaje\": \"" + e.getMessage() + "\"}");
        }

    }
}

