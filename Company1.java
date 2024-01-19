class Company1 {
    void display(Employee1 emp) {

        System.out.println(emp.eNo + "" + emp.eName + "" + emp.Dept + "" + emp.sal);
    }

    void annlsal(Employee1 emp) {
        System.out.println("annual salary:" + (emp.sal * 12));

    }

    void incrsal(Employee1 emp, int perc) {
        emp.sal = emp.sal + (emp.sal * perc / 100);
    }
}
