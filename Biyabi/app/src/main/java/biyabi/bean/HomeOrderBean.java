package biyabi.bean;

import java.io.Serializable;

public class HomeOrderBean implements Serializable {
    private Object CommodityUrlArr;
    private Object CommodityUrlNameArr;
    private int CommodityUrlCount;
    private String ContentNoHtmlCode;
    private Object InfoCommodityTagList;
    private int iInfoID;
    private String strInfoTitle;
    private String strSubtitle;
    private String strCommodityPrice;
    private double decOrginalPrice;
    private double decMaxPrice;
    private double decMinPrice;
    private double decOrginalPriceRMB;
    private double decMaxPriceRMB;
    private double decMinPriceRMB;
    private String strImageArray;
    private String strMainImage;
    private String strInfoContent;
    private MallBean mall;
    private String strCommodityUrl;
    private String strCommodityUrlName;
    private String strCommoditySourceUrl;
    private String strContentUrl;
    private String strContentUrlName;
    private String strContentSourceUrl;
    private String strRedirectUrl;
    private String strSourceUrl;
    private int iCommodityUrlHitCount;
    private String strBrightUrl;
    private String strBrightName;
    private int btInfoNation;
    private String strRegion;
    private String strProvinceCode;
    private String strProvinceName;
    private String strCityCode;
    private String strCityName;
    private String strDistrictCode;
    private String strDistrictName;
    private int iIsGood;
    private int iIsBad;
    private int iInfoCollection;
    private int iInfoReview;
    private String strInfoUrl;
    private String strEditorRemark;
    private int infoType;
    private String strCatUrl;
    private String strCatName;
    private String strTagUrl;
    private String strTagName;
    private String dtInfoTime;
    private String dtUpdateTime;
    private int btSaleStatus;
    private int iHitCount;
    private int btAuditStatus;
    private int iPostInfoID;
    private int homeShow;
    private int isTop;
    private CommodityBean commodity;
    private boolean bShowFlag;
    private boolean bDeleteFlag;
    private int btVoteRate;
    private boolean bCollectInfo;
    private EnglishInfoBean englishInfo;
    private int iCurrency;
    private int btCountry;
    private String strBrandUrl;
    private String strBrandName;
    private String strBrandEngName;
    private int iIsPurchasing;
    private String strSpecifications;
    private Object AttributeTagFormatJson;
    private EditorBean editor;
    private UserBean user;

    public Object getCommodityUrlArr() {
        return CommodityUrlArr;
    }

    public void setCommodityUrlArr(Object CommodityUrlArr) {
        this.CommodityUrlArr = CommodityUrlArr;
    }

    public Object getCommodityUrlNameArr() {
        return CommodityUrlNameArr;
    }

    public void setCommodityUrlNameArr(Object CommodityUrlNameArr) {
        this.CommodityUrlNameArr = CommodityUrlNameArr;
    }

    public int getCommodityUrlCount() {
        return CommodityUrlCount;
    }

    public void setCommodityUrlCount(int CommodityUrlCount) {
        this.CommodityUrlCount = CommodityUrlCount;
    }

    public String getContentNoHtmlCode() {
        return ContentNoHtmlCode;
    }

    public void setContentNoHtmlCode(String ContentNoHtmlCode) {
        this.ContentNoHtmlCode = ContentNoHtmlCode;
    }

    public Object getInfoCommodityTagList() {
        return InfoCommodityTagList;
    }

    public void setInfoCommodityTagList(Object InfoCommodityTagList) {
        this.InfoCommodityTagList = InfoCommodityTagList;
    }

    public int getIInfoID() {
        return iInfoID;
    }

    public void setIInfoID(int iInfoID) {
        this.iInfoID = iInfoID;
    }

    public String getStrInfoTitle() {
        return strInfoTitle;
    }

    public void setStrInfoTitle(String strInfoTitle) {
        this.strInfoTitle = strInfoTitle;
    }

    public String getStrSubtitle() {
        return strSubtitle;
    }

    public void setStrSubtitle(String strSubtitle) {
        this.strSubtitle = strSubtitle;
    }

    public String getStrCommodityPrice() {
        return strCommodityPrice;
    }

    public void setStrCommodityPrice(String strCommodityPrice) {
        this.strCommodityPrice = strCommodityPrice;
    }

    public double getDecOrginalPrice() {
        return decOrginalPrice;
    }

    public void setDecOrginalPrice(double decOrginalPrice) {
        this.decOrginalPrice = decOrginalPrice;
    }

    public double getDecMaxPrice() {
        return decMaxPrice;
    }

    public void setDecMaxPrice(double decMaxPrice) {
        this.decMaxPrice = decMaxPrice;
    }

