
public class Test {
	public static void main(String[] args){
		System.out.println("Hello\tWorld\nJava");
		
        try {						
            String str = null;						
            System.out.println(str.length());						
        } catch (ArithmeticException e) {						
            System.out.println("ArithmeticException が発生しました");						
        } catch (NullPointerException e) {						
            System.out.println("NullPointerException が発生しました");						
        } catch (Exception e) {						
            System.out.println("Exception が発生しました");						
        }						

        
       


		
	}

}
