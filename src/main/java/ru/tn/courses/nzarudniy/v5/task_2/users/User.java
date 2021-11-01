package ru.tn.courses.nzarudniy.v5.task_2.users;

/**
 * Base class of the User model
 * 
 * @author https://github.com/taubedonner
 */
public abstract class User implements IConvertable {
    private Long id;
    private Type type;
    private String username;
    private String email;
    private String password;

    public User() {}

    public User(User user) {
        this(user.getId(), user.getType(), user.getUsername(), user.getEmail(), user.getPassword());
    }

    public User(Long id, Type type, String username, String email, String password) {
        this.id = id;
        this.type = type;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public Long getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }
    
    public String getPassword() {
        return this.password;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public User setType(Type type) {
        this.type = type;
        return this;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    // Better convert() implementation
    // @Override
    // public String toString() {
    //     return null;
    // }

    public enum Type {
        VIEWER, EDITOR, OWNER
    }
}