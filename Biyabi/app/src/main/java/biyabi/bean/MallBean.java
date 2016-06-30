package biyabi.bean;

import java.io.Serializable;

public class MallBean implements Serializable {
    private String strLetter;
    private int btShowFlag;
    private int btMobileFlag;
    private String strMallUrl;
    private String strMallName;
    private String strEngMallName;
    private String strDomain;
    private String strWebsite;
    private String strDescription;
    private String strMallImage;
    private boolean bIsNetLeague;
    private int netLeagueType;
    private String strNetLeagueCode;
    private int iNetLeagueOrderby;
    private int iMallRank;
    private int iCountry;
    private String strCountryName;
    private int btMallNation;
    private String strRegion;
    private String strProvinceCode;
    private String strProvinceName;
    private String strCityCode;
    private String strCityName;
    private String strDistrictCode;
    private String strDistrictName;
    private int iOrderby;
    private int iGiftCount;
    private String strNetLeagueWebsite;

    public String getStrLetter() {
        return strLetter;
    }

    public void setStrLetter(String strLetter) {
        this.strLetter = strLetter;
    }

    public int getBtShowFlag() {
        return btShowFlag;
    }

    public void setBtShowFlag(int btShowFlag) {
        this.btShowFlag = btShowFlag;
    }

    public int getBtMobileFlag() {
        return btMobileFlag;
    }

    public void setBtMobileFlag(int btMobileFlag) {
        this.btMobileFlag = btMobileFlag;
    }

    public String getStrMallUrl() {
        return strMallUrl;
    }

    public void setStrMallUrl(String strMallUrl) {
        this.strMallUrl = strMallUrl;
    }

    public String getStrMallName() {
        return strMallName;
    }

    public void setStrMallName(String strMallName) {
        this.strMallName = strMallName;
    }

    public String getStrEngMallName() {
        return strEngMallName;
    }

    public void setStrEngMallName(String strEngMallName) {
        this.strEngMallName = strEngMallName;
    }

    public String getStrDomain() {
        return strDomain;
    }

    public void setStrDomain(String strDomain) {
        this.strDomain = strDomain;
    }

    public String getStrWebsite() {
        return strWebsite;
    }

    public void setStrWebsite(String strWebsite) {
        this.strWebsite = strWebsite;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    public String getStrMallImage() {
        return strMallImage;
    }

    public void setStrMallImage(String strMallImage) {
        this.strMallImage = strMallImage;
    }

    public boolean isBIsNetLeague() {
        return bIsNetLeague;
    }

    public void setBIsNetLeague(boolean bIsNetLeague) {
        this.bIsNetLeague = bIsNetLeague;
    }

    public int getNetLeagueType() {
        return netLeagueType;
    }

    public void setNetLeagueType(int netLeagueType) {
        this.netLeagueType = netLeagueType;
    }

    public String getStrNetLeagueCode() {
        return strNetLeagueCode;
    }

    public void setStrNetLeagueCode(String strNetLeagueCode) {
        this.strNetLeagueCode = strNetLeagueCode;
    }

    public int getINetLeagueOrderby() {
        return iNetLeagueOrderby;
    }

    public void setINetLeagueOrderby(int iNetLeagueOrderby) {
        this.iNetLeagueOrderby = iNetLeagueOrderby;
    }

    public int getIMallRank() {
        return iMallRank;
    }

    public void setIMallRank(int iMallRank) {
        this.iMallRank = iMallRank;
    }

    public int getICountry() {
        return iCountry;
    }

    public void setICountry(int iCountry) {
        this.iCountry = iCountry;
    }

    public String getStrCountryName() {
        return strCountryName;
    }

    public void setStrCountryName(String strCountryName) {
        this.strCountryName = strCountryName;
    }

    public int getBtMallNation() {
        return btMallNation;
    }

    public void setBtMallNation(int btMallNation) {
        this.btMallNation = btMallNation;
    }

    public String getStrRegion() {
        return strRegion;
    }

    public void setStrRegion(String strRegion) {
        this.strRegion = strRegion;
    }

    public String getStrProvinceCode() {
        return strProvinceCode;
    }

    public void setStrProvinceCode(String strProvinceCode) {
        this.strProvinceCode = strProvinceCode;
    }

    public String getStrProvinceName() {
        return strProvinceName;
    }

    public void setStrProvinceName(String strProvinceName) {
        this.strProvinceName = strProvinceName;
    }

    public String getStrCityCode() {
        return strCityCode;
    }

    public void setStrCityCode(String strCityCode) {
        this.strCityCode = strCityCode;
    }

    public String getStrCityName() {
        return strCityName;
    }

    public void setStrCityName(String strCityName) {
        this.strCityName = strCityName;
    }

    public String getStrDistrictCode() {
        return strDistrictCode;
    }

    public void setStrDistrictCode(String strDistrictCode) {
        this.strDistrictCode = strDistrictCode;
    }

    public String getStrDistrictName() {
        return strDistrictName;
    }

    public void setStrDistrictName(String strDistrictName) {
        this.strDistrictName = strDistrictName;
    }

    public int getIOrderby() {
        return iOrderby;
    }

    public void setIOrderby(int iOrderby) {
        this.iOrderby = iOrderby;
    }

    public int getIGiftCount() {
        return iGiftCount;
    }

    public void setIGiftCount(int iGiftCount) {
        this.iGiftCount = iGiftCount;
    }

    public String getStrNetLeagueWebsite() {
        return strNetLeagueWebsite;
    }

    public void setStrNetLeagueWebsite(String strNetLeagueWebsite) {
        this.strNetLeagueWebsite = strNetLeagueWebsite;
    }

    @Override
    public String toString() {
        return "MallBean{" +
                "strLetter='" + strLetter + '\'' +
                ", btShowFlag=" + btShowFlag +
                ", btMobileFlag=" + btMobileFlag +
                ", strMallUrl='" + strMallUrl + '\'' +
                ", strMallName='" + strMallName + '\'' +
                ", strEngMallName='" + strEngMallName + '\'' +
                ", strDomain='" + strDomain + '\'' +
                ", strWebsite='" + strWebsite + '\'' +
                ", strDescription='" + strDescription + '\'' +
                ", strMallImage='" + strMallImage + '\'' +
                ", bIsNetLeague=" + bIsNetLeague +
                ", netLeagueType=" + netLeagueType +
                ", strNetLeagueCode='" + strNetLeagueCode + '\'' +
                ", iNetLeagueOrderby=" + iNetLeagueOrderby +
                ", iMallRank=" + iMallRank +
                ", iCountry=" + iCountry +
                ", strCountryName='" + strCountryName + '\'' +
                ", btMallNation=" + btMallNation +
                ", strRegion='" + strRegion + '\'' +
                ", strProvinceCode='" + strProvinceCode + '\'' +
                ", strProvinceName='" + strProvinceName + '\'' +
                ", strCityCode='" + strCityCode + '\'' +
                ", strCityName='" + strCityName + '\'' +
                ", strDistrictCode='" + strDistrictCode + '\'' +
                ", strDistrictName='" + strDistrictName + '\'' +
                ", iOrderby=" + iOrderby +
                ", iGiftCount=" + iGiftCount +
                ", strNetLeagueWebsite='" + strNetLeagueWebsite + '\'' +
                '}';
    }
}
