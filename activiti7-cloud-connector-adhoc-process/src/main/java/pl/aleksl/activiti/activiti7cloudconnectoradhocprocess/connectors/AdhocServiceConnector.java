package pl.aleksl.activiti.activiti7cloudconnectoradhocprocess.connectors;

import org.activiti.cloud.api.process.model.IntegrationRequest;
import org.activiti.cloud.api.process.model.IntegrationResult;
import org.activiti.cloud.connectors.starter.channels.IntegrationResultSender;
import org.activiti.cloud.connectors.starter.configuration.ConnectorProperties;
import org.activiti.cloud.connectors.starter.model.IntegrationResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@EnableBinding(AdhocServiceConnectorChannel.class)
public class AdhocServiceConnector {

    private Logger logger = LoggerFactory.getLogger(AdhocServiceConnector.class);
    private final IntegrationResultSender integrationResultSender;

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private ConnectorProperties connectorProperties;


    public AdhocServiceConnector(IntegrationResultSender integrationResultSender) {
        this.integrationResultSender = integrationResultSender;
    }

    @StreamListener(value = AdhocServiceConnectorChannel.ADHOC_SERVICE_CONNECTOR_CHANNEL)
    public void processServiceAdhoc(IntegrationRequest event) throws InterruptedException {

        logger.error("Run process service adhoc by listener");

        Map<String, Object> results = new HashMap<>();
        results.put("someVariable", "testAdHocService");
        Message<IntegrationResult> message = IntegrationResultBuilder.resultFor(event, connectorProperties)
                .withOutboundVariables(results)
                .buildMessage();
        integrationResultSender.send(message);
    }

}
