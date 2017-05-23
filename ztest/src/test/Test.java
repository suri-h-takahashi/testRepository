package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hoge h = new Hoge();

		String r = (String)TestHelper.invokePrivate(h, "sayPiyo");
		System.out.println(r);

		List<Object> a = new ArrayList<Object>();
		a.add("豊島");
		a.add("島");
		boolean b = (Boolean)TestHelper.invokePrivate(h, "isSameString",a );
		System.out.println(b);
	}

}
