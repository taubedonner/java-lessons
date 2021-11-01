package ru.tn.courses.nzarudniy.v5.task_2;

import ru.tn.courses.nzarudniy.v5.task_2.users.*;

/**
 * Написать программу, в которой на вход подается сущность
 * и в зависимости от типа исполняется основная бизнес логика
 * 
 * @author https://github.com/taubedonner
 */
public class Subtask2 {

    public static void main(String[] args) {
        User user = new UserText(0L, User.Type.VIEWER, "e49gjb62", "cfaint@xxz.nz", "cbe8wtv56idk7");
        printUser(user);

        /** Reassign different type */
        user = new UserJson(1L, User.Type.EDITOR, "apr151", "apresnyakova@xxz.nz", "RkI24xSYs8qQ");
        printUser(user);

        printUser(new UserXml(2L, User.Type.OWNER, "iivanov", "iivanov@xxz.nz", "Админ961984"));
    }

    /** Check via common interface */
    private static String serialize(IConvertable obj) {
        return obj.convert();
    }

    /** Check via super class and instanceof */
    private static void printUser(User user) {
        if (user instanceof UserText) {
            System.out.println("Warning! This object will be output in raw format.");
        }

        if (user instanceof UserJson) {
            /** Crutchy */
            User tmp = new UserJson(user);
            tmp.setPassword("********");
        }

        System.out.println(serialize(user));
    }
}
