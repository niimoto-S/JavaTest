package jp.co.aforce.test;

public class MinMax {

	private int num;

	public int getMinValue(int a,int b, int c) {
		num = a;
		if(num>b) {
			num = b;
		}
		if(num>c) {
			num = c;
		}
		return num;
	}

	public int getMaxValue(int a,int b, int c) {
		num = a;
		if(num < b) {
			num = b;
		}
		if(num < c) {
			num = c;
		}
		return num;
	}

}
