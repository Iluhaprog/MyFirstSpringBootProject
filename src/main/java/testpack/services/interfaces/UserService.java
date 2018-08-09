package testpack.services.interfaces;

import testpack.dao.type.User;
import java.util.List;

public interface UserService {

    public User getUserById(int id);
    public String insertUser(User user);
    public String deleteUserById(int id);
    public String updateUser(User user);
    public List<User> getAll();

}
