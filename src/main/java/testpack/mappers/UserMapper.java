package testpack.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testpack.dao.type.User;
import java.util.List;

@Mapper
@Repository
public interface UserMapper{

    public User getUserById(int id);
    public void insertUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public List<User> getAll();

}
