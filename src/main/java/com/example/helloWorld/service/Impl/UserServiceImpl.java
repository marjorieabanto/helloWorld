package com.example.helloWorld.service.Impl;


import com.example.helloWorld.model.User;
import com.example.helloWorld.repository.UserRepository;
import com.example.helloWorld.service.UserService;
import com.zkteco.biometric.FingerprintSensorEx;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public User createUser(User user, String fingerprintBase64) {

        return null;
    }

    @Override
    public User getUserByFingerprint(String fingerprint) {
        return null;
    }

    @Override
    public Boolean deleteUserByFingerprint(String fingerprint) {
        return null;
    }

    @Override
    public Boolean validateUserByFingerprint(String fingerprint) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> fetchById(long id) {
        return userRepository.findById(id);
    }

}
