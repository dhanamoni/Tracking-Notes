public class Note{
	int id;
	String title;
	String desc;
    public Note(int id,String title,String desc){
	    this.id=id;
	    this.title=title;
	    this.desc=desc;
    }
    public int getId(){
	    return id;
    }
    public String getTitle(){
	    return title;
    }
    public String getDesc(){
	    return desc;
    }
    public void display_note(){
	    System.out.println("Id: "+id);
	    System.out.println("Title of the note is "+title);
	    System.out.println("Description of the note is : "+desc);
    }
}
