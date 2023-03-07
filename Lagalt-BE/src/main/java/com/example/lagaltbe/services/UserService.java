package com.example.lagaltbe.services;

import com.example.lagaltbe.models.Users;

public interface UserService extends CrudService<Users, Integer>{
    Users findByName(String name);
}
