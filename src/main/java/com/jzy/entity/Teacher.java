package com.jzy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Teacher
 * @Author JinZhiyun
 * @Description 老师实体类
 * @Date 2019/4/15 16:33
 * @Version 1.0
 **/

public class Teacher implements Serializable {
    private static final long serialVersionUID = -2347825422391904371L;

    //教师表代理主键uuid
    private String teaId;

    //教师所属专业id，外键，参照major.major_id
    private Integer teaMajor;

    //教师学号，唯一
    private String teaNum;

    //教师姓名
    private String teaName;

    //教师性别
    private String teaSex;

    //教师出生日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date teaBirthday;

    //教师电话
    private String teaPhone;

    //教师职称id，外键，参照title.title_id
    private Integer teaTitle;

    //教师备注
    private String teaRemark;

    //教师入职日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date teaEntryDay;

    private String teaHometown;

    private String teaNation;

    private String teaIdentification;

    private String teaWork;

    public Teacher() {
    }


    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public Integer getTeaMajor() {
        return teaMajor;
    }

    public void setTeaMajor(Integer teaMajor) {
        this.teaMajor = teaMajor;
    }

    public String getTeaNum() {
        return teaNum;
    }

    public void setTeaNum(String teaNum) {
        this.teaNum = teaNum;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex;
    }

    public Date getTeaBirthday() {
        return teaBirthday;
    }

    public void setTeaBirthday(Date teaBirthday) {
        this.teaBirthday = teaBirthday;
    }

    public String getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone;
    }

    public Integer getTeaTitle() {
        return teaTitle;
    }

    public void setTeaTitle(Integer teaTitle) {
        this.teaTitle = teaTitle;
    }

    public String getTeaRemark() {
        return teaRemark;
    }

    public void setTeaRemark(String teaRemark) {
        this.teaRemark = teaRemark;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId='" + teaId + '\'' +
                ", teaMajor=" + teaMajor +
                ", teaNum='" + teaNum + '\'' +
                ", teaName='" + teaName + '\'' +
                ", teaSex='" + teaSex + '\'' +
                ", teaBirthday=" + teaBirthday +
                ", teaPhone='" + teaPhone + '\'' +
                ", teaTitle='" + teaTitle + '\'' +
                ", teaRemark='" + teaRemark + '\'' +
                '}';
    }

    public String getTeaHometown() {
        return teaHometown;
    }

    public void setTeaHomeTown(String teaHometown) {
        this.teaHometown = teaHometown;
    }

    public String getTeaNation() {
        return teaNation;
    }

    public void setTeaNation(String teaNation) {
        this.teaNation = teaNation;
    }

    public String getTeaIdentification() {
        return teaIdentification;
    }

    public void setTeaIdentification(String teaIdentification) {
        this.teaIdentification = teaIdentification;
    }

    public String getTeaWork() {
        return teaWork;
    }

    public void setTeaWork(String teaWork) {
        this.teaWork = teaWork;
    }

    public Date getTeaEntryDay() {
        return teaEntryDay;
    }

    public void setTeaEntryDay(Date teaEntryDay) {
        this.teaEntryDay = teaEntryDay;
    }
}
