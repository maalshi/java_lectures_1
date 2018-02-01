package schooldiary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Diary {


    public void initDays(int arraysize, Date date)  {

        SchoolDay schooldays [] = new SchoolDay[arraysize];


        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
       // calendar.set(2010, 10,10);


        for (int i = 0; i < schooldays.length; i++) {
            calendar.getTime();
            schooldays[i] = new SchoolDay(date);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            System.out.println(schooldays[i]);
        }
    }


    public void addNote(Date date, Note schoolday){
        System.out.println(date);
        System.out.println(schoolday);
      }


}
