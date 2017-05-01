package Task1;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Test t = new Test();
        Class<?> cls = t.getClass();
        Method[] mt = cls.getMethods();
        for (Method m: mt){
            if(m.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation an = m.getAnnotation(MyAnnotation.class);
                m.invoke(t, an.param1(),an.param2());
            }
        }



    }
}

