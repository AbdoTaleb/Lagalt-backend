package com.example.lagaltbe.runners;


import com.example.lagaltbe.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    private final UserRepository userRepository;

    public AppRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("------> " + userRepository.findAll());
        System.out.println("---------> " + userRepository
                .findById(1).get());
    }
}
