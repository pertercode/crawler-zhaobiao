package bean;

public class Tender {

    // 区域ID
    private String areaId ;

    // 区域标题
    private String areaTitle ;

    // 上级区域ID
    private String parentAreaId ;

    // 上级区域标题
    private String parentAreaTitle ;

    // 招标标题
    private String title ;

    // 招标内容
    private String content ;

    // 爬虫来源
    private String crawlerFrom ;

    // 爬虫来源网站名称
    private String crawlerFromName ;

    // 信息真实来源
    private String realFrom ;

    // 真实来源网站名称
    private String realFromName ;

    // 业务类型
    private String yeWuType ;

    // 信息类型
    private String infoType ;

    // 行业
    private String hangYe ;

    // 发表时间
    private String sendTime ;


    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaTitle() {
        return areaTitle;
    }

    public void setAreaTitle(String areaTitle) {
        this.areaTitle = areaTitle;
    }

    public String getParentAreaId() {
        return parentAreaId;
    }

    public void setParentAreaId(String parentAreaId) {
        this.parentAreaId = parentAreaId;
    }

    public String getParentAreaTitle() {
        return parentAreaTitle;
    }

    public void setParentAreaTitle(String parentAreaTitle) {
        this.parentAreaTitle = parentAreaTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCrawlerFrom() {
        return crawlerFrom;
    }

    public void setCrawlerFrom(String crawlerFrom) {
        this.crawlerFrom = crawlerFrom;
    }

    public String getCrawlerFromName() {
        return crawlerFromName;
    }

    public void setCrawlerFromName(String crawlerFromName) {
        this.crawlerFromName = crawlerFromName;
    }

    public String getRealFrom() {
        return realFrom;
    }

    public void setRealFrom(String realFrom) {
        this.realFrom = realFrom;
    }

    public String getRealFromName() {
        return realFromName;
    }

    public void setRealFromName(String realFromName) {
        this.realFromName = realFromName;
    }

    public String getYeWuType() {
        return yeWuType;
    }

    public void setYeWuType(String yeWuType) {
        this.yeWuType = yeWuType;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getHangYe() {
        return hangYe;
    }

    public void setHangYe(String hangYe) {
        this.hangYe = hangYe;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
