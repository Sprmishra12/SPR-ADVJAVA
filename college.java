//college.java
class college {
    public static void main(String[] args) {
        student.institute = "naresh i technologies";
        System.out.println("student class is loaded");
        System.out.println("static variable class is loaded");
        student s1 = new student();
        s1.sno = 101;
        s1.sname = "suman";
        s1.fees = 4500.00;
        s1.addr = new address();
        s1.addr.streetno = 1;
        s1.addr.city = "kdp";

        System.out.println("student s1 has been initialized");
        // student s2 details
        student s2 = new student();
        s2.sno = 102;
        s2.sname = "bubun";
        s2.fees = 4500.00;
        s2.addr = new address();
        s2.addr.streetno = 2;
        s2.addr.city = "ctc";
        System.out.println("student s2 has been initialized");
        // printing both values of s1 and s2
        System.out.println("s1.object values");
        System.out.println("s1.institute\t:" + student.institute);
        System.out.println("s1.sno\t\t:" + s1.sno);
        System.out.println("s1.sno\t\t:" + s1.sno);
        System.out.println("s1.fees\t\t:" + s1.fees);
        System.out.println("s1.addr.streetno\t:" + s1.addr.streetno);
        System.out.println("s1.addr.city\t:" + s1.addr.city);
        // s2 object values
        System.out.println("s2.object values");
        System.out.println("s2.institute\t\t:" + student.institute);
        System.out.println("s2.sno\t\t:" + s1.sno);
        System.out.println("s2.sno\t\t:" + s1.sno);
        System.out.println("s2.feest\t:" + s1.fees);
        System.out.println("s2.addr.streetno\t\t:" + s1.addr.streetno);
        System.out.println("s2.addr.city\t\t:" + s1.addr.city);

    }

}