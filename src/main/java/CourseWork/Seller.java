package CourseWork;


import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class Seller extends User {

    List<Buyer> buyers = new ArrayList<>();

    public static boolean isFIO(String fio) throws IllegalArgumentException {
        String regexFIO = "([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)";;
        if (!fio.matches(regexFIO)) {
            throw new IllegalArgumentException("Invalid fio: " + fio);
        }
        return fio.matches(regexFIO);
    }

    public static boolean isLogin(String login) throws IllegalArgumentException {
        String regexLogin = "\\A^[A-Za-z\\d_-]+$\\z";
        if (!login.matches(regexLogin)) {
            throw new IllegalArgumentException("Invalid login: " + login);
        }
        return login.matches(regexLogin);
    }

    public static boolean isPassword(String password) throws IllegalArgumentException {
        String regexPassword = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$";
        if (!password.matches(regexPassword)) {
            throw new IllegalArgumentException("Invalid password: " + password);
        }
        return password.matches(regexPassword);
    }

    public static boolean isPhone(String phone) throws IllegalArgumentException {
        String regexPhone = "^(?:\\+7|8)?9(?:\\d{9})$";
        if (!phone.matches(regexPhone)) {
            throw new IllegalArgumentException("Invalid phone: " + phone);
        }
        return phone.matches(regexPhone);
    }



    public List<Buyer> readFile() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\resources\\buyers.csv"));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(";");

                UUID id = UUID.randomUUID();

                try {

                    if (isFIO(parts[0]) && isLogin(parts[1]) && isPassword(parts[2]) && isPhone(parts[3])) {

                        buyers.add(new Buyer(parts[1], parts[2], parts[0], parts[3], id));
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buyers;
    }


    public void showActiveBuyers() {
        try {

            FileWriter outputFile = new FileWriter("src\\main\\resources\\result.csv");
            CSVWriter writer = new CSVWriter(outputFile);

            Collections.sort(buyers);

            for (Buyer buyer : buyers){
                String[] data = {buyer.fio, buyer.phone, buyer.login, buyer.id.toString()};
                writer.writeNext(data);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}