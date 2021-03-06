package com.heima.com.heima.TCPDemo;

import java.io.FileOutputStream;
import java.util.Objects;

public class User {
    private String username ;
    private String password;
    User(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword(){
         return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

}
