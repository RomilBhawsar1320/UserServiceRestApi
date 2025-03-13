package com.newgen.UserServiceRestApi.listener;

import com.newgen.UserServiceRestApi.dto.UserDto;
import com.newgen.UserServiceRestApi.model.Address;
import com.newgen.UserServiceRestApi.model.Geo;
import com.newgen.UserServiceRestApi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationEventListener {

    private final UserService userService;
    public ApplicationEventListener(UserService userService) {
        this.userService = userService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void handleEvent(ApplicationEvent event) {
        log.info("Application event received");
        initializeUsers();
    }
    private void initializeUsers() {
    }

}
