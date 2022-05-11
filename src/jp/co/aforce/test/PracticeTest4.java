package jp.co.aforce.test;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str1 = "abc";
		String str2 = "ab";

		str2 = str2 + "c";

		//1 == で比較
		if(str1 == str2) {
			System.out.println("等しい");
		} else {
			System.out.println("等しくない");
		}

		//2 .equals で比較
		if(str1.equals(str2)) {
			System.out.println("等しい");
		} else {
			System.out.println("等しくない");
		}

		//練習問題１
		//プリミティブ型を比較する場合は==演算子
		//参照型で比較する場合はequalsメソッドを使用しなければならない。

	}

}
