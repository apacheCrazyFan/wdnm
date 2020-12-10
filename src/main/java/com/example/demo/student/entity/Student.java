package com.example.demo.student.entity;

public class Student {
    private String sid;
    private String sname;
    private int sage;
    private String smsg;

    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getSage() {
        return sage;
    }
    public void setSage(int sage) {
        this.sage = sage;
    }
    public String getSmsg() {
        return smsg;
    }
    public void setSmsg(String smsg) {
        this.smsg = smsg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", smsg='" + smsg + '\'' +
                '}';
    }
}
