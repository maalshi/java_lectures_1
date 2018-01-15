package NotesInNotebook;

public class Runner {

    public static void main(String[] args){
        Notebook notebook = new Notebook();
        notebook.addNote(new Note("note"));
        notebook.addNote(new Note("note2"));
        notebook.removeNote(0);
        notebook.addNote(new Note("note3"));
        notebook.editNote(new Note ("edited note"), 1);
        notebook.lookNote();
    }


}
