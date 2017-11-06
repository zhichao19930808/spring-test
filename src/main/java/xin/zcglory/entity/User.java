package xin.zcglory.entity;

import java.util.List;
import java.util.Map;

public class User {
    private String id;
    private String name;
    private Member member;
    private List<String> home;
    private Map<String,Account> accounts;


    public User() {
    }

    public User(String id, String name, Member member, List<String> home, Map<String, Account> accounts) {
        this.id = id;
        this.name = name;
        this.member = member;
        this.home = home;
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<String> getHome() {
        return home;
    }

    public void setHome(List<String> home) {
        this.home = home;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }
}
