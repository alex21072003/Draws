package com.example.DrawLoterya.controllers;

import com.example.DrawLoterya.dto.UserDto;
import com.example.DrawLoterya.service.CurrentUserCRUDService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class RestCotrollers {
    public final CurrentUserCRUDService currentUserCRUDService;
    public RestCotrollers(CurrentUserCRUDService currentUserCRUDService) {
        this.currentUserCRUDService =currentUserCRUDService;
    }
    public void createUser(@RequestBody UserDto userDto) {
        System.out.println("User dto - " + userDto);
        currentUserCRUDService.create(userDto);
    }
}
