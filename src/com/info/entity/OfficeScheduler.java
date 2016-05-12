/*
 * OfficeScheduler.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class OfficeScheduler {

    private Integer id;
    private Date start;
    private Date end;
    private String subject;
    private Integer memberid;
    private String location;
    private Integer label;
    private Integer status;
    private String description;
    private String text1;
    private String text2;
    private Integer status2;
    private Byte remind;
    private Byte reminded;
    private String audiofile;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }
    public Integer getMemberid() {
        return memberid;
    }
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
    public Integer getLabel() {
        return label;
    }
    public void setLabel(Integer label) {
        this.label = label;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    public String getText1() {
        return text1;
    }
    public void setText1(String text1) {
        this.text1 = text1 == null ? null : text1.trim();
    }
    public String getText2() {
        return text2;
    }
    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }
    public Integer getStatus2() {
        return status2;
    }
    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }
    public Byte getRemind() {
        return remind;
    }
    public void setRemind(Byte remind) {
        this.remind = remind;
    }
    public Byte getReminded() {
        return reminded;
    }
    public void setReminded(Byte reminded) {
        this.reminded = reminded;
    }
    public String getAudiofile() {
        return audiofile;
    }
    public void setAudiofile(String audiofile) {
        this.audiofile = audiofile == null ? null : audiofile.trim();
    }
}