package com.realestatefundanalyzer.realestatefundanalyzer;

public class User {

    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * The getId function returns the id of a given object.
     *
     *
     *
     * @return The id of the object
     *
     * @docauthor Trelent
     */
    public Long getId() {
        return id;
    }
}
