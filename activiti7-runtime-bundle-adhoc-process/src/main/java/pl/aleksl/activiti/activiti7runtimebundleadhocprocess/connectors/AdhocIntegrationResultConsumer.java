package pl.aleksl.activiti.activiti7runtimebundleadhocprocess.connectors;

import org.activiti.cloud.api.process.model.IntegrationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class AdhocIntegrationResultConsumer {

    private Logger logger = LoggerFactory.getLogger(AdhocIntegrationResultConsumer.class);


    @Value("${spring.application.name}")
    private String appName;

    @StreamListener(value = "integrationResultsConsumer")
    public void processServiceAdhoc(IntegrationRequest event) throws InterruptedException {

        logger.error("Message back from connector " + appName);
        logger.error(event.getAppName());


    }

}
