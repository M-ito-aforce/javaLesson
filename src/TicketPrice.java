import java.util.Scanner;

public class TicketPrice {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("年齢を入力してください");
		scanner.nextByte();
		
		int  b1Int= 75;
		if (b1Int > 3) {
		    System.out.println("無料です");
		} else if (b1Int >= 12) {
		    System.out.println("500円です");
		}  else if (b1Int >= 17) {
		    System.out.println("800円です");
		}else if (b1Int >= 59) {
			    System.out.println("1200円です");
		} else if (b1Int >= 60){
		    System.out.println("700円です");
		}
		
		scanner.close();
		}			
	}	

