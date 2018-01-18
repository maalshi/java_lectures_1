package schooldiary;

public class Runner {

    public static void main(String[] args) {
        Note note = new Note();
        Diary diary = new Diary();
        Day day = new Day();

        note.addDate();
        note.addLesson();
        note.addHometask();
        note.addMark();
    }

}
