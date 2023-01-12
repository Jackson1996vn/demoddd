package com.example.demoddd.infrastracture.repository.user;

import com.example.demoddd.domain.entity.User;
import com.example.demoddd.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MySQLUserRepository implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Autowired
    public MySQLUserRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<UserEntity> userEntityOptional = userJpaRepository.findById(id);
        if (userEntityOptional.isPresent()) {
            UserEntity userEntity = userEntityOptional.get();
            User user = new User();
            user.setId(userEntity.getId());
            user.setName(userEntity.getName());
            user.setAge(userEntity.getAge());
            user.setGender(userEntity.getGender());
            return Optional.of(user);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void save(User user) {
        userJpaRepository.save(new UserEntity(user.getId(), user.getName(), user.getAge(), user.getGender()));
    }
}
