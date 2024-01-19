
class Test25_1 {

    int x = 10;

    void m1() {

        x = 60;

        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Test25_1 t1 = new Test25_1();
        t1.m1();
    }
}
