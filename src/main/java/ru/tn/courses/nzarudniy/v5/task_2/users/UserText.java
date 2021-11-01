package ru.tn.courses.nzarudniy.v5.task_2.users;

public class UserText extends User {
    public UserText() {
        super();
    }

    public UserText(User user) {
        super(user);
    }
    
    public UserText(Long id, Type type, String username, String email, String password) {
        super(id, type, username, email, password);
    }

    @Override
    public String convert() {
        return new StringBuilder().append("ID: ").append(getId())
            .append("\nType: ").append(getType())
            .append("\nUsername: ").append(getUsername())
            .append("\nEmail: ").append(getEmail())
            .append("\nPassword: ").append(getPassword()).append('\n')
            .toString();
    }
}
