package topic_10_methods;

public class Main {
    public static void main(String[] args) {
        User[] boys = {
                new User("Vasya", 21),
                new User("Petya", 25),
                new User("Max", 19)
        };


        User[] vegetabels = {
                new User("koks", 222),
                new User("abrikos", 232),
                new User("tomat", 194)
        };


        User[] girls = {
                new User("anya", 19),
                new User("olya", 21),
                new User("masha", 20)
        };
//        Helper helper = new Helper();
//        helper.iter(boys);
//        helper.iter(girls);
//        helper.iter(vegetabels);
//
//        Helper helper2= new Helper(boys);
//        helper2.iter(girls);
        Helper.iter(girls);
    }

}
