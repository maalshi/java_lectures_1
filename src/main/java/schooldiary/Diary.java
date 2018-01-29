package schooldiary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Diary {


    private Date daysarray [] = new Date[5];

    Calendar calendar = Calendar.getInstance();

    public void initDays()  {


        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        calendar.set(2018, 10, 10);
        Date date = calendar.getTime();

        for (int i = 0; i < 5; i++) {
            daysarray[i] = date;
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

    }

    public void addDate(String date){
        System.out.println(calendar.getTime());
    }

    public void addNote(int date, Note note){
        System.out.println(calendar.getTime());
        System.out.println(note);
      }

}
