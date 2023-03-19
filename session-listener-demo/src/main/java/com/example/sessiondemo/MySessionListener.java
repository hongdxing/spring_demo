package com.example.sessiondemo;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class MySessionListener implements HttpSessionListener  {
	
	//private static final Logger LOG= LoggerFactory.getLogger(HttpSessionListenerConfig.class);

    private final AtomicInteger activeSessions;

    public MySessionListener() {
        super();
        activeSessions = new AtomicInteger();
    }


    /**
     * This method will be called when session created
     * @param sessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        log.info("-------Incrementing Session Counter--------");
        activeSessions.incrementAndGet();
        log.info("-------Session Created--------");
        sessionEvent.getSession().setAttribute("activeSessions",activeSessions.get());
        log.info("Total Active Session : {} ", activeSessions.get());
    }

    /**
     * This method will be automatically called when session destroyed
     * @param sessionEvent
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        log.info("-------Decrementing Session Counter--------");
        activeSessions.decrementAndGet();
        sessionEvent.getSession().setAttribute("activeSessions",activeSessions.get());
        log.info("-------Session Destroyed--------");
    }


}
