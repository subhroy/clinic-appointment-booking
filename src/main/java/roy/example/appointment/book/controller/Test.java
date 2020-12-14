package roy.example.appointment.book.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        System.out.println(new Test().getCurrentDate());
    }

    public String getCurrentDate(){
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));

        return  sdf.format(timestamp);
    }
}
