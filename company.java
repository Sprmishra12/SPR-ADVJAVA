//company.java
class company {
    public static void main(String[] args) {
        Laptop.brand = "dell";
        Laptop l1 = new Laptop();
        l1.ramCap = "8gb";
        l1.romCap = "512gb";
        l1.processor = "i5";
        System.out.print("l1" + l1);
        // l2 objects
        Laptop l2 = new Laptop();
        l2.ramCap = "8gb";
        l2.romCap = "512gb";
        l2.processor = "i5";
        System.out.print("l2" + l2);
        Employee.companyname = "tcs";
        // initializing objects for employee e1
        Employee e1 = new Employee();
        e1.eno = 101;
        e1.sal = 50000.00;
        e1.dept = new String[] { "suman", "cj" };
        e1.addr = new address();
        e1.addr.streetno = 1;
        e1.addr.city = "hyd";
        e1.laptop = l1;
        System.out.println("l1" + l1);

        // initializing objects for employee e2
        Employee e2 = new Employee();
        e2.eno = 101;
        e2.sal = 50000.00;
        e2.dept = new String[] { "bubun", "adv java" };
        e2.addr = new address();
        e2.addr.streetno = 1;
        e2.addr.city = "hyd";
        e2.laptop = l2;
        System.out.println("l2" + l2);
        // printing object values for employee e1
        System.out.println("e1.object values");
        System.out.println("e1.companyname\t:" + Employee.companyname);
        System.out.println("e1.eno\t\t:" + e1.eno);
        System.out.println("e1.sal\t\t:" + e1.sal);
        System.out.println("e1.dept\t\t:" + e1.dept);
        System.out.println("e1.addr.streetno\t:" + e1.addr.streetno);
        System.out.println("e1.addr.city\t:" + e1.addr.city);
        // printing object values of employee e2
        System.out.println("e2.object values");
        System.out.println("e2.companyname\t:" + Employee.companyname);
        System.out.println("e2.eno\t\t:" + e1.eno);
        System.out.println("e2.sal\t\t:" + e1.sal);
        System.out.println("e2.dept\t\t:" + e1.dept);
        System.out.println("e2.addr.streetno\t:" + e1.addr.streetno);
        System.out.println("e2.addr.city\t:" + e1.addr.city);

    }

}
