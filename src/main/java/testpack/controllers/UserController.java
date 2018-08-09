package testpack.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import testpack.dao.type.User;
import testpack.services.interfaces.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public User getById(int id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/insert-user" , method = RequestMethod.POST)
    public String insertUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public String deleteById(int id){
        return userService.deleteUserById(id);
    }

    @RequestMapping(value = "/update-user" , method = RequestMethod.PUT)
    public String updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping(value = "test" , method = RequestMethod.GET)
    public String getTest(){
        return "Hello world!";
    }




}
