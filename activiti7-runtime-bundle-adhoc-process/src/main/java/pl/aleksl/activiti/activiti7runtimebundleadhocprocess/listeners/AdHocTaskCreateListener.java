package pl.aleksl.activiti.activiti7runtimebundleadhocprocess.listeners;

import org.activiti.api.task.runtime.events.TaskCompletedEvent;
import org.activiti.api.task.runtime.events.TaskCreatedEvent;
import org.activiti.api.task.runtime.events.listener.TaskEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AdHocTaskCreateListener implements TaskEventListener<TaskCreatedEvent> {

    private Logger logger = LoggerFactory.getLogger(AdHocTaskCompleteListener.class);

    @Override
    public void onEvent(TaskCreatedEvent event) {
        logger.info("Do something, task is created: " + event.getId());
        logger.info("Do something, task is created: " + event.getBusinessKey());
        logger.info("Do something, task is created: " + event.getProcessDefinitionId());
        logger.info("Do something, task is created: " + event.getProcessDefinitionKey());
        logger.info("Do something, task is created: " + event.getProcessInstanceId());
        logger.info("Do something, task is created: " + event.getProcessDefinitionVersion());
        logger.info("Do something, task is created: " + event.getParentProcessInstanceId());
        logger.info("Do something, task is created: " + event.getEventType());
        logger.info("Do something, task is created: " + event.getEntity());
        logger.info("Do something, task is created: " + event.toString());
    }
}