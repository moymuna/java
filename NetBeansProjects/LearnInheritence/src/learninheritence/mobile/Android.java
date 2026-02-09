
package learninheritence.mobile;

public class Android extends Mobile {
    private String playStore;
    private String browser;
    private String touchScreen;
    private String os;

    public Android() {
    }

    public Android(String playStore, String browser, String touchScreen, String os) {
        this.playStore = playStore;
        this.browser = browser;
        this.touchScreen = touchScreen;
        this.os = os;
    }

    public Android(String playStore, String browser, String touchScreen, String os, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.playStore = playStore;
        this.browser = browser;
        this.touchScreen = touchScreen;
        this.os = os;
    }

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Android{" + "playStore=" + playStore + ", browser=" + browser + ", touchScreen=" + touchScreen + ", os=" + os + '}';
    }
   
    
}
