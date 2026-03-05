package org.example;

import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;


    public AuthenticationService(ArrayList<User> users){
        this.users = users;
    }

    @Override
    public User signUp(String username, String password) {
        ArrayList<String> usernames = new ArrayList<>();
        for (User user : users){
            usernames.add(user.getUsername());
        }

        if (usernames.contains(username)){
            return null;
        } else {
            return new User(username, password);
        }


    }

    @Override
    public User logIn(String username, String password) {
        ArrayList<String> usernames = new ArrayList<>();
        for (User user : users){
            usernames.add(user.getUsername());
        }
        int index = usernames.indexOf(password);

        if (users.get(index).getPassword().equals(password)){
            return users.get(index);
        }
        return null;
    }
}