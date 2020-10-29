package topic_2_classes_3_constructor;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.id = 1;
        u1.login = "John";
        u1.password = "1111";
        u1.age = 31;
        u1.sex = "man";
        u1.weight = 70.5F;
        u1.height = 187.2;
        u1.isActive = true;
        u1.specialSymbol = '$';
        System.out.println(u1);
        System.out.println(u1.login);

        User u2 = new User(  2, "kokos", "2222", (byte) 21, "man", 67.5F,176.1,true,'*' );
    }

}
