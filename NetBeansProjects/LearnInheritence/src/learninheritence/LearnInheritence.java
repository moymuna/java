
package learninheritence;

import learninheritence.mobile.Android;

public class LearnInheritence {

    public static void main(String[] args) {
        Android android=new  Android();
        android.setBrowser("Chrome");
        android.setOs("Android");
        android.setPlayStore("yes");
        android.setTouchScreen("Gorila Glass");
        
        android.setCall("yes");
        android.setCamera("Multiple Camera");
        android.setGallery("Google Photos");
        android.setMessage("yes");
        android.setGames("Free Fire");
        System.out.println(android);
    }
    
}
