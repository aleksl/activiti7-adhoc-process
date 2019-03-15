package pl.aleksl.activiti.activiti7cloudconnectoradhocprocess.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/v1")
@RestController
@RefreshScope
public class Activiti7CloudConnectorAdhocProcessController {

    private Logger logger = LoggerFactory.getLogger(Activiti7CloudConnectorAdhocProcessController.class);

    @Value("${spring.application.name}")
    private String appName;


    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String welcome() {
        return "{ \"welcome\": \"Welcome to the Adhoc process Service\" }";
    }
}
