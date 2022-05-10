package jp.co.aforce.test;

public class PracticeTest6 {

	//練習問題２
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MinMax minMax = new MinMax();
		int a = 4, b = 2, c = 10;
		System.out.println(a + "と" + b + "と" + c + "ものうち、最大のものは" + minMax.getMaxValue(a,b,c));
		System.out.println(a + "と" + b + "と" + c + "ものうち、最小のものは" + minMax.getMinValue(a,b,c));
	}

}
