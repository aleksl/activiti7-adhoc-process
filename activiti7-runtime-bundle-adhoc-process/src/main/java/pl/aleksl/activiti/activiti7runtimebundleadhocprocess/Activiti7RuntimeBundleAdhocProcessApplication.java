package pl.aleksl.activiti.activiti7runtimebundleadhocprocess;

import org.activiti.cloud.starter.rb.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ActivitiRuntimeBundle
public class Activiti7RuntimeBundleAdhocProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(Activiti7RuntimeBundleAdhocProcessApplication.class, args);
	}

}
