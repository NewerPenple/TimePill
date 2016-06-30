package biyabi.bean;

import java.io.Serializable;

public class HomeIconBean implements Serializable {
    private int IcoID;
    private String IcoName;
    private String IcoImage;
    private String IcoCode;
    private String IcoUrl;
    private int ShowFlag;
    private int DeleteFlag;
    private String IcoSorting;
    private int IcoType;

    public int getIcoID() {
        return IcoID;
    }

    public void setIcoID(int IcoID) {
        this.IcoID = IcoID;
    }

    public String getIcoName() {
        return IcoName;
    }

    public void setIcoName(String IcoName) {
        this.IcoName = IcoName;
    }

    public String getIcoImage() {
        return IcoImage;
    }

    public void setIcoImage(String IcoImage) {
        this.IcoImage = IcoImage;
    }

    public String getIcoCode() {
        return IcoCode;
    }

    public void setIcoCode(String IcoCode) {
        this.IcoCode = IcoCode;
    }

    public String getIcoUrl() {
        return IcoUrl;
    }

    public void setIcoUrl(String IcoUrl) {
        this.IcoUrl = IcoUrl;
    }

    public int getShowFlag() {
        return ShowFlag;
    }

    public void setShowFlag(int ShowFlag) {
        this.ShowFlag = ShowFlag;
    }

    public int getDeleteFlag() {
        return DeleteFlag;
    }

    public void setDeleteFlag(int DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    public String getIcoSorting() {
        return IcoSorting;
    }

    public void setIcoSorting(String IcoSorting) {
        this.IcoSorting = IcoSorting;
    }

    public int getIcoType() {
        return IcoType;
    }

    public void setIcoType(int IcoType) {
        this.IcoType = IcoType;
    }

    @Override
    public String toString() {
        return "HomeIconBean{" +
                "IcoID='" + IcoID + '\'' +
                ", IcoName='" + IcoName + '\'' +
                ", IcoImage='" + IcoImage + '\'' +
                ", IcoCode='" + IcoCode + '\'' +
                ", IcoUrl='" + IcoUrl + '\'' +
                ", ShowFlag=" + ShowFlag +
                ", DeleteFlag=" + DeleteFlag +
                ", IcoSorting='" + IcoSorting + '\'' +
                ", IcoType=" + IcoType +
                '}';
    }
}
