package by.tms.SpringBootCalculator.service;

import by.tms.SpringBootCalculator.dao.InMemoryUserDao;
import by.tms.SpringBootCalculator.dao.UserDao;
import by.tms.SpringBootCalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean save(User user) {
        Optional<User> byUsername = findByUsername(user.getUsername());
        if(byUsername.isPresent()){
            return false;
        }
        userDao.save(user);
        return true;
    }

    @Override
    public Optional<User> findByUsername(String username){
        return userDao.findByUsername(username);
    }
}
