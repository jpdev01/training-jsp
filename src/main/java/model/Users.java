package model;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

    public Set<User> getUsers() {
        if (users != null && !users.isEmpty()){
            Set<User> usuarios = new TreeSet<>();
            usuarios.addAll(users.values());
            return usuarios;
        }
        return null;
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
