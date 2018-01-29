package schooldiary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Diary {


    private Date daysarray [] = new Date[5];



    public void initDays()  {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        calendar.set(2018, 10, 12);


        for (int i = 0; i < 5; i++) {
            Date date = calendar.getTime();
            daysarray[i] = date;
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            System.out.println(daysarray[i]);
        }


    }

    public void addDate(String date){
        System.out.println(date);
    }

    public void addNote(Date date, Note note){
        System.out.println(date);
        System.out.println(note);
      }

}
