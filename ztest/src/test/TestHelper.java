package test;

import java.lang.reflect.Method;
import java.util.List;

public class TestHelper {


	public static Object invokePrivate(Object o, String method){
		return TestHelper.invokePrivate(o, method, null);
	}

	public static Object invokePrivate(Object o, String method, List<Object> args){
		try{
			Class[] classes =  null;

			if(args != null){
				classes = new Class[args.size()];
				for(int i = 0 ; i < args.size(); i++){
					classes[i] = args.get(i).getClass();
				}

			}
			Method m = o.getClass().getDeclaredMethod(method, classes);
			m.setAccessible(true);

			return args == null ? m.invoke(o) : m.invoke(o, args.toArray());

		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}

}
