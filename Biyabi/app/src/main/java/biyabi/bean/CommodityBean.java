package biyabi.bean;

import java.io.Serializable;

public class CommodityBean implements Serializable {
    private int iCommodityID;
    private String strCommodityName;

    public int getiCommodityID() {
        return iCommodityID;
    }

    public void setiCommodityID(int iCommodityID) {
        this.iCommodityID = iCommodityID;
    }

    public String getStrCommodityName() {
        return strCommodityName;
    }

    public void setStrCommodityName(String strCommodityName) {
        this.strCommodityName = strCommodityName;
    }

    @Override
    public String toString() {
        return "CommodityBean{" +
                "iCommodityID='" + iCommodityID + '\'' +
                ", strCommodityName='" + strCommodityName + '\'' +
                '}';
    }
}
