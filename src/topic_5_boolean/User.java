package topic_5_boolean;

public class User {
    public int id;
    public int age;
    public String name;
    public int cash;

    public User() {
    }

    public User(int id, int age, String name, int cash) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", cash=" + cash +
                '}';
    }
}
