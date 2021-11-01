package ru.tn.courses.nzarudniy.v5.task_2.users;

public class UserJson extends User {
    public UserJson(Long id, Type type, String username, String email, String password) {
        super(id, type, username, email, password);
    }

    public UserJson(User user) {
        super(user);
    }

    @Override
    public String convert() {
        return new StringBuilder().append("{\n\t\"id\": ").append(getId()).append(",\n")
            .append("\t\"type\": \"").append(getType()).append("\",\n")
            .append("\t\"username\": \"").append(getUsername()).append("\",\n")
            .append("\t\"email\": \"").append(getEmail()).append("\",\n")
            .append("\t\"password\": \"").append(getPassword()).append("\"\n}\n")
            .toString();
    }
}
