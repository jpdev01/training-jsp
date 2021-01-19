package model;

import java.util.Objects;

public class Contato {
    private Integer id;
    private String name;
    private String telephone;

    public Contato(Integer id, String name, String phone){
        this.setId(id);
        this.setName(name);
        this.setTelephone(phone);
    }

    public Contato(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id) && Objects.equals(name, contato.name) && Objects.equals(telephone, contato.telephone);
    }
}
