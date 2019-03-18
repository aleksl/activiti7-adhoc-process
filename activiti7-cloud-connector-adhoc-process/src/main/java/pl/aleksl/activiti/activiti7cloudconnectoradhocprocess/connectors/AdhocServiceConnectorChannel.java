package pl.aleksl.activiti.activiti7cloudconnectoradhocprocess.connectors;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface AdhocServiceConnectorChannel {
    String ADHOC_SERVICE_CONNECTOR_CHANNEL = "adhocServiceConnectorChannel";

    @Input(ADHOC_SERVICE_CONNECTOR_CHANNEL)
    SubscribableChannel adhocServiceConnectorChannel();

}
