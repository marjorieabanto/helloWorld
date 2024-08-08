package com.example.helloWorld.service;

import com.example.helloWorld.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User user, String fingerprintBase64);
    public User getUserByFingerprint(String fingerprint);
    public Boolean deleteUserByFingerprint(String fingerprint);
    public Boolean validateUserByFingerprint(String fingerprint);
    public List<User> getAllUsers();

}
