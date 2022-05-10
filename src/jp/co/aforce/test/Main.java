package jp.co.aforce.test;

public class Main {

	//練習問題１１
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PracticeTest8 test8 = new PracticeTest8();
		test8.printHello();
		test8.printRandomMessage();
		test8.printMessage("Hello");
		test8.printMessage("Hello", 5);
		test8.printRectangleArea(3.14,10.222);
		System.out.println(test8.getWeatherForecast());
		System.out.println(test8.isEvenNumber(10));
		System.out.println(test8.getMessage("にいもと",false));
		String[] a = { "aaaa", "ss", "www", "dddd"};
		System.out.println(test8.getLongestString(a));
		Person person = new Person("name",20);
		System.out.println(test8.isAdult(person));


	}

}
