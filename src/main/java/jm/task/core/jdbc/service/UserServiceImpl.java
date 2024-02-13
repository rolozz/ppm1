package jm.task.core.jdbc.service;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
   private UserDao userDaoJDBCVersion = new UserDaoJDBCImpl();

    public UserServiceImpl() throws SQLException {
    }


    public void createUsersTable() {
        userDaoJDBCVersion.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBCVersion.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBCVersion.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoJDBCVersion.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoJDBCVersion.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoJDBCVersion.cleanUsersTable();
    }
}
