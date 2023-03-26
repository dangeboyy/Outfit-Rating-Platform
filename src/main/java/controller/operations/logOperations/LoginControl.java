package controller.operations.logOperations;

import controller.data.Data;
import model.User;

public class LoginControl   {

    public static boolean LogIn(String userName, String password) {
        boolean logInControl = false;
        for (User value : Data.users.getUsers()) {
            if (userName.equals(value.getUserName())) {
                if (password.equals(value.getPassword())) {
                    System.out.println("Welcome " + value.getUserName());
                    logInControl = true;
                    return logInControl;
                }
            }
        }
        System.out.println("Email or password is wrong!!");
        return logInControl;
    }







}
