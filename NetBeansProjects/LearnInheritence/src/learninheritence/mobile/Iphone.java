
package learninheritence.mobile;

public class Iphone extends Mobile{
  private String appStore;
    private String safarri;
    private String faceTime;
    private String iMessage;
    private String os;

    public Iphone() {
    }

    public Iphone(String appStore, String safarri, String faceTime, String iMessage, String os) {
        this.appStore = appStore;
        this.safarri = safarri;
        this.faceTime = faceTime;
        this.iMessage = iMessage;
        this.os = os;
    }

    public Iphone(String appStore, String safarri, String faceTime, String iMessage, String os, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.appStore = appStore;
        this.safarri = safarri;
        this.faceTime = faceTime;
        this.iMessage = iMessage;
        this.os = os;
    }

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    public String getSafarri() {
        return safarri;
    }

    public void setSafarri(String safarri) {
        this.safarri = safarri;
    }

    public String getFaceTime() {
        return faceTime;
    }

    public void setFaceTime(String faceTime) {
        this.faceTime = faceTime;
    }

    public String getiMessage() {
        return iMessage;
    }

    public void setiMessage(String iMessage) {
        this.iMessage = iMessage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Iphone{" + "appStore=" + appStore + ", safarri=" + safarri + ", faceTime=" + faceTime + ", iMessage=" + iMessage + ", os=" + os + '}';
    }

}
