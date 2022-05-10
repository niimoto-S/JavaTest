package jp.co.aforce.test;

public class PracticeTest8 {
                                                                                                                                                                                                                                                                            
	//練習問題１
	public void printHello() {
		System.out.println("Hello");
	}
	//練習問題２
	public void printRandomMessage() {
		int n = (int)(3 * Math.random());
		switch (n) {
			case 0:
				System.out.println("こんばんは");
				break;
			case 1:
				System.out.println("こんにちは");
				break;
			case 2:
				System.out.println("おはよう");
				break;
		}
	}
	//練習問題３
	public void printMessage(String message) {
		System.out.println(message);
	}
	//練習問題４
	public void printMessage(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	//練習問題５
	public void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}
	//練習問題６
	public String getWeatherForecast() {
		String day = "";
		String weather = "";
		int n = (int)(3 * Math.random());
		int n1 = (int)(4 * Math.random());
		switch (n) {
			case 0:
				day = "今日";
				break;
			case 1:
				day = "明日";
				break;
			case 2:
				day = "明後日";
				break;
		}
		switch (n1) {
			case 0:
				weather = "晴れ";
				break;
			case 1:
				weather = "曇り";
				break;
			case 2:
				weather = "雨";
				break;
			case 3:
				weather = "雪";
				break;
		}
		return (day + "の天気は" + weather + "でしょう");
	}
	//練習問題７
	public boolean isEvenNumber(int value) {
		if(value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	//練習問題８
	public String getMessage(String name, boolean isKid) {
		if(isKid) {
			return "こんにちは。" + name + "ちゃん。";
		} else {
			return "こんにちは。" + name + "さん。";
		}
	}
	//練習問題９
	public String getLongestString(String[] array) {
		String str = "";
		for(int i = 0; i < array.length; i++) {
			if(str.length() <= array[i].length()) {
				str = array[i];
			}
		}
		return str;
	}
	//練習問題１０
	public boolean isAdult(Person person) {
		if(person.getAge() > 20) {
			return true;
		} else {
			return false;
		}
	}

}
