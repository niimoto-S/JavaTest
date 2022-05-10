package jp.co.aforce.test;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題１
		MinMax minmax = new MinMax();
		int a = 4, b = 2, c = 10;
		System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + minmax.getMaxValue(a,b,c));
		System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + minmax.getMinValue(a,b,c));
	}

}
