package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 28;
		double z = 3.14;
		//練習問題１
		System.out.println(x * y);
		//練習問題２
		System.out.println("結果:" + (y / x) + "余り" + (y % x) );
		//練習問題３
		double n = y * z;
		System.out.println(n);
		//練習問題４
		System.out.println(++n);

		//練習問題５
		int age = 22;

		Random rand = new Random();
	    int randomNumber = rand.nextInt(100);
	    System.out.println("randomNumber = " + randomNumber);
	    String str = "";
	    if(age == randomNumber) {
	    	str = "私と同い年です";
	    } else if (age > randomNumber) {
	    	str = "私のほうが年上です";
	    } else {
	    	str = "私のほうが年下です";
	    }

	    System.out.println(str);

	}

}

