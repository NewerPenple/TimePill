package biyabi.bean;

import java.io.Serializable;

public class HomeItemResultBean implements Serializable {
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
    private int iBrandExclusiveID;
    private String strBrandExclusiveTitle;
    private String strBandUrl;
    private String strBrandImage;
    private String strBrandDetailImage;
    private String strBrandContent;
    private int btBrandExclusiveType;
    private Object listBrandExclusiveInfo;
    private int IcoID;
    private String IcoName;
    private String IcoImage;
    private String IcoCode;
    private String IcoUrl;
    private int ShowFlag;
    private int DeleteFlag;
    private String IcoSorting;
    private int IcoType;
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

    public int getProID() {
        return ProID;
    }

    public void setProID(int proID) {
        ProID = proID;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String proName) {
        ProName = proName;
    }

    public String getProEngName() {
        return ProEngName;
    }

    public void setProEngName(String proEngName) {
        ProEngName = proEngName;
    }

    public String getProWebsite() {
        return ProWebsite;
    }

    public void setProWebsite(String proWebsite) {
        ProWebsite = proWebsite;
    }

    public String getProImage() {
        return ProImage;
    }

    public void setProImage(String proImage) {
        ProImage = proImage;
    }

    public String getMallUrl() {
        return MallUrl;
    }

    public void setMallUrl(String mallUrl) {
        MallUrl = mallUrl;
    }

    public String getMallName() {
        return MallName;
    }

    public void setMallName(String mallName) {
        MallName = mallName;
    }

    public int getProNation() {
        return ProNation;
    }

