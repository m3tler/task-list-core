package pl.com.btc.tasklist.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    @GetMapping
    public AuthenticationBean authenticate() {
        return new AuthenticationBean("You are authenticated");
    }

    static class AuthenticationBean {

        private String message;

        public AuthenticationBean(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return String.format("HelloWorldBean [message=%s]", message);
        }
    }
}
