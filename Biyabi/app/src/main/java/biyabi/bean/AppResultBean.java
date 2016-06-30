package biyabi.bean;

import java.io.Serializable;

public class AppResultBean implements Serializable {
    private int iResultCode;
    private String strResultDescription;

    public int getiResultCode() {
        return iResultCode;
    }

    public void setiResultCode(int iResultCode) {
        this.iResultCode = iResultCode;
    }

    public String getStrResultDescription() {
        return strResultDescription;
    }

    public void setStrResultDescription(String strResultDescription) {
        this.strResultDescription = strResultDescription;
    }

    @Override
    public String toString() {
        return "AppResultBean{" +
                "iResultCode=" + iResultCode +
                ", strResultDescription='" + strResultDescription + '\'' +
                '}';
    }
}
