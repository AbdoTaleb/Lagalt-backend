package com.example.lagaltbe.services;

import com.example.lagaltbe.models.Users;
import com.example.lagaltbe.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
//    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users findById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public Users findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public Collection<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Users add(Users entity) {
        return null;
    }

    @Override
    public Users update(Users entity) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Users entity) {

    }
}
