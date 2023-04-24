package dev.ifrs;

public class VolumeUtil {

    private AudioManager audioManager;

    public void maximizeVolume(int max) {
        audioManager.setVolume(max);
    }

}
