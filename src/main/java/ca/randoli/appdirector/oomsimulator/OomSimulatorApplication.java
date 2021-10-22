package ca.randoli.appdirector.oomsimulator;

import ca.randoli.appdirector.oomsimulator.impl.OomSimulatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OomSimulatorApplication {
	public static void main(String[] args) { SpringApplication.run(OomSimulatorApplication.class, args); }
}
