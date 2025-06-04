import java.util.ArrayList;
import java.util.List;

public class FruitsList {
	public static void main(String[] args) {
		List <String> fruitsList = new ArrayList<String>();
		fruitsList.add("リンゴ");
		fruitsList.add("バナナ");
		fruitsList.add("さくらんぼ");
		
		fruitsList.remove(1);
		fruitsList.add("オレンジ");
		
		System.out.println(fruitsList);
	}

}
