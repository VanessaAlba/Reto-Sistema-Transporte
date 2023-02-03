package com.lauraAlba.Reto.SistemaTransportre.Controller;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Destino;
import com.lauraAlba.Reto.SistemaTransportre.service.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("destino")
public class DestinoController {
    @Autowired
    private IDestinoService destino;

    @GetMapping("/listar")
    public ResponseEntity obtenerDestinos() {
        return new ResponseEntity(destino.obtenerDestinos(), HttpStatus.FOUND);
    }

    @PostMapping("/agregar")
    public ResponseEntity agregarDestino(@RequestBody Destino nuevoDestino) {
        destino.agregarDestino(nuevoDestino);
        return new ResponseEntity(nuevoDestino,HttpStatus.ACCEPTED);
    }
}
