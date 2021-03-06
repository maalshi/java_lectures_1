package notesinnotebooks;

public class Notebook {

    private Note[] notes;

    public Notebook(int arraySize) {
        notes = new Note[arraySize];
    }

    public void addNote(Note note){

        for (int i = 0;i<10;i++) {
            if (notes[i] == null) {
                notes[i] = note;
                return;
            }
        }

        System.out.println("Запись не может быть добавлена");
    }

    public void editNote(Note editedNote, int index){
        if (notes[index] != null ) {
            notes[index] = editedNote;
            return;
        }

        System.out.println("Редактировать нечего");
    }

    public void removeNote(int index){
        if (notes[index] != null){
            notes [index] = null;
        } else {
            System.out.println("Удалять нечего");
        }
    }

    public void printAllNotes(){

        int i =0;
        while (i<notes.length){
            System.out.println(notes[i]);
            i++;
        }
    }

}
