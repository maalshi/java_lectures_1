package schooldiary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Diary {


    private SchoolDay schooldays [] = new SchoolDay[5];



    public void initDays()  {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        calendar.set(2018, 10, 12);


        for (int i = 0; i < 5; i++) {
            Date date = calendar.getTime();
            schooldays[i] = new SchoolDay(date);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            System.out.println(schooldays[i]);
        }

    }

    public void addDate(String date){
        System.out.println(date);
    }

    public void addNote(Date date, SchoolDay schoolday){
        System.out.println(date);
        System.out.println(schoolday);
      }

}
