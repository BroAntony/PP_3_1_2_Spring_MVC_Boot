package orgexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import orgexample.service.IUserService;

@Controller
@RequestMapping("/")
public class AppController {
    @Autowired
    private final IUserService userService;

    @Autowired
    public AppController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String usersPage() {
        return "index";
    }
}