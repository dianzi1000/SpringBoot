package SpringBoot.web2.models;

public class Room {
    private String number;
    private String info;
    private String name;
    private long id;

    public Room() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room(String number, String info, String name, long id) {
        this.number = number;
        this.info = info;
        this.name = name;
        this.id = id;
    }
}
