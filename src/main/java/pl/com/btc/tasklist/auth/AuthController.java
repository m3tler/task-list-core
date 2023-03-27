package pl.com.btc.tasklist.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    @GetMapping
    public AuthenticationBean authenticate() {
        return new AuthenticationBean("You are authenticated");
    }
}
