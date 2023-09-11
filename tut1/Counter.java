package tut1;

public class Counter {

    int count;

    public Counter() {
        count = 0;
    }

    public int get() {
        return count;
    }

    public void incr() {
        count++;
    }
    
    public static void main(String[] args) {
        Counter c = new Counter();
        c.incr();
        System.out.println(c.get());
        c.incr();
        System.out.println(c.get());
    }
}