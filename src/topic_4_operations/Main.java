package topic_4_operations;

import topic_2_classes_3_constructor.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(2, "kokos", "2222", (byte) 21, "man", 67.5F, 176.1, true, '*');
        User user2 = new User(10, "abrikos", "1234", (byte) 34, "feman", 45.5F, 172.3, true, '^');
        int result = user1.age + user2.age;  //cntr+alt+v  обгортка
        double result2 = (double) user2.age / (double) user1.age;

        user1.age = (byte) (user1.age++);

        int x = 0;
        int y = 0;


        System.out.println("x=" + ++x + "y=" + y++);
        System.out.println(user1.age+user2.age+user1.login);
        System.out.println(user1.login+(user1.age+user2.age));


    }
}
