
public class SimpleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("/*123456789*/".indexOf("*/"));
       StringBuffer stb = new StringBuffer();
       stb.append("abcdefghijklmn");
       stb.delete(0, 2);
       System.out.println(stb.toString());
   }

}