    public double getDecMinPrice() {
        return decMinPrice;
    }

    public void setDecMinPrice(double decMinPrice) {
        this.decMinPrice = decMinPrice;
    }

    public double getDecOrginalPriceRMB() {
        return decOrginalPriceRMB;
    }

    public void setDecOrginalPriceRMB(double decOrginalPriceRMB) {
        this.decOrginalPriceRMB = decOrginalPriceRMB;
    }

    public double getDecMaxPriceRMB() {
        return decMaxPriceRMB;
    }

    public void setDecMaxPriceRMB(double decMaxPriceRMB) {
        this.decMaxPriceRMB = decMaxPriceRMB;
    }

    public double getDecMinPriceRMB() {
        return decMinPriceRMB;
    }

    public void setDecMinPriceRMB(double decMinPriceRMB) {
        this.decMinPriceRMB = decMinPriceRMB;
    }

    public String getStrImageArray() {
        return strImageArray;
    }

    public void setStrImageArray(String strImageArray) {
        this.strImageArray = strImageArray;
    }

    public String getStrMainImage() {
        return strMainImage;
    }

    public void setStrMainImage(String strMainImage) {
        this.strMainImage = strMainImage;
    }

    public String getStrInfoContent() {
        return strInfoContent;
    }

    public void setStrInfoContent(String strInfoContent) {
        this.strInfoContent = strInfoContent;
    }

    public MallBean getMall() {
        return mall;
    }

    public void setMall(MallBean mall) {
        this.mall = mall;
    }

    public String getStrCommodityUrl() {
        return strCommodityUrl;
    }

    public void setStrCommodityUrl(String strCommodityUrl) {
        this.strCommodityUrl = strCommodityUrl;
    }

    public String getStrCommodityUrlName() {
        return strCommodityUrlName;
    }

    public void setStrCommodityUrlName(String strCommodityUrlName) {
        this.strCommodityUrlName = strCommodityUrlName;
    }

    public String getStrCommoditySourceUrl() {
        return strCommoditySourceUrl;
    }

    public void setStrCommoditySourceUrl(String strCommoditySourceUrl) {
        this.strCommoditySourceUrl = strCommoditySourceUrl;
    }

    public String getStrContentUrl() {
        return strContentUrl;
    }

    public void setStrContentUrl(String strContentUrl) {
        this.strContentUrl = strContentUrl;
    }

    public String getStrContentUrlName() {
        return strContentUrlName;
    }

    public void setStrContentUrlName(String strContentUrlName) {
        this.strContentUrlName = strContentUrlName;
    }

    public String getStrContentSourceUrl() {
        return strContentSourceUrl;
    }

    public void setStrContentSourceUrl(String strContentSourceUrl) {
        this.strContentSourceUrl = strContentSourceUrl;
    }

    public String getStrRedirectUrl() {
        return strRedirectUrl;
    }

    public void setStrRedirectUrl(String strRedirectUrl) {
        this.strRedirectUrl = strRedirectUrl;
    }

    public String getStrSourceUrl() {
        return strSourceUrl;
    }

    public void setStrSourceUrl(String strSourceUrl) {
        this.strSourceUrl = strSourceUrl;
    }

    public int getICommodityUrlHitCount() {
        return iCommodityUrlHitCount;
    }

    public void setICommodityUrlHitCount(int iCommodityUrlHitCount) {
        this.iCommodityUrlHitCount = iCommodityUrlHitCount;
    }

    public String getStrBrightUrl() {
        return strBrightUrl;
    }

    public void setStrBrightUrl(String strBrightUrl) {
        this.strBrightUrl = strBrightUrl;
    }

    public String getStrBrightName() {
        return strBrightName;
    }

    public void setStrBrightName(String strBrightName) {
        this.strBrightName = strBrightName;
    }

    public int getBtInfoNation() {
        return btInfoNation;
    }

