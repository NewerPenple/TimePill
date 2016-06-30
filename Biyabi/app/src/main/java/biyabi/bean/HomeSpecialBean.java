package biyabi.bean;

import java.io.Serializable;

public class HomeSpecialBean implements Serializable {
    private int iSpecialID;
    private String strSpecialName;
    private String strSpecialImage;
    private String strSpecialDetailImage;
    private String strSpecialIcon;
    private String strSpecialContent;
    private int iEditorID;
    private String strEditorName;
    private String dtStartTime;
    private String dtEndTime;
    private String strSpecialUrl;
    private int iParentSpecialID;
    private String strParentSpecialName;
    private int btSpecialType;
    private int btSpecialLevel;
    private int btRelationType;
    private boolean bShowFlag;
    private boolean bDeleteFlag;
    private int iOrderby;
    private Object listRecommendInfo;

    public int getISpecialID() {
        return iSpecialID;
    }

    public void setISpecialID(int iSpecialID) {
        this.iSpecialID = iSpecialID;
    }

    public String getStrSpecialName() {
        return strSpecialName;
    }

    public void setStrSpecialName(String strSpecialName) {
        this.strSpecialName = strSpecialName;
    }

    public String getStrSpecialImage() {
        return strSpecialImage;
    }

    public void setStrSpecialImage(String strSpecialImage) {
        this.strSpecialImage = strSpecialImage;
    }

    public String getStrSpecialDetailImage() {
        return strSpecialDetailImage;
    }

    public void setStrSpecialDetailImage(String strSpecialDetailImage) {
        this.strSpecialDetailImage = strSpecialDetailImage;
    }

    public String getStrSpecialIcon() {
        return strSpecialIcon;
    }

    public void setStrSpecialIcon(String strSpecialIcon) {
        this.strSpecialIcon = strSpecialIcon;
    }

    public String getStrSpecialContent() {
        return strSpecialContent;
    }

    public void setStrSpecialContent(String strSpecialContent) {
        this.strSpecialContent = strSpecialContent;
    }

    public int getIEditorID() {
        return iEditorID;
    }

    public void setIEditorID(int iEditorID) {
        this.iEditorID = iEditorID;
    }

    public String getStrEditorName() {
        return strEditorName;
    }

    public void setStrEditorName(String strEditorName) {
        this.strEditorName = strEditorName;
    }

    public String getDtStartTime() {
        return dtStartTime;
    }

    public void setDtStartTime(String dtStartTime) {
        this.dtStartTime = dtStartTime;
    }

    public String getDtEndTime() {
        return dtEndTime;
    }

    public void setDtEndTime(String dtEndTime) {
        this.dtEndTime = dtEndTime;
    }

    public String getStrSpecialUrl() {
        return strSpecialUrl;
    }

    public void setStrSpecialUrl(String strSpecialUrl) {
        this.strSpecialUrl = strSpecialUrl;
    }

    public int getIParentSpecialID() {
        return iParentSpecialID;
    }

    public void setIParentSpecialID(int iParentSpecialID) {
        this.iParentSpecialID = iParentSpecialID;
    }

    public String getStrParentSpecialName() {
        return strParentSpecialName;
    }

    public void setStrParentSpecialName(String strParentSpecialName) {
        this.strParentSpecialName = strParentSpecialName;
    }

    public int getBtSpecialType() {
        return btSpecialType;
    }

    public void setBtSpecialType(int btSpecialType) {
        this.btSpecialType = btSpecialType;
    }

    public int getBtSpecialLevel() {
        return btSpecialLevel;
    }

    public void setBtSpecialLevel(int btSpecialLevel) {
        this.btSpecialLevel = btSpecialLevel;
    }

    public int getBtRelationType() {
        return btRelationType;
    }

    public void setBtRelationType(int btRelationType) {
        this.btRelationType = btRelationType;
    }

    public boolean isBShowFlag() {
        return bShowFlag;
    }

    public void setBShowFlag(boolean bShowFlag) {
        this.bShowFlag = bShowFlag;
    }

    public boolean isBDeleteFlag() {
        return bDeleteFlag;
    }

    public void setBDeleteFlag(boolean bDeleteFlag) {
        this.bDeleteFlag = bDeleteFlag;
    }

    public int getIOrderby() {
        return iOrderby;
    }

    public void setIOrderby(int iOrderby) {
        this.iOrderby = iOrderby;
    }

    public Object getListRecommendInfo() {
        return listRecommendInfo;
    }

    public void setListRecommendInfo(Object listRecommendInfo) {
        this.listRecommendInfo = listRecommendInfo;
    }

    @Override
    public String toString() {
        return "HomeSpecialBean{" +
                "iSpecialID=" + iSpecialID +
                ", strSpecialName='" + strSpecialName + '\'' +
                ", strSpecialImage='" + strSpecialImage + '\'' +
                ", strSpecialDetailImage='" + strSpecialDetailImage + '\'' +
                ", strSpecialIcon='" + strSpecialIcon + '\'' +
                ", strSpecialContent='" + strSpecialContent + '\'' +
                ", iEditorID=" + iEditorID +
                ", strEditorName='" + strEditorName + '\'' +
                ", dtStartTime='" + dtStartTime + '\'' +
                ", dtEndTime='" + dtEndTime + '\'' +
                ", strSpecialUrl='" + strSpecialUrl + '\'' +
                ", iParentSpecialID=" + iParentSpecialID +
                ", strParentSpecialName='" + strParentSpecialName + '\'' +
                ", btSpecialType=" + btSpecialType +
                ", btSpecialLevel=" + btSpecialLevel +
                ", btRelationType=" + btRelationType +
                ", bShowFlag=" + bShowFlag +
                ", bDeleteFlag=" + bDeleteFlag +
                ", iOrderby=" + iOrderby +
                ", listRecommendInfo=" + listRecommendInfo +
                '}';
    }
}
