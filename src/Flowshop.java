import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Flowshop {
/**
**测试添加 网页添加
**/
/**
 * 测试合并 网页
* * /
	static int n;
	static int[] x;
	static int bestw;
	static int[] bestx;
	static int[][] data;
	public Flowshop() {
		// TODO Auto-generated constructor stub
	}
	public static int bestGroup(int[][]w){
		n = w[0].length - 1;
		x = new int[n+1];
		bestx = new int[n+1];
		bestw = 0;
		data = w;
		backrack(0);
		return bestw;
	}
	private static void backrack(int t){
		if(t > n){
			int total = computw(x);
			System.out.println("total:" + total + ":" + Arrays.toString(x));
			if (total > bestw) {
				for (int j = 0; j <= n; j++) {
					bestx[j] = x[j];
				}
				bestw = total;
			}
			return;
		}else{
			for (int j = 0; j <= 1; j++) {
				x[t] = j;
				backrack(t+1);
			}
		}
	}
	private static int computw(int[]x){
		int result = 0;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 1) {
				list1.add(i);
			}else {
				list2.add(i);
			}
		}
		if(list1.size() != list2.size()) return 0;
		Integer[] a = new Integer[list1.size()];
		Integer[] b = new Integer[list2.size()];
		list1.toArray(a);
		list2.toArray(b);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result += data[a[i]][a[j]]; 
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				result += data[b[i]][b[j]]; 
			}
		}
		return result/2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] test = new int[][] { { 0, 10, 5, 2 }, { 10, 0, -20, 9 },
				{ 5, -20, 0, 2 }, { 2, 9, 2, 0 } };
        System.out.println(bestGroup(test));
        System.out.println(Arrays.toString(bestx));
//        data = test;
//        int[] tx = new int[]{0,1,0,1};
//		computw(tx);
	}

}
