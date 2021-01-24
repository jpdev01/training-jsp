package model;

import java.util.HashMap;
import java.util.List;

public class Users {
    private HashMap<Integer, User> users;
    private static Users instance;

    public static Users getInstance() {
        if (instance == null){
            setInstance(new Users());
        }
        return instance;
    }

    public static void setInstance(Users instance) {
        Users.instance = instance;
    }

    public HashMap<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, User> users) {
        this.users = users;
    }

    public void save(User u){
        users.put(u.getId(), u);
    }

    public User load(int id){
        return users.get(id);
    }

    public int size(){
        return users.size();
    }
}
