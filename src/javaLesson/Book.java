package javaLesson;

public class Book {
	String title;
	String author;
	int price;
	
        
    
	
	//本の情報を表示するメソッド
	public void showInfo() {
		//System.out.println("タイトル:" + title + "著者:"+ author + "価格:" + price + "円");	
		System.out.println( title + author + ":" + price + "円");	
	}
	
	public static void main (String[] args){
		//インスタンス化
		Book book1 = new Book();
		Book book2 = new Book();
		
		//タイトルの代入
		book1.title = "世界でいちばん透きとおった物語";
		book2.title = "謎解きはディナーの後で";
		
		//著者の代入
		book1.author = "杉井光";
		book2.author = "東川篤哉";
		
		//価格の代入
		book1.price = 814;
		book2.price = 737;
		
		book1.showInfo();
		book2.showInfo();
	}

}
