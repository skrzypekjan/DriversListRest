package pl.skrzypekjan.drivers.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.skrzypekjan.drivers.model.Driver;


import java.util.ArrayList;

@Service
public class DriverServiceImpl implements DriverService {

    public static long count = 1;
    private List<Driver> driverList;


    public DriverServiceImpl() {
        driverList = new ArrayList<>();
    }

    @EventListener(ApplicationReadyEvent.class)
    public void addCars(){
        driverList.add(new Driver("GD123", "COCACOLA", "1", "GOTOWE DO ODBIORU"));
        driverList.add(new Driver("GD234", "COCACOLA", "2", "OCZEKIWANIE"));
        driverList.add(new Driver("GD543", "PEPSI", "3", "OCZEKIWANIE"));
    }

    @Override
    public List<Driver> findAllDrivers() {
        return driverList;
    }
}
