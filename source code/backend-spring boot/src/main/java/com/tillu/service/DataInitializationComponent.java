package com.tillu.service;


import com.tillu.domain.USER_ROLE;
import com.tillu.model.User;
import com.tillu.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializationComponent implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        initializeAdminUser();
        initializeRadhikaUser();
    }

    private void initializeAdminUser() {        String adminUsername = "radhikaborigam04@gmail.com";

        if (userRepository.findByEmail(adminUsername)==null) {
            User adminUser = new User();

            adminUser.setPassword(passwordEncoder.encode("radhika123"));
            adminUser.setFullName("Radhika");
            adminUser.setEmail(adminUsername);
            adminUser.setRole(USER_ROLE.ROLE_ADMIN);

            User admin=userRepository.save(adminUser);
        }
    }

    private void initializeRadhikaUser() {
        String username = "radhikaborigam04@gmail.com";

        if (userRepository.findByEmail(username)==null) {
            User user = new User();

            user.setPassword(passwordEncoder.encode("radhika123"));
            user.setFullName("Radhika");
            user.setEmail(username);
            user.setRole(USER_ROLE.ROLE_ADMIN);

            User savedUser = userRepository.save(user);
        }
    }
}
