package model;

import java.util.*;

public class Users {
    private Map<Integer, User> users = new HashMap<Integer, User>();;
    private static Users instance;

    public Users(){

    }

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
        Set<User> usuarios = new TreeSet<>();
        if (users != null && !users.isEmpty()){
            usuarios.addAll(users.values());
        }
        return usuarios;
    }

    public void setUsers(HashMap<Integer, User> users) {
        this.users = users;
    }

    public void save(User u){
        if (users == null){
            users = new HashMap<Integer, User>();
        }
        users.put(u.getId(), u);
    }

    public User load(int id){
        return users.get(id);
    }

    public int size(){
        return users.size();
    }
}
