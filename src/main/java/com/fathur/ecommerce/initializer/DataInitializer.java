package com.fathur.ecommerce.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.fathur.ecommerce.entity.User;
import com.fathur.ecommerce.repository.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        String adminEmail = "admin@gmail.com";
        String adminPassword = "admin";

        if (!userRepository.existsByEmail(adminEmail)) {
            User admin = new User();
            admin.setName("Administrator");
            admin.setEmail(adminEmail);
            admin.setPassword(passwordEncoder.encode(adminPassword));
            admin.setRole("ROLE_ADMIN");
            admin.setAccountStatusNonLocked(true);
            admin.setIsEnable(true);
            admin.setAccountfailedAttemptCount(0);
            admin.setAccountLockTime(null);
            userRepository.save(admin);

            System.out.println("Admin user created with email: " + adminEmail + " password: " + adminPassword
                    + " role: ROLE_ADMIN");
        } else {
            System.out.println("Admin user already exists with email: " + adminEmail);
        }
    }

}
