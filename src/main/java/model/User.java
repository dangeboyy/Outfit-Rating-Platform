package model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class User {
    private String userName;
    private String password;
    private ArrayList<String> followers;
    private ArrayList<String> following;
    private ArrayList<String> collectionContent;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.followers=new ArrayList<>();
        this.following=new ArrayList<>();
        this.collectionContent=new ArrayList<>();
    }
    
    

    public User() {

    }
}
