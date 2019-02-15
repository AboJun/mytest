package com.heima.com.heima.TCPDemo;

import java.util.ArrayList;
import java.util.List;

public class UserDB {

    private static List<User> users = new ArrayList<User>();

    static {

        users.add(new User("zhangsan", "123"));
        users.add(new User("lisi", "321"));
        users.add(new User("laowang", "456"));
        users.add(new User("liu", "654"));
    }
    public static List<User> getUsers(){
        return users;
    }


}
