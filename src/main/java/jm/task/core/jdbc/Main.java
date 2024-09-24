package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Tolik", "Polernik", (byte) 25);
        userService.saveUser("Serega", "Shtir", (byte) 30);
        userService.saveUser("Misha", "Fomka", (byte) 35);
        userService.saveUser("Anya", "Lunova", (byte) 40);
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

