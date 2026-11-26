import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Note> notes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static int nextId = 1;
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Note");
            System.out.println("2. Display Notes");
            System.out.println("3. View Note by ID");
            System.out.println("4. View Note by Name");
            System.out.println("5. View Note by Title");
            System.out.println("6. View Note by Description");
            System.out.println("7. Update Note");
            System.out.println("8. Delete Note by ID");
            System.out.println("9. Delete Note by Title");
            System.out.println("10. Search Note by Title");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    createNote();

                    break;
                case 2:
                    display_notes();
                    break;

                case 3:
                    view_all_notes();
                    break;
                case 4:
                    viewNote_id();
                    break;
                case 5:
                    viewNote_name();
                    break;
                case 6:
                    viewNote_title();
                    break;
                case 7:
                    viewNote_desc();
                    break;
                case 8:
                    update_notes();
                    break;
                case 9:
                    delete_notes_id();
                    break;
                case 10:
                    delete_notes();
                    break;
                case 11:
                    search_notes();
                    break;
                case 12:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void createNote() {
        System.out.print("Enter note ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter note title: ");
        String title = sc.nextLine();
        System.out.print("Enter note description: ");
        String desc = sc.nextLine();

        Note note = new Note(id, title, desc);
        notes.add(note);
    }
    public static void display_notes() {
        System.out.println("Displaying all notes:");
        for (Note note : notes) {
            note.display_note();
            System.out.println("--------------------");
        }
    }
   
    public static void viewNote_id() {
        int id=sc.nextInt();
        for (Note note : notes) {
            if (note.getId() == id) {
                note.display_note();
                return;
            }
        }
        System.out.println("Note with ID " + id + " not found.");
    }
    public static void viewNote_name() {
        String title=sc.nextLine();
        for (Note note : notes) {
            if (note.getTitle().equals(title)) {
                note.display_note();
                return;
            }
        }
        System.out.println("Note with title " + title + " not found.");
    }
    public static void viewNote_title() {
        String title=sc.nextLine();
        for (Note note : notes) {
            if (note.getTitle().equals(title)) {
                note.display_note();
                return;
            }
        }
        System.out.println("Note with title " + title + " not found.");
    }
    public static void viewNote_desc() {
        String desc=sc.nextLine();
        for (Note note : notes) {
            if (note.getDesc().equals(desc)) {
                note.display_note();
                return;
            }
        }
        System.out.println("Note with description " + desc + " not found.");
    }
    public static void view_all_notes() {
        for (Note note : notes) {
            note.display_note();
            System.out.println("--------------------");
        }
    }
    public static void update_notes(){
        for(Note note: notes){
            System.out.println("Entter the id : ");
            int id=sc.nextInt();
            if(note.getId()==id){
            }
        }
    }
    public static void delete_notes_id(){
        System.out.println("Enter the id : ");
        int id=sc.nextInt();
        for(Note note: notes){
            if(note.getId()==id){
                notes.remove(note);
                System.out.println("Note with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Note with ID " + id + " not found.");
    }
    public static void delete_notes(){
        System.out.println("Enter the title : ");
        String title=sc.nextLine();
        for(Note note:notes){
            if(note.getTitle().equals(title)){
                notes.remove(note);
                System.out.println("Note with title " + title + " deleted.");
                return;
            }
        }
        System.out.println("Note with title " + title + " not found.");
    }
    public static void search_notes(){
        System.out.println("Enter the title : ");
        String title=sc.nextLine();
        for(Note note:notes){
            if(note.getTitle().equals(title)){
                note.display_note();
                return;
            }
        }
        System.out.println("Note with title " + title + " not found.");
    }
}
