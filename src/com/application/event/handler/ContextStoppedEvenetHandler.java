package com.application.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEvenetHandler implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("ContextStoppedEvent received.......");
        System.out.println(contextStoppedEvent.getSource());
    }
}
