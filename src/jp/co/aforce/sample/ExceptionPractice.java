package jp.co.aforce.sample;

public class ExceptionPractice {
	public static void main(String[] args) {
		String str = null;
		
		try{
			int age = 15;
            if (age < 18) {
                throw new IllegalArgumentException("18歳未満は登録できません。");
        }
		System.out.println("登録が完了しました。"); //→ ArrayIndexOutOfBoundsException が発生
		}catch(NullPointerException e) {
			System.out.println("が発生しました:" + e.getMessage());
		}
		
		System.out.println("プログラムは継続します");// →表示されない
			
	}

}
