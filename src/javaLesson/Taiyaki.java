package javaLesson;

public class Taiyaki {
	String filling;
	
	// 中身をセットするメソッド
    public void setFilling(String value) {
        filling = value;
    }

    // 中身を表示するメソッド
    public void showFilling() {
        System.out.println("このたい焼きの中身は：" + filling + "です。");
        
    }
    public static void main(String[] args) {
    	//インスタンス化
    	Taiyaki taiyaki1 = new Taiyaki();
    	Taiyaki taiyaki2 = new Taiyaki();
    	
    	//フィールドへの代入
    	taiyaki1.filling = "クリーム";
    	taiyaki2.filling = "あんこ";
    	
    	taiyaki1.showFilling();
    	taiyaki2.showFilling();
    	
    
    }


}
