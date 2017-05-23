package coverage;

import static org.junit.Assert.*;

import org.junit.Test;

public class HogeTest {

	@Test
	public void test_引数に文字列を指定() {
		Hoge2 hoge = new Hoge2();
		assertEquals(" Foo.methodB call with 文字列を引数に指定", hoge.methodA("文字列を引数に指定"));

	}

	@Test
	public void test_引数に数値を指定() {
		Hoge2 hoge = new Hoge2();
		assertEquals(" Foo.methodB call with 100 Foo.methodC call with 100", hoge.methodA("100"));
	}
}
