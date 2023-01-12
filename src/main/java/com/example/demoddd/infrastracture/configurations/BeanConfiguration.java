package com.example.demoddd.infrastracture.configurations;

import com.example.demoddd.DemodddApplication;
import com.example.demoddd.domain.repository.UserRepository;
import com.example.demoddd.domain.service.DomainUserService;
import com.example.demoddd.domain.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DemodddApplication.class)
public class BeanConfiguration {

    @Bean
    UserService userService(final UserRepository userRepository) {
        return new DomainUserService(userRepository);
    }
}
