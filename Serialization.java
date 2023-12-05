import java.io.Serializable;

public class Serialization implements Serializable {
    public String name;
    public String address;
    public int id;

    public static void main(String[] args) {
        Serialization s = new Serialization();
        s.name = "Rifkhan";
        s.address = "24, Seaford Street";
        s.id = 8008;
    }
}
