package schooldiary;

public class Diary {


    private Day daysarray [] = new Day [5];

    public void addDay(Day day){
        for (int i =0; i<5; i++){
            daysarray[i] = day;
            System.out.println(daysarray[i]);
            return;
        }
    }

    public void addDate(String date){
        System.out.println(date);

    }


}
