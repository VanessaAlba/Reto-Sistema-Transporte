package com.lauraAlba.Reto.SistemaTransportre.Controller;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Pasajero;
import com.lauraAlba.Reto.SistemaTransportre.service.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pasajero")
public class PasajeroController {

    @Autowired
    private IPasajeroService pasajero;

    @GetMapping("/listar")
    public ResponseEntity obtenerPasajeros() {
        return new ResponseEntity(pasajero.obtenerPasajeros(), HttpStatus.FOUND);
    }

    @PostMapping("/agregar")
    public ResponseEntity agregarDestino(@RequestBody Pasajero nuevoPasajero) {
        pasajero.agregarPasajero(nuevoPasajero);
        return new ResponseEntity(nuevoPasajero,HttpStatus.ACCEPTED);
    }
}
