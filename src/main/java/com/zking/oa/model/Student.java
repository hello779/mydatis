package com.zking.oa.model;

public class Student {
    private Integer sid;

    private String sname;

    private String snamePinyin;

    private Integer age;
    private Integer maxAge;
    private Integer minAge;

    private String remark;

    private Integer[] sids;

    public Student(Integer sid, String sname, String snamePinyin, Integer age, String remark) {
        this.sid = sid;
        this.sname = sname;
        this.snamePinyin = snamePinyin;
        this.age = age;
        this.remark = remark;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer[] getSids() {
        return sids;
    }

    public void setSids(Integer[] sids) {
        this.sids = sids;
    }

    public Student() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSnamePinyin() {
        return snamePinyin;
    }

    public void setSnamePinyin(String snamePinyin) {
        this.snamePinyin = snamePinyin;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}