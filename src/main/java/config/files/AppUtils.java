package config.files;

import model.User;
import model.Users;

public class AppUtils {
    private String appUrl = "http://localhost:8081/training_jsp_war_exploded/";
    private static AppUtils instance;

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public static AppUtils getInstance() {
        if (instance == null){
            instance = new AppUtils();
        }
        if (Users.getInstance().getUsers() != null && Users.getInstance().getUsers().isEmpty()){
            User u = new User("adm", "adm", "adm");
            Users.getInstance().save(u);
        }
        return instance;
    }

    public void setInstance(AppUtils instance) {
        this.instance = instance;
    }
}
