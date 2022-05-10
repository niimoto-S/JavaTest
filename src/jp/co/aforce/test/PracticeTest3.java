package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PracticeTest3 {

	public static void main(String[] args) {

		ArrayList<String> emp = new ArrayList<String>();
		emp.add("1");
		emp.add("田中太郎");
		emp.add("男性");
		emp.add("27");

		System.out.println(emp.get(1));

		HashSet<Employee> em = new HashSet<Employee>();

		Employee employee2 = new Employee(3, "鈴木次郎", "男性", 31);
		em.add(employee2);

		Employee employee1 = new Employee(2, "佐藤花子", "女性", 22);
		em.add(employee1);

		Employee employee = new Employee(1, "田中太郎", "男性", 27);
		em.add(employee);


		for(Employee employee0 : em) {
			System.out.println("番号は" + employee0.getNumber() + "、名前は" + employee0.getName() + "、性別は" + employee0.getSex() + "、年齢は" + employee0.getAge() + "です");
		}

		//練習問題５
		Map<String, String> stady = new HashMap<String, String>();
		stady.put("国語","90点");
		stady.put("数学","80点");
		stady.put("英語","65点");

		stady.forEach((key, val) -> System.out.println(key + ":" + val));

		//練習問題６
		//Mapを選んだ理由：
		//Map関数はキーバリュー形式であり、
		//点数を検索するときにキーで検索すると値を取得できるから

	}

}
