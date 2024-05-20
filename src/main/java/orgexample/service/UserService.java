package orgexample.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orgexample.dao.IUserDao;
import orgexample.model.User;
import java.util.List;

@Transactional
@Service
public class UserService implements IUserService {

    private IUserDao userDao;

    @Autowired
    public UserService (IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteAllUsers() {
        userDao.deleteAllUsers();
    }
}
