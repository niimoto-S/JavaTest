package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PracticeTest3 {

	public static void main(String[] args) {
		//練習問題１
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("1");
		emp.add("田中太郎");
		emp.add("男性");
		emp.add("27");
		//練習問題２
		System.out.println(emp.get(1));

		//練習問題４
		Employee employee = new Employee(1, "田中太郎", "男性", 27);
		Employee employee1 = new Employee(2, "佐藤花子", "女性", 22);
		Employee employee2 = new Employee(3, "鈴木次郎", "男性", 31);

		ArrayList<Employee> em1 = new ArrayList<Employee>();
		em1.add(employee);
		em1.add(employee1);
		em1.add(employee2);

		for(Employee employee9 : em1) {
			System.out.println("番号は" + employee9.getNumber() + "、名前は" + employee9.getName() + "、性別は" + employee9.getSex() + "、年齢は" + employee9.getAge() + "です");
		}

		//練習問題５
		Map<String, String> stady = new HashMap<String, String>();
		stady.put("国語","90点");
		stady.put("数学","80点");
		stady.put("英語","65点");

//		stady.forEach((key, val) -> System.out.println(key + ":" + val));

		for(Iterator<Map.Entry<String, String>> Iterator = stady.entrySet().iterator(); Iterator.hasNext();) {
			Map.Entry<String, String> entry = Iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		//練習問題６
		//Mapを選んだ理由：
		//Map関数はキーバリュー形式であり、
		//点数を検索するときにキーで検索すると値を取得できるから

	}

}
