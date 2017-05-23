package coverage;

public class Hoge2 {
	public Foo foo = new Foo();

    public String methodA(String stringValue) {
        StringBuilder result = new StringBuilder();
        //foo.methodBの結果をresultに追加
        result.append(foo.methodB(stringValue));
        try {
        	//stringValueがintに変換できるときのみfoo.methodCの結果をresultに追加
            result.append(foo.methodC(Integer.parseInt(stringValue)));
        }catch (NumberFormatException e) {
        	System.out.println(stringValue + "は数値でありません");
        	//e.printStackTrace();
        	throw e;
        }

        return result.toString();
    }
}