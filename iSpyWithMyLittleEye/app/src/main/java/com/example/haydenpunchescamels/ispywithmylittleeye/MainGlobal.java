package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.app.Application;
import android.provider.Settings;

import java.util.ArrayList;

/**
 * Created by Kaina on 11/9/16.
 */

public class MainGlobal extends Application {
    private ArrayList<Camera> camera;
    private int currentCameraType;
    private Notifications notifications;


    public MainGlobal() {
        this.camera = new ArrayList<Camera>();
        this.notifications = new Notifications();
        addCamera("camera_1", "Web Cam", "android.resource://com.example.haydenpunchescamels.ispywithmylittleeye/\" + R.raw.movie");
    }

    public Camera getCurrentCamera() {
        return camera.get(currentCameraType);
    }

    public ArrayList<Camera> getCamera() { return camera;}
    public Notifications getNotifications() { return notifications;}

    public void editCameraSettings(String name, String type) {
        Camera current = getCurrentCamera();
        current.setName(name);
        current.setType(type);

    }

    public Camera getCameraType() {return camera.get(currentCameraType); }

    public void deleteCamera(int index) {
        camera.remove(index);
    }

    public void addCamera(String name, String type, String url) {
        camera.add(new Camera(name, type, url));
    }
}

class Camera {
    private String name;
    private String type;
    private String url;

    public Camera (String name, String type, String url) {
        this.name = name;
        this.type = type;
        this.url = url;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public String getUrl() { return url; }

    public void setName(String n ) { name = n; }
    public void setType(String n ) { type = n; }
    public void setUrl(String n ) { url = n; }

}

class Notifications {
    private boolean settings;

    public Notifications() {
        settings = true;
    }
}