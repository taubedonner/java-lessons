package ru.tn.courses.nzarudniy.v5.task_2;

import ru.tn.courses.nzarudniy.v5.task_2.users.*;

/**
 * <ul>
 *  <li>Необходимо разработать модель (тут на ваше усмотрение).</li>
 *  <li>Необходимо разработать интерфейс для преобразования модели в текст, json и xml.</li>
 *  <li>Реализовать классы для конкретных типов преобразований.</li>
 *  <li>Необходимо оформить все перечисления через enum</li>
 *  <li>Вынести общую логику в абстракцию</li>
 * </ul>
 * 
 * @author https://github.com/taubedonner
 */
public class Subtask1 {
    /**
     * @see ru.tn.courses.nzarudniy.v5.task_2.users.User Model class
     * @see ru.tn.courses.nzarudniy.v5.task_2.Subtask2 Working with model conversion types
     */
    public static void main(String[] args) {
        System.out.println(new UserXml(101L, User.Type.OWNER, "SampleUser", "usample@xxz.nz", "12345"));
    }
}
