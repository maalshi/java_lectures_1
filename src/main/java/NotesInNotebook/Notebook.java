package NotesInNotebook;

public class Notebook {

    private Note[] notes;

    public Notebook(int quantity) {

        this.quantity = quantity;
        notes = new Note[quantity];

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;





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

}
