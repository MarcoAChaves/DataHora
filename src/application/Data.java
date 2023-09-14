package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY");

        Date y1 = sdf1.parse("01/09/2023");
        Date y2 = sdf2.parse("01/09/2023 10:45:25");

        System.out.println(y1);
        System.out.println(y2);

    }
}