    public void setProNation(int proNation) {
        ProNation = proNation;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public int getPromotionsType() {
        return PromotionsType;
    }

    public void setPromotionsType(int promotionsType) {
        PromotionsType = promotionsType;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public int getOrderBy() {
        return OrderBy;
    }

    public void setOrderBy(int orderBy) {
        OrderBy = orderBy;
    }

    public int getiBrandExclusiveID() {
        return iBrandExclusiveID;
    }

    public void setiBrandExclusiveID(int iBrandExclusiveID) {
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

    public int getBtBrandExclusiveType() {
        return btBrandExclusiveType;
    }

    public void setBtBrandExclusiveType(int btBrandExclusiveType) {
        this.btBrandExclusiveType = btBrandExclusiveType;
    }

    public Object getListBrandExclusiveInfo() {
        return listBrandExclusiveInfo;
    }

    public void setListBrandExclusiveInfo(Object listBrandExclusiveInfo) {
        this.listBrandExclusiveInfo = listBrandExclusiveInfo;
    }

    public int getIcoID() {
        return IcoID;
    }

    public void setIcoID(int icoID) {
        IcoID = icoID;
    }

    public String getIcoName() {
        return IcoName;
    }

    public void setIcoName(String icoName) {
        IcoName = icoName;
    }

    public String getIcoImage() {
        return IcoImage;
    }

    public void setIcoImage(String icoImage) {
        IcoImage = icoImage;
    }

    public String getIcoCode() {
        return IcoCode;
    }

    public void setIcoCode(String icoCode) {
        IcoCode = icoCode;
    }

    public String getIcoUrl() {
        return IcoUrl;
    }

    public void setIcoUrl(String icoUrl) {
        IcoUrl = icoUrl;
    }

    public int getShowFlag() {
        return ShowFlag;
    }

    public void setShowFlag(int showFlag) {
        ShowFlag = showFlag;
    }

    public int getDeleteFlag() {
        return DeleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        DeleteFlag = deleteFlag;
    }

    public String getIcoSorting() {
        return IcoSorting;
    }

    public void setIcoSorting(String icoSorting) {
        IcoSorting = icoSorting;
    }

    public int getIcoType() {
        return IcoType;
    }

    public void setIcoType(int icoType) {
        IcoType = icoType;
    }

    public Object getCommodityUrlArr() {
        return CommodityUrlArr;
    }

    public void setCommodityUrlArr(Object commodityUrlArr) {
        CommodityUrlArr = commodityUrlArr;
    }

    public Object getCommodityUrlNameArr() {
        return CommodityUrlNameArr;
    }

    public void setCommodityUrlNameArr(Object commodityUrlNameArr) {
        CommodityUrlNameArr = commodityUrlNameArr;
    }

    public int getCommodityUrlCount() {
        return CommodityUrlCount;
    }

    public void setCommodityUrlCount(int commodityUrlCount) {
        CommodityUrlCount = commodityUrlCount;
    }

    public String getContentNoHtmlCode() {
        return ContentNoHtmlCode;
    }

    public void setContentNoHtmlCode(String contentNoHtmlCode) {
        ContentNoHtmlCode = contentNoHtmlCode;
    }

    public Object getInfoCommodityTagList() {
        return InfoCommodityTagList;
    }

    public void setInfoCommodityTagList(Object infoCommodityTagList) {
        InfoCommodityTagList = infoCommodityTagList;
    }

    public int getiInfoID() {
        return iInfoID;
    }

    public void setiInfoID(int iInfoID) {
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

    public int getiCommodityUrlHitCount() {
        return iCommodityUrlHitCount;
    }

    public void setiCommodityUrlHitCount(int iCommodityUrlHitCount) {
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

    public int getiIsGood() {
        return iIsGood;
    }

    public void setiIsGood(int iIsGood) {
        this.iIsGood = iIsGood;
    }

    public int getiIsBad() {
        return iIsBad;
    }

    public void setiIsBad(int iIsBad) {
        this.iIsBad = iIsBad;
    }

    public int getiInfoCollection() {
        return iInfoCollection;
    }

    public void setiInfoCollection(int iInfoCollection) {
        this.iInfoCollection = iInfoCollection;
    }

    public int getiInfoReview() {
        return iInfoReview;
    }

    public void setiInfoReview(int iInfoReview) {
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

    public int getiHitCount() {
        return iHitCount;
    }

    public void setiHitCount(int iHitCount) {
        this.iHitCount = iHitCount;
    }

    public int getBtAuditStatus() {
        return btAuditStatus;
    }

    public void setBtAuditStatus(int btAuditStatus) {
        this.btAuditStatus = btAuditStatus;
    }

    public int getiPostInfoID() {
        return iPostInfoID;
    }

    public void setiPostInfoID(int iPostInfoID) {
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

    public int getBtVoteRate() {
        return btVoteRate;
    }

    public void setBtVoteRate(int btVoteRate) {
        this.btVoteRate = btVoteRate;
    }

    public boolean isbCollectInfo() {
        return bCollectInfo;
    }

    public void setbCollectInfo(boolean bCollectInfo) {
        this.bCollectInfo = bCollectInfo;
    }

    public EnglishInfoBean getEnglishInfo() {
        return englishInfo;
    }

    public void setEnglishInfo(EnglishInfoBean englishInfo) {
        this.englishInfo = englishInfo;
    }

    public int getiCurrency() {
        return iCurrency;
    }

    public void setiCurrency(int iCurrency) {
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

    public int getiIsPurchasing() {
        return iIsPurchasing;
    }

    public void setiIsPurchasing(int iIsPurchasing) {
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

    public void setAttributeTagFormatJson(Object attributeTagFormatJson) {
        AttributeTagFormatJson = attributeTagFormatJson;
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

    public int getiSpecialID() {
        return iSpecialID;
    }

    public void setiSpecialID(int iSpecialID) {
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

    public int getiEditorID() {
        return iEditorID;
    }

    public void setiEditorID(int iEditorID) {
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

    public int getiParentSpecialID() {
        return iParentSpecialID;
    }

    public void setiParentSpecialID(int iParentSpecialID) {
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

    public boolean isbShowFlag() {
        return bShowFlag;
    }

    public void setbShowFlag(boolean bShowFlag) {
        this.bShowFlag = bShowFlag;
    }

    public boolean isbDeleteFlag() {
        return bDeleteFlag;
    }

    public void setbDeleteFlag(boolean bDeleteFlag) {
        this.bDeleteFlag = bDeleteFlag;
    }

    public int getiOrderby() {
        return iOrderby;
    }

    public void setiOrderby(int iOrderby) {
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
        return "HomeItemResultBean{" +
                "ProID=" + ProID +
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
                ", iBrandExclusiveID=" + iBrandExclusiveID +
                ", strBrandExclusiveTitle='" + strBrandExclusiveTitle + '\'' +
                ", strBandUrl='" + strBandUrl + '\'' +
                ", strBrandImage='" + strBrandImage + '\'' +
                ", strBrandDetailImage='" + strBrandDetailImage + '\'' +
                ", strBrandContent='" + strBrandContent + '\'' +
                ", btBrandExclusiveType=" + btBrandExclusiveType +
                ", listBrandExclusiveInfo=" + listBrandExclusiveInfo +
                ", IcoID=" + IcoID +
                ", IcoName='" + IcoName + '\'' +
                ", IcoImage='" + IcoImage + '\'' +
                ", IcoCode='" + IcoCode + '\'' +
                ", IcoUrl='" + IcoUrl + '\'' +
                ", ShowFlag=" + ShowFlag +
                ", DeleteFlag=" + DeleteFlag +
                ", IcoSorting='" + IcoSorting + '\'' +
                ", IcoType=" + IcoType +
                ", CommodityUrlArr=" + CommodityUrlArr +
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
                ", iSpecialID=" + iSpecialID +
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
