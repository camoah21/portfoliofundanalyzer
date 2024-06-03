package com.realestatefundanalyzer.realestatefundanalyzer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    /**
     * The login function is responsible for authenticating a user. It takes in
     * the username and password as parameters, and returns an HTTP response
     * with either a success or failure message.
     *
     * @param @RequestParam String username Get the username from the request
     * body
     * @param @RequestParam String password Get the password from the request
     *
     * @return A responseentity&lt;string&gt; object
     *
     * @docauthor Chris Amoah
     */
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        Optional<User> userOpt = authService.authenticate(username, password);
        if (userOpt.isPresent()) {
            // Generate JWT token (or any session token) here
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
