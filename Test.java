package Task1;


public class Test {
    @MyAnnotation(param1 = 2, param2 = 5)
    public void test(int a, int b){
        System.out.println(a + b);
    }
}
