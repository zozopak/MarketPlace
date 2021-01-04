package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{
   private UserRepo userRepo;

   @Autowired
   public void setUserRepo(UserRepo userRepo){
       this.userRepo=userRepo;
   }


    @Override
    public List<User> findAll() {
       return userRepo.findAll();
    }

    @Override
    public Optional<User> getUser(long id) {
        return userRepo.findById(id);
    }

    @Override
    public void deleteUser(long id) {
      userRepo.deleteById(id);
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }
}
