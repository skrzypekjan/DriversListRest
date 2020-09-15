package pl.skrzypekjan.drivers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.skrzypekjan.drivers.model.Driver;
import pl.skrzypekjan.drivers.service.DriverService;


@RestController
@CrossOrigin
@RequestMapping(value = "/cars", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class DriverController {

    private DriverService driverService;

    @Autowired
    public DriverController(DriverService carService) {
        this.driverService = carService;
    }

    @GetMapping()
    public ResponseEntity<List<Driver>> getAllCars(){
        return new ResponseEntity<>(driverService.findAllDrivers(), HttpStatus.OK);
    }
}
