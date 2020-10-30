package topic_6_if_else;

import topic_5_boolean.User;

public class Main {
    public static void main(String[] args) {
        User kokos = new User(1, 21, "kokos", 10000);
        User abrikos = new User(2, 22, "Abrikos", 9000);
        User tomat = new User(3, 35, "Tomat", 30000);
        String result="";

        if (kokos.age > abrikos.age) {
            result = "kokos is older";
        } else {
            result = "abrikos is older";
        }
        System.out.println(result);

        if (kokos.age > abrikos.age && kokos.age > tomat.age) {
            result = "kokos is older";
        } else if (abrikos.age > kokos.age && abrikos.age > tomat.age) {
            result = "tomat is older";
        } else if (tomat.age > kokos.age && tomat.age > abrikos.age) {
            result = "tomat is older";
        }else {
            result = "default";
        }
        System.out.println(result);
        boolean isRoadClear = true;
        boolean isColorGreen = false;

        if(isColorGreen || isRoadClear){
            System.out.println("you can go!");
        }else {
            System.out.println("Wait!");
        }
    }
}
