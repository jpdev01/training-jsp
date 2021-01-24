package model;

public class User {
    private int id;
    private String login;
    private String password;
    private String permissao;

    public void User(){

    }

    public void User(int id, String login, String pass, String permissao){
        this.setId(id);
        this.setLogin(login);
        this.setPassword(pass);
        this.setPermissao(permissao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public boolean isAdm(){
        if (this.permissao == "adm"){
            return true;
        }
        return false;
    }
}
