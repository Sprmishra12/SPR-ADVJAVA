class test {
    public static void main(String[] args) {
        example e1 = new example();
        example e2 = new example();
        int q = 18;
        System.out.println("bmcq" + q);
        e1.m1(q);
        System.out.println("m1 values");
        System.out.println("amcq" + q);
        System.out.println("bmcq" + q);
        e1.m2(e2);
        System.out.println("m2 values");
        System.out.println("amcq" + e2);
        System.out.println("bmcq" + e2);
        System.out.println("bmcq" + e2.x);
        e1.m3(e2);
        System.out.println("m3 values");
        System.out.println("amcq" + e2.x);
        System.out.println("amcq" + e2);
        System.out.println("bmcq" + e2.x);
        e1.m4(e2);
        System.out.println("m4 values");
        System.out.println("amcq" + e2.x);
        System.out.println("bmcq" + e2.x);
        e1.m5(e2);
        System.out.println("m5 values");
        System.out.println("amcq" + e2.x);

    }

}
