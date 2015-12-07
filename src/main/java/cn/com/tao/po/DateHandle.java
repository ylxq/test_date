package cn.com.tao.po;

/**
 * Created by kdhc on 2015/12/1.
 */
public class DateHandle {

    private int did;
    private String dateString;
    private String afterHandleDate;
    private int isHandle;//0表示未处理，1表示已处理
    private  String url;//true 表示处理正确，false表示处理失败


    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getAfterHandleDate() {
        return afterHandleDate;
    }

    public void setAfterHandleDate(String afterHandleDate) {
        this.afterHandleDate = afterHandleDate;
    }

    public int getIsHandle() {
        return isHandle;
    }

    public void setIsHandle(int isHandle) {
        this.isHandle = isHandle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
