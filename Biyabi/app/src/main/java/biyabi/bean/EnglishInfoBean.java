package biyabi.bean;

import java.io.Serializable;

public class EnglishInfoBean implements Serializable {
    private int iInfoID;
    private String strEngInfoTitle;
    private String strEngPrice;
    private String strEngContent;
    private String strMallUrl;
    private String strEngMallName;
    private boolean bShowFlag;
    private boolean bDeleteFlag;

    public int getIInfoID() {
        return iInfoID;
    }

    public void setIInfoID(int iInfoID) {
        this.iInfoID = iInfoID;
    }

    public String getStrEngInfoTitle() {
        return strEngInfoTitle;
    }

    public void setStrEngInfoTitle(String strEngInfoTitle) {
        this.strEngInfoTitle = strEngInfoTitle;
    }

    public String getStrEngPrice() {
        return strEngPrice;
    }

    public void setStrEngPrice(String strEngPrice) {
        this.strEngPrice = strEngPrice;
    }

    public String getStrEngContent() {
        return strEngContent;
    }

    public void setStrEngContent(String strEngContent) {
        this.strEngContent = strEngContent;
    }

    public String getStrMallUrl() {
        return strMallUrl;
    }

    public void setStrMallUrl(String strMallUrl) {
        this.strMallUrl = strMallUrl;
    }

    public String getStrEngMallName() {
        return strEngMallName;
    }

    public void setStrEngMallName(String strEngMallName) {
        this.strEngMallName = strEngMallName;
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

    @Override
    public String toString() {
        return "EnglishInfoBean{" +
                "iInfoID=" + iInfoID +
                ", strEngInfoTitle='" + strEngInfoTitle + '\'' +
                ", strEngPrice='" + strEngPrice + '\'' +
                ", strEngContent='" + strEngContent + '\'' +
                ", strMallUrl='" + strMallUrl + '\'' +
                ", strEngMallName='" + strEngMallName + '\'' +
                ", bShowFlag=" + bShowFlag +
                ", bDeleteFlag=" + bDeleteFlag +
                '}';
    }
}
