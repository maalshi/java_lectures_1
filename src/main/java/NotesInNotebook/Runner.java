package NotesInNotebook;

public class Runner {

    public static void main(String[] args){
        Notebook notebook = new Notebook();
        notebook.addNote();
        notebook.editNote();
        notebook.removeNote();
        notebook.lookNote();
    }

}
