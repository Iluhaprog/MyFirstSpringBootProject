package testpack.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testpack.dao.type.User;
import testpack.mappers.UserMapper;
import testpack.services.interfaces.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return this.userMapper.getUserById(id);
    }

    @Override
    public String insertUser(User user) {
        userMapper.insertUser(user);
        return "ok";
    }

    @Override
    public String deleteUserById(int id) {
        userMapper.deleteUser(id);
        return "user deleted";
    }

    @Override
    public String updateUser(User user) {
        userMapper.updateUser(user);
        return "user updated";
    }

    @Override
    public List<User> getAll() {
        return this.userMapper.getAll();
    }
}
