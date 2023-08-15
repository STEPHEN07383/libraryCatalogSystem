package libraryCatalogSystem;

public class Book {

	private String author;
	private String title;
	private boolean isAvailable;
	
	public Book(String author, String title) {
		this.author = author;
		this.title = title;
		this.isAvailable = true;
	}
	
	public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book \"" + title + "\" borrowed.");
        } else {
            System.out.println("Book \"" + title + "\" is not available.");
        }
    }
	
	public void returnBook() {
		isAvailable =  true;
		System.out.println("Book \"" + title + "\" returned.");
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
