package Calender;
import com.company.mysql;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
Åbningstid start kl 8:30-9:30
Lukketid omkring 14:00-19:00

Hårmoni'ka's åbningstider er

mandag:  9:00-17:30
tirsdag: 8:30-17:00
onsdag:  9:00-17:00
torsdag: 9:00-17:30
fredag:  8:30-18:00

lørdag:  9:00-14:30
søndag:  lukket.

 */

public class OpeningHours{

    public String dayName;
    public LocalTime openingTime;
    public LocalTime closingTime;

    public OpeningHours(String dayName, LocalTime openingTime, LocalTime closingTime) {
        this.dayName = dayName;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public OpeningHours() {
    }

    public static void main(String[] args) {
        OpeningHours mandag = new OpeningHours();
        mysql msql = mysql.getInstance();
        msql.printOpeningHoursTable("OpeningHours");

    }



    public static void timeTest(String str){
        //Formaterer datoen og tidspunkt fx, 13-03 8:40
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        //Skaber en instance af LocalDateTime med en String parameter og i et format.
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

        //Tjekker den nuværende tid
        LocalDateTime myTime = LocalDateTime.now();

        //Variable med givne værdier uformateret.
        LocalDateTime customer = LocalDateTime.of(2022,03,30,8,45);

        //Printer all instanserne
        System.out.println(myTime +"\n"+customer +"\n"+ dateTime);
    }
}
