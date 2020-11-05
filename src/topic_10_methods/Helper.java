package topic_10_methods;

public class Helper {

    User[] users;

    public Helper() {
    }

    public Helper(User[] users) {
        this.users = users;
    }

    static void iter(User[] users) {
        for (User user : users) {
            if (user.age > 20) System.out.println(user);
        }
        System.out.println("------------");
    }

    void iter() {
        for (User user : users) {
            if (user.age > 20) System.out.println(user);
        }
        System.out.println("------------");
    }
}
