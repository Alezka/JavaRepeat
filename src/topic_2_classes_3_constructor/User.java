package topic_2_classes_3_constructor;

public class User {
    public int id = 0; //byte(-128 127) short(-32000 32000) int long
    public String login = null;
    public String password = null;
    public  byte age = 0;
    public String sex = null;
    public float weight = 0.0F;
    public double height = 0.0;
    public boolean isActive = false;
    public char specialSymbol = ' ';

    public User() {

    }


    public User(int id, String login, String password, byte age, String sex, float weight, double height, boolean isActive, char specialSymbol) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.isActive = isActive;
        this.specialSymbol = specialSymbol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", isActive=" + isActive +
                ", specialSymbol=" + specialSymbol +
                '}';
    }
}
