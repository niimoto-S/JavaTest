package jp.co.aforce.test;

public class PracticeTest1 {

	private static final double TAX = 0.1;

	public static void main(String[] args) {

		System.out.println(TAX);

		int x = 480;
		int price = (int) (x +(x * TAX));
		System.out.println(price);

		String name = "仁井本 昇馬";
		System.out.println(name);

		//練習問題4
		//アクセス制御とは、クラスやクラスのメンバおよびコンストラクタなどを、
		//どの範囲でアクセスできるのかを、定めること。

		//練習問題5
		//デフォルトアクセス修飾子

	}

}
