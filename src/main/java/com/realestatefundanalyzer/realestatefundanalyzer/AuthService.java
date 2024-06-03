package com.realestatefundanalyzer.realestatefundanalyzer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * The authenticate function takes a username and password as input, then
     * checks if the user exists in the database. If so, it compares the
     * provided password with that of the stored user's. If they match, it
     * returns an Optional containing that User object; otherwise it returns an
     * empty Optional.
     *
     * @param String username Find the user in the database
     * @param String password Compare the password entered by the user to the
     * hashed password in our database
     *
     * @return An optional&lt;user&gt; which is a wrapper class that contains
     * the user object
     *
     * @docauthor Trelent
     */
    public Optional<User> authenticate(String username, String password) {
        Optional<User> userOpt = userRepository.findByUsername(username);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            if (passwordEncoder.matches(password, user.getPassword())) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
