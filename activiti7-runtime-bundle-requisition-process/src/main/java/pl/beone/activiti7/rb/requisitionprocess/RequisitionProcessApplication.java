package pl.beone.activiti7.rb.requisitionprocess;

import org.activiti.cloud.starter.rb.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ActivitiRuntimeBundle
public class RequisitionProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequisitionProcessApplication.class, args);
	}

}
