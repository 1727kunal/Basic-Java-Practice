package dateclassconcept;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        DateDemo1 d1 = new DateDemo1();
        System.out.println("Current date and time is " + d1.getFullDayDateTime());
    }

    public String getFullDayDateTime() {
        Date d1 = new Date();
        String todayDate = String.valueOf(d1);
        System.out.println(todayDate);

        String date = todayDate.substring(0, 10);
        String year = todayDate.substring(todayDate.length() - 4);
        String time = todayDate.substring(11, 19);

        //String fullDate = date +" "+year+" "+time;
        todayDate = date.concat(" " + year).concat(" " + time);
        return todayDate;
    }
}
