class TestCompany {
    public static void main(String[] args) {
        Company1 cmp = new Company1();
        Employee1 e1 = new Employee1();
        e1.eNo = 101;
        e1.eName = "suman";
        e1.Dept = "s/w devlopment";
        e1.sal = 60000;
        cmp.display(e1);
        cmp.annlsal(e1);
        cmp.incrsal(e1, 20);
        System.out.println("current sal" + e1.sal);

    }

}
