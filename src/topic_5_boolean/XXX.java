package topic_5_boolean;

public class XXX {//може бути довільна назва класу, не обовязково Main

    public static void main(String[] args) {
        User kokos = new User(1, 21, "kokos", 10000);
        User abrikos = new User(2, 22, "Abrikos", 9000);
        // > < >= <= == !=
        boolean result = kokos.age > abrikos.age;
        result = kokos.cash != abrikos.cash;
        System.out.println(result);

        String a ="test";
        String b =  new String ("test");
        System.out.println(a==b);
        System.out.println(a.equals(b));



    }
}
