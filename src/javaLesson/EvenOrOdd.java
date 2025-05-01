package javaLesson;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		//奇数か偶数かを判定する
		int num = 7;
		
		if (num%2 == 1) {
			System.out.println("奇数です");
		}else {
			System.out.println("偶数です");
		}
		//半分にして表示する
		double a = 4.5;
		
		System.out.println(a/2);
		
		//整数部分と小数部分に分けて表示する	
		double b = 7.8;
		
		int e = (int)b;
		
		double f = b - e;
		
		System.out.printf("整数部分:" + e + "小数部分:" +"%.1f\n", f);

		
		//10倍して表示する
		double c = 3.2;
		
		System.out.println(c*10);
			
		//0か0以外かを表示する
		int d = 0;
		
		if (d == 0) {
			System.out.println("０です");
		}else {
			System.out.println("０以外です");
		}
			
		//正の数か負の数かを表示する	
		int g = -5;
		
		if (g >= 0) {
			System.out.println("正の数です");
		}else {
			System.out.println("負の数です");
		}
		//5の倍数か5の倍数ではないかを表示する
		int h = 15;
		
		if (h%5==0) {
			System.out.println("５の倍数です");
		}else {
			System.out.println("５の倍数ではありません");
		}
		//和を表示する
		int i = 8;
		int j = 3;
		
		System.out.println(i + j);
		//差を表示する
		int k = 10;
		int l = 4;
		
		System.out.println(k - l);
			
		//積を表示する
		int m = 6, n = 7;
		
		System.out.println(m*n);
			
		//短い文章
		String name = "みゆう";
		int age = 23; //現在の年齢
		
		age = 23 + 1; //1年後の年齢
			
		System.out.println( name +"は次の誕生日で" + age + "歳です。");
			
		//四則演算	
		int p = 8;	
		int q = 3;
		
		/*足し算*/
		System.out.println( p + q);
		/*引き算*/
		System.out.println( p - q );
		/*掛け算*/
		System.out.println( p * q);
		/*割り算*/
		System.out.println( p/q );
		/*余り*/
		System.out.println( p%q );
			
		//合計と平均値の計算	
		int r = 75;
		int s = 88;
		int t = 92;	
		int u = r + s + t;
		int v = u/3;
		
		System.out.println("合計:"  + u) ;
		System.out.println("平均:" + v);
		
		//12,000円の３割引き
		int price =12000;
		
		System.out.println(12000*0.7 + "円");	
		
		
	}
}
