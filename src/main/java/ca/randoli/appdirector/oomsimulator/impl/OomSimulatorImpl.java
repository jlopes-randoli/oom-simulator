package ca.randoli.appdirector.oomsimulator.impl;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class OomSimulatorImpl {

    @PostConstruct
    public void start() throws Exception {
        CreateOOMException();
    }

    private void CreateOOMException() throws Exception {
        List<Integer> data = new ArrayList<>();

        while (true) {
           data.add(1);
           System.out.printf("Loop Iteration: %s\n", data.size());
        }
    }
}
