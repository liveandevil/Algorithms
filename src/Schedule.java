
public class Schedule {
	public Schedule(){
		float a = 1.0f;
	}
	public static void table(int k,int[][] a){
		int n = 1;
		for(int i = 1; i <= k; i++){
			n *= 2;
		}
		for(int i = 1; i <= n; i++){
			a[1][i]= i;
		}
		int m = 1;
		for(int s = 1; s <= k; s++){
			
		}
	}
	public static void swap(Integer a, Integer b){
		Integer c = a;
		a = b;
		b = c;
	}
	public static void setMyClassA(MyClass t){
		t.a = 2;
	}
	public static void setInteger(Integer t){
		t = Integer.valueOf(128);
		System.out.println("b-->" + t.hashCode());
	}
	public static void main(String[] args){
		Integer a = 2;
		Integer b = 3;
		swap(a, b);
		System.out.println(a +""+ b);
		MyClass test = new MyClass(1);
		setMyClassA(test);
		System.out.println(test.a);
		setInteger(b);
		System.out.println("b-->" + b.hashCode());
		System.out.println(b);
		boolean d = 1 <= 2;
		System.out.println(d);
	}

}
class MyClass{
	int a;
	public  MyClass() {
		
	}
    public  MyClass(int a) {
		this.a = a;
	}
}