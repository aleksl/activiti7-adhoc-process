package pl.aleksl.activiti.activiti7runtimebundleadhocprocess.listeners;


import org.activiti.api.task.runtime.events.TaskCompletedEvent;
import org.activiti.api.task.runtime.events.listener.TaskEventListener;
import org.activiti.engine.ActivitiTaskAlreadyClaimedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AdHocTaskCompleteListener implements TaskEventListener<TaskCompletedEvent> {

    private Logger logger = LoggerFactory.getLogger(AdHocTaskCompleteListener.class);

    @Override
    public void onEvent(TaskCompletedEvent event) {
        logger.info("Do something, task is completed: " + event.getId());
        logger.info("Do something, task is completed: " + event.getBusinessKey());
        logger.info("Do something, task is completed: " + event.getProcessDefinitionId());
        logger.info("Do something, task is completed: " + event.getProcessDefinitionKey());
        logger.info("Do something, task is completed: " + event.getProcessInstanceId());
        logger.info("Do something, task is completed: " + event.getProcessDefinitionVersion());
        logger.info("Do something, task is completed: " + event.getParentProcessInstanceId());
        logger.info("Do something, task is completed: " + event.getEventType());
        logger.info("Do something, task is completed: " + event.getEntity());
        logger.info("Do something, task is completed: " + event.toString());
    }
}