class Test25_3 {

    int x = 10;

    void m1() {
        int x = 50;
        x = 60;
        this.x = 70;
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Test25_3 t1 = new Test25_3();
        t1.m1();
    }
}