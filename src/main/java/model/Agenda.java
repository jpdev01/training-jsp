package model;

import java.util.*;

public class Agenda {

    public class NameComparator implements Comparator<Contato>{
      // ordenar
        @Override
        public int compare(Contato c1, Contato c2) {
            return c1.getName().compareTo(c2.getName());
        }
    }

    private static Agenda instance;
    private Map<Integer, Contato> contatos = new HashMap<Integer, Contato>(); // id de contato para contato
    private NameComparator nomeComparator = new NameComparator();
    private int proximoId = 1;

    private Agenda(){
        Contato c = null;

        c = new Contato();
        c.setName("José");
        c.setTelephone("0000000");
        salvar(c);

        c = new Contato();
        c.setName("Maria");
        c.setTelephone("22222222");
        salvar(c);
    }

    public static Agenda getInstance(){
        if (instance == null){
            setInstance(new Agenda());
        }
        return instance;
    }

    public void salvar(Contato c){
        if(c.getId() == null){
            c.setId(gerarId());
        }
    }

    public static void setInstance(Agenda instance) {
        Agenda.instance = instance;
    }

    public Set<Contato> getContatos() {
        Set<Contato> set = new TreeSet<Contato>(nomeComparator);
        set.addAll(contatos.values());
        return set;
    }

    public void setContatos(Map<Integer, Contato> contatos) {
        this.contatos = contatos;
    }

    public NameComparator getNomeComparator() {
        return nomeComparator;
    }

    public void setNomeComparator(NameComparator nomeComparator) {
        this.nomeComparator = nomeComparator;
    }

    public int getProximoId() {
        return proximoId;
    }

    public void setProximoId(int proximoId) {
        this.proximoId = proximoId;
    }
}
