package com.lauraAlba.Reto.SistemaTransportre.Controller;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Bus;
import com.lauraAlba.Reto.SistemaTransportre.service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vehiculo")
public class BusController {

    @Autowired
    private IBusService vehiculo;

    @GetMapping("/listar")
    public ResponseEntity obtenerVehiculos() {
        return new ResponseEntity(vehiculo.obtenerVehiculos(), HttpStatus.FOUND);
    }

    @PostMapping("/agregar/bus")
    public ResponseEntity agregarBus(@RequestBody Bus nuevoBus) {
        vehiculo.agregarBus(nuevoBus);
        return new ResponseEntity(nuevoBus,HttpStatus.ACCEPTED);
    }

}
