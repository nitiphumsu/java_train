package mobile;

public class Iphone extends SmartPhone implements MediaPlayer, GPS {
	
    public void installApplication(String appName) {
        System.out.println(appName + " has been installed.");
    }

    public String playSong(String songName) {
        return songName;
    }

    public String playVideo(String videoName) {
        return videoName;
    }

    public String getLocation() {
        return "Lat: 99.99, Long: 11.11";
    }
}
