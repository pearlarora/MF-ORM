package com.ncu;

public class Department {
    String dept_name;

    @Override
    public String toString() {
        return "Department{" +
                "dept_name='" + dept_name + '\'' +
                '}';
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
