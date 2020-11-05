package topic_11_get_set_private;

public class Main {
    public static void main(String[] args) {
        User user = new User(1111,"sjdkf");
        user.setId(11);
        System.out.println(user.getId("1111"));
         user.setId(user.getId("1111")+9);
        System.out.println(user);
    }
}
