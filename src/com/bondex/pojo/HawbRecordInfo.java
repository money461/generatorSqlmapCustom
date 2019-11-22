package com.bondex.pojo;

import java.util.Date;

public class HawbRecordInfo {
    private Integer id;

    private String boardId;

    private String mawbId;

    private String mawb;

    private String hawbId;

    private String hawb;

    private String percentum;

    private Integer box;

    private Date createTime;

    private Date updateTime;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId == null ? null : boardId.trim();
    }

    public String getMawbId() {
        return mawbId;
    }

    public void setMawbId(String mawbId) {
        this.mawbId = mawbId == null ? null : mawbId.trim();
    }

    public String getMawb() {
        return mawb;
    }

    public void setMawb(String mawb) {
        this.mawb = mawb == null ? null : mawb.trim();
    }

    public String getHawbId() {
        return hawbId;
    }

    public void setHawbId(String hawbId) {
        this.hawbId = hawbId == null ? null : hawbId.trim();
    }

    public String getHawb() {
        return hawb;
    }

    public void setHawb(String hawb) {
        this.hawb = hawb == null ? null : hawb.trim();
    }

    public String getPercentum() {
        return percentum;
    }

    public void setPercentum(String percentum) {
        this.percentum = percentum == null ? null : percentum.trim();
    }

    public Integer getBox() {
        return box;
    }

    public void setBox(Integer box) {
        this.box = box;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}