    public void setBtInfoNation(int btInfoNation) {
        this.btInfoNation = btInfoNation;
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

    public int getIIsGood() {
        return iIsGood;
    }

    public void setIIsGood(int iIsGood) {
        this.iIsGood = iIsGood;
    }

    public int getIIsBad() {
        return iIsBad;
    }

    public void setIIsBad(int iIsBad) {
        this.iIsBad = iIsBad;
    }

    public int getIInfoCollection() {
        return iInfoCollection;
    }

    public void setIInfoCollection(int iInfoCollection) {
        this.iInfoCollection = iInfoCollection;
    }

    public int getIInfoReview() {
        return iInfoReview;
    }

    public void setIInfoReview(int iInfoReview) {
        this.iInfoReview = iInfoReview;
    }

    public String getStrInfoUrl() {
        return strInfoUrl;
    }

    public void setStrInfoUrl(String strInfoUrl) {
        this.strInfoUrl = strInfoUrl;
    }

    public String getStrEditorRemark() {
        return strEditorRemark;
    }

    public void setStrEditorRemark(String strEditorRemark) {
        this.strEditorRemark = strEditorRemark;
    }

    public int getInfoType() {
        return infoType;
    }

    public void setInfoType(int infoType) {
        this.infoType = infoType;
    }

    public String getStrCatUrl() {
        return strCatUrl;
    }

    public void setStrCatUrl(String strCatUrl) {
        this.strCatUrl = strCatUrl;
    }

    public String getStrCatName() {
        return strCatName;
    }

    public void setStrCatName(String strCatName) {
        this.strCatName = strCatName;
    }

    public String getStrTagUrl() {
        return strTagUrl;
    }

    public void setStrTagUrl(String strTagUrl) {
        this.strTagUrl = strTagUrl;
    }

    public String getStrTagName() {
        return strTagName;
    }

    public void setStrTagName(String strTagName) {
        this.strTagName = strTagName;
    }

    public String getDtInfoTime() {
        return dtInfoTime;
    }

    public void setDtInfoTime(String dtInfoTime) {
        this.dtInfoTime = dtInfoTime;
    }

    public String getDtUpdateTime() {
        return dtUpdateTime;
    }

    public void setDtUpdateTime(String dtUpdateTime) {
        this.dtUpdateTime = dtUpdateTime;
    }

    public int getBtSaleStatus() {
        return btSaleStatus;
    }

    public void setBtSaleStatus(int btSaleStatus) {
        this.btSaleStatus = btSaleStatus;
    }

    public int getIHitCount() {
        return iHitCount;
    }

    public void setIHitCount(int iHitCount) {
        this.iHitCount = iHitCount;
    }

    public int getBtAuditStatus() {
        return btAuditStatus;
    }

    public void setBtAuditStatus(int btAuditStatus) {
        this.btAuditStatus = btAuditStatus;
    }

    public int getIPostInfoID() {
        return iPostInfoID;
    }

    public void setIPostInfoID(int iPostInfoID) {
        this.iPostInfoID = iPostInfoID;
    }

    public int getHomeShow() {
        return homeShow;
    }

    public void setHomeShow(int homeShow) {
        this.homeShow = homeShow;
    }

    public int getIsTop() {
        return isTop;
    }

    public void setIsTop(int isTop) {
        this.isTop = isTop;
    }

    public CommodityBean getCommodity() {
        return commodity;
    }

    public void setCommodity(CommodityBean commodity) {
        this.commodity = commodity;
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

    public int getBtVoteRate() {
        return btVoteRate;
    }

    public void setBtVoteRate(int btVoteRate) {
        this.btVoteRate = btVoteRate;
    }

    public boolean isBCollectInfo() {
        return bCollectInfo;
    }

    public void setBCollectInfo(boolean bCollectInfo) {
        this.bCollectInfo = bCollectInfo;
    }

    public EnglishInfoBean getEnglishInfo() {
        return englishInfo;
    }

    public void setEnglishInfo(EnglishInfoBean englishInfo) {
        this.englishInfo = englishInfo;
    }

    public int getICurrency() {
        return iCurrency;
    }

    public void setICurrency(int iCurrency) {
        this.iCurrency = iCurrency;
    }

    public int getBtCountry() {
        return btCountry;
    }

    public void setBtCountry(int btCountry) {
        this.btCountry = btCountry;
    }

    public String getStrBrandUrl() {
        return strBrandUrl;
    }

    public void setStrBrandUrl(String strBrandUrl) {
        this.strBrandUrl = strBrandUrl;
    }

    public String getStrBrandName() {
        return strBrandName;
    }

    public void setStrBrandName(String strBrandName) {
        this.strBrandName = strBrandName;
    }

    public String getStrBrandEngName() {
        return strBrandEngName;
    }

    public void setStrBrandEngName(String strBrandEngName) {
        this.strBrandEngName = strBrandEngName;
    }

    public int getIIsPurchasing() {
        return iIsPurchasing;
    }

    public void setIIsPurchasing(int iIsPurchasing) {
        this.iIsPurchasing = iIsPurchasing;
    }

    public String getStrSpecifications() {
        return strSpecifications;
    }

    public void setStrSpecifications(String strSpecifications) {
        this.strSpecifications = strSpecifications;
    }

    public Object getAttributeTagFormatJson() {
        return AttributeTagFormatJson;
    }

    public void setAttributeTagFormatJson(Object AttributeTagFormatJson) {
        this.AttributeTagFormatJson = AttributeTagFormatJson;
    }

    public EditorBean getEditor() {
        return editor;
    }

    public void setEditor(EditorBean editor) {
        this.editor = editor;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "HomeOrderBean{" +
                "CommodityUrlArr=" + CommodityUrlArr +
                ", CommodityUrlNameArr=" + CommodityUrlNameArr +
                ", CommodityUrlCount=" + CommodityUrlCount +
                ", ContentNoHtmlCode='" + ContentNoHtmlCode + '\'' +
                ", InfoCommodityTagList=" + InfoCommodityTagList +
                ", iInfoID=" + iInfoID +
                ", strInfoTitle='" + strInfoTitle + '\'' +
                ", strSubtitle='" + strSubtitle + '\'' +
                ", strCommodityPrice='" + strCommodityPrice + '\'' +
                ", decOrginalPrice=" + decOrginalPrice +
                ", decMaxPrice=" + decMaxPrice +
                ", decMinPrice=" + decMinPrice +
                ", decOrginalPriceRMB=" + decOrginalPriceRMB +
                ", decMaxPriceRMB=" + decMaxPriceRMB +
                ", decMinPriceRMB=" + decMinPriceRMB +
                ", strImageArray='" + strImageArray + '\'' +
                ", strMainImage='" + strMainImage + '\'' +
                ", strInfoContent='" + strInfoContent + '\'' +
                ", mall=" + mall +
                ", strCommodityUrl='" + strCommodityUrl + '\'' +
                ", strCommodityUrlName='" + strCommodityUrlName + '\'' +
                ", strCommoditySourceUrl='" + strCommoditySourceUrl + '\'' +
                ", strContentUrl='" + strContentUrl + '\'' +
                ", strContentUrlName='" + strContentUrlName + '\'' +
                ", strContentSourceUrl='" + strContentSourceUrl + '\'' +
                ", strRedirectUrl='" + strRedirectUrl + '\'' +
                ", strSourceUrl='" + strSourceUrl + '\'' +
                ", iCommodityUrlHitCount=" + iCommodityUrlHitCount +
                ", strBrightUrl='" + strBrightUrl + '\'' +
                ", strBrightName='" + strBrightName + '\'' +
                ", btInfoNation=" + btInfoNation +
                ", strRegion='" + strRegion + '\'' +
                ", strProvinceCode='" + strProvinceCode + '\'' +
                ", strProvinceName='" + strProvinceName + '\'' +
                ", strCityCode='" + strCityCode + '\'' +
                ", strCityName='" + strCityName + '\'' +
                ", strDistrictCode='" + strDistrictCode + '\'' +
                ", strDistrictName='" + strDistrictName + '\'' +
                ", iIsGood=" + iIsGood +
                ", iIsBad=" + iIsBad +
                ", iInfoCollection=" + iInfoCollection +
                ", iInfoReview=" + iInfoReview +
                ", strInfoUrl='" + strInfoUrl + '\'' +
                ", strEditorRemark='" + strEditorRemark + '\'' +
                ", infoType=" + infoType +
                ", strCatUrl='" + strCatUrl + '\'' +
                ", strCatName='" + strCatName + '\'' +
                ", strTagUrl='" + strTagUrl + '\'' +
                ", strTagName='" + strTagName + '\'' +
                ", dtInfoTime='" + dtInfoTime + '\'' +
                ", dtUpdateTime='" + dtUpdateTime + '\'' +
                ", btSaleStatus=" + btSaleStatus +
                ", iHitCount=" + iHitCount +
                ", btAuditStatus=" + btAuditStatus +
                ", iPostInfoID=" + iPostInfoID +
                ", homeShow=" + homeShow +
                ", isTop=" + isTop +
                ", commodity=" + commodity +
                ", bShowFlag=" + bShowFlag +
                ", bDeleteFlag=" + bDeleteFlag +
                ", btVoteRate=" + btVoteRate +
                ", bCollectInfo=" + bCollectInfo +
                ", englishInfo=" + englishInfo +
                ", iCurrency=" + iCurrency +
                ", btCountry=" + btCountry +
                ", strBrandUrl='" + strBrandUrl + '\'' +
                ", strBrandName='" + strBrandName + '\'' +
                ", strBrandEngName='" + strBrandEngName + '\'' +
                ", iIsPurchasing=" + iIsPurchasing +
                ", strSpecifications='" + strSpecifications + '\'' +
                ", AttributeTagFormatJson=" + AttributeTagFormatJson +
                ", editor=" + editor +
                ", user=" + user +
                '}';
    }
}
