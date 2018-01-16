package NotesInNotebook;

public class Notebook {

    int quantity = 10;

    Note[] notes = new Note[quantity];

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

    public void lookNote(){

        int i =0;
        while (i<quantity){
            System.out.println(notes[i]);
            i++;
        }
    }

    public void sizeNote(){

        int i =0;
        while (i<quantity){

            i++;
        }
        System.out.println(i);
    }
}
