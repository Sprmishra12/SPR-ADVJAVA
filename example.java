class example {
    int x = 10;

    void m1(int p) {
        p = 50;
    }

    void m2(example e) {
        e = new example();
    }

    void m3(example e) {
        e.x = 15;

    }

    void m4(example e) {
        e = new example();
        e.x = 16;
    }

    void m5(example e) {
        e.x = 19;
        e = new example();
        e.x = 20;
    }
}
