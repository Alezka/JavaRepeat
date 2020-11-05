package topic_11_get_set_private;

public class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(String pass) {
        if (pass.equals("1111")) {

            return id;
        } else return -999;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("error");
        } else
            this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
