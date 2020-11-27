package testProject;

public class livres extends admin {
	String title;
	String author;
    int page;
	public livres(int id, String title,String author,int page) {
		super(id, title, author, page);
		this.author=author;
		this.page=page;
		
			}
	    
	  
	
}
