package biyabi.bean;

import java.io.Serializable;

public class HomeBrandBean implements Serializable {
    private int iBrandExclusiveID;
    private String strBrandExclusiveTitle;
    private String strBandUrl;
    private String strBrandName;
    private String strBrandImage;
    private String strBrandDetailImage;
    private String strBrandContent;
    private int iEditorID;
    private String strEditorName;
    private String dtStartTime;
    private String dtEndTime;
    private int btBrandExclusiveType;
    private boolean bShowFlag;
    private boolean bDeleteFlag;
    private int iOrderby;
    private Object listBrandExclusiveInfo;
    private Object listRecommendInfo;

    public int getIBrandExclusiveID() {
        return iBrandExclusiveID;
    }

    public void setIBrandExclusiveID(int iBrandExclusiveID) {
        this.iBrandExclusiveID = iBrandExclusiveID;
    }

    public String getStrBrandExclusiveTitle() {
        return strBrandExclusiveTitle;
    }

    public void setStrBrandExclusiveTitle(String strBrandExclusiveTitle) {
        this.strBrandExclusiveTitle = strBrandExclusiveTitle;
    }

    public String getStrBandUrl() {
        return strBandUrl;
    }

    public void setStrBandUrl(String strBandUrl) {
        this.strBandUrl = strBandUrl;
    }

    public String getStrBrandName() {
        return strBrandName;
    }

    public void setStrBrandName(String strBrandName) {
        this.strBrandName = strBrandName;
    }

    public String getStrBrandImage() {
        return strBrandImage;
    }

    public void setStrBrandImage(String strBrandImage) {
        this.strBrandImage = strBrandImage;
    }

    public String getStrBrandDetailImage() {
        return strBrandDetailImage;
    }

    public void setStrBrandDetailImage(String strBrandDetailImage) {
        this.strBrandDetailImage = strBrandDetailImage;
    }

    public String getStrBrandContent() {
        return strBrandContent;
    }

    public void setStrBrandContent(String strBrandContent) {
        this.strBrandContent = strBrandContent;
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

    public int getBtBrandExclusiveType() {
        return btBrandExclusiveType;
    }

    public void setBtBrandExclusiveType(int btBrandExclusiveType) {
        this.btBrandExclusiveType = btBrandExclusiveType;
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

    public Object getListBrandExclusiveInfo() {
        return listBrandExclusiveInfo;
    }

    public void setListBrandExclusiveInfo(Object listBrandExclusiveInfo) {
        this.listBrandExclusiveInfo = listBrandExclusiveInfo;
    }

    public Object getListRecommendInfo() {
        return listRecommendInfo;
    }

    public void setListRecommendInfo(Object listRecommendInfo) {
        this.listRecommendInfo = listRecommendInfo;
    }

    @Override
    public String toString() {
        return "HomeBrandBean{" +
                "iBrandExclusiveID=" + iBrandExclusiveID +
                ", strBrandExclusiveTitle='" + strBrandExclusiveTitle + '\'' +
                ", strBandUrl='" + strBandUrl + '\'' +
                ", strBrandName='" + strBrandName + '\'' +
                ", strBrandImage='" + strBrandImage + '\'' +
                ", strBrandDetailImage='" + strBrandDetailImage + '\'' +
                ", strBrandContent='" + strBrandContent + '\'' +
                ", iEditorID=" + iEditorID +
                ", strEditorName='" + strEditorName + '\'' +
                ", dtStartTime='" + dtStartTime + '\'' +
                ", dtEndTime='" + dtEndTime + '\'' +
                ", btBrandExclusiveType=" + btBrandExclusiveType +
                ", bShowFlag=" + bShowFlag +
                ", bDeleteFlag=" + bDeleteFlag +
                ", iOrderby=" + iOrderby +
                ", listBrandExclusiveInfo=" + listBrandExclusiveInfo +
                ", listRecommendInfo=" + listRecommendInfo +
                '}';
    }
}
