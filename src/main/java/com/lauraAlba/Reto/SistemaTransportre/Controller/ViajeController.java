package com.lauraAlba.Reto.SistemaTransportre.Controller;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Viaje;
import com.lauraAlba.Reto.SistemaTransportre.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("viaje")
public class ViajeController {
    @Autowired
    private IViajeService viaje;

    @GetMapping("/listar")
    public ResponseEntity obtenerViajes() {
        return new ResponseEntity(viaje.obtenerViajes(), HttpStatus.FOUND);
    }

    @PostMapping("/agregar")
    public ResponseEntity agregarViaje(@RequestBody Viaje nuevoViaje){
        viaje.agregarViaje(nuevoViaje);
        return new ResponseEntity(nuevoViaje,HttpStatus.ACCEPTED);
    }

}
