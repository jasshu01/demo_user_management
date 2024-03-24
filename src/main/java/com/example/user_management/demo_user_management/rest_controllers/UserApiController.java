package com.example.user_management.demo_user_management.rest_controllers;

import com.example.user_management.demo_user_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
class UserApiController {

    @GetMapping("/test")
    public String testEndPoint() {
        return "Test End Point Working";
    }
}
