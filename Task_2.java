public class Task_2 {
	public static void main(String[] args) {
		Book book1= new Book(),
		     book2= new Book(),
		     book3= new Book();
		book1.title = "JAVA for Beginners ";
		book1.author = "By Prof. David";
		book1.edition= 3;
		book1.ed ="rd";
		book1.page = 537;
		book1.price= 299;
		book1.publication = "Easy Coding Publications";
		book1.showinfo();
		
		book2.title = "Omega Point ";
		book2.author= "By Humayun Ahmed";
		book2.edition = 12;
		book2.ed ="th";
		book2.page = 122;
		book2.price = 128;
		book2.publication= "Shomoy Prokashoni";
		book2.showinfo(); 
		
		book3.title= "Digital Fortress ";
		book3.author = "By Dan Brown";
		book3.edition = 5;
		book3.ed ="th";
		book3.page = 356;
		book3.price = 520;
		book3.publication= "St. Martin Press";
		book3.showinfo();
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println("");
		book1 = book3;
		book1.edition = 1;
		book1.ed = "st";
		book3.showinfo();
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);		
	}
}


