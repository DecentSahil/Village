package task;

class tea{
    static {
        System.out.println("outer class static block");
    }
    int a =10;
    static int b =20;
    private int c =90;
    void sum(){
        System.out.println("sum");
        System.out.println(b);
        System.out.println(sec.b);
        System.out.println(tea.b);
    }
    static class sec{
        static {
            System.out.println("inner class static block");
        }
        static int b =50;
        void two(){
            tea t = new tea();
            t.sum();
            System.out.println(t.a);
            System.out.println(b);
            System.out.println(sec.b);
            System.out.println(tea.b);
        }

    }
}

public class test {
    public static void main(String[] args) {
        tea ta = new tea();
        System.out.println("after outer class object creation");
        ta.sum();
        tea.sec s = new tea.sec();
        System.out.println("after inner class object creation");
        s.two();

    }
}

















