package CourseWork;


import java.util.UUID;

public class Buyer extends User implements Comparable<Buyer>{
    public String fio;
    public UUID id;
    public String phone;

    public String getFio() {
        return fio;
    }


    public Buyer(String login, String password, String fio, String phone, UUID id) {
        this.fio = fio;
        this.login = login;
        this.setPassword(password);
        this.phone = phone;
        this.id = id;
    }

    @Override
    public int compareTo(Buyer e) {

        return this.getFio().compareTo(e.getFio());
    }


}
