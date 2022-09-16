package com.patientAppointment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("patientController")
@SpringBootApplication
public class PatientAppointmentApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PatientAppointmentApplication.class, args);
	}

}