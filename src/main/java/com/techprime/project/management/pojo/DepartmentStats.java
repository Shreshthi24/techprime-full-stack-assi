package com.techprime.project.management.pojo;

public class DepartmentStats {
    private String department;
    private long total;
    private long closed;

   
    public DepartmentStats(String department, long total, long closed) {
        this.department = department;
        this.total = total;
        this.closed = closed;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getClosed() {
        return closed;
    }

    public void setClosed(long closed) {
        this.closed = closed;
    }
}
