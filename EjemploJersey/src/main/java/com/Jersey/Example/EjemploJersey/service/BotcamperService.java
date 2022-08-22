package com.Jersey.Example.EjemploJersey.service;

import com.Jersey.Example.EjemploJersey.model.BootCamper;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import java.util.ArrayList;
import java.util.List;

@Service
public class BotcamperService {
    private List<BootCamper>  bootCams = new ArrayList<BootCamper>();

    public List<BootCamper> getAll() {
        return bootCams;
    }
    public void addBootCams(BootCamper bootcamper) {
        bootCams.add(bootcamper);
    }
    public void removeBootCams(String name) {
        bootCams.remove(name);
    }

}
