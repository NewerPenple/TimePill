package biyabi.bean;

import java.io.Serializable;

public class HomeTitleBean implements Serializable {
    private int ProID;
    private String ProName;
    private String ProEngName;
    private String ProWebsite;
    private String ProImage;
    private String MallUrl;
    private String MallName;
    private int ProNation;
    private String Region;
    private int PromotionsType;
    private String StartTime;
    private String EndTime;
    private int OrderBy;

    public int getProID() {
        return ProID;
    }

    public void setProID(int ProID) {
        this.ProID = ProID;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String ProName) {
        this.ProName = ProName;
    }

    public String getProEngName() {
        return ProEngName;
    }

    public void setProEngName(String ProEngName) {
        this.ProEngName = ProEngName;
    }

    public String getProWebsite() {
        return ProWebsite;
    }

    public void setProWebsite(String ProWebsite) {
        this.ProWebsite = ProWebsite;
    }

    public String getProImage() {
        return ProImage;
    }

    public void setProImage(String ProImage) {
        this.ProImage = ProImage;
    }

    public String getMallUrl() {
        return MallUrl;
    }

    public void setMallUrl(String MallUrl) {
        this.MallUrl = MallUrl;
    }

    public String getMallName() {
        return MallName;
    }

    public void setMallName(String MallName) {
        this.MallName = MallName;
    }

    public int getProNation() {
        return ProNation;
    }

    public void setProNation(int ProNation) {
        this.ProNation = ProNation;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getPromotionsType() {
        return PromotionsType;
    }

    public void setPromotionsType(int PromotionsType) {
        this.PromotionsType = PromotionsType;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public int getOrderBy() {
        return OrderBy;
    }

    public void setOrderBy(int OrderBy) {
        this.OrderBy = OrderBy;
    }

    @Override
    public String toString() {
        return "HomeTitleBean{" +
                "ProID='" + ProID + '\'' +
                ", ProName='" + ProName + '\'' +
                ", ProEngName='" + ProEngName + '\'' +
                ", ProWebsite='" + ProWebsite + '\'' +
                ", ProImage='" + ProImage + '\'' +
                ", MallUrl='" + MallUrl + '\'' +
                ", MallName='" + MallName + '\'' +
                ", ProNation=" + ProNation +
                ", Region='" + Region + '\'' +
                ", PromotionsType=" + PromotionsType +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", OrderBy=" + OrderBy +
                '}';
    }
}
