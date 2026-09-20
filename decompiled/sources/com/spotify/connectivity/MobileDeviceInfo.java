package com.spotify.connectivity;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001a\u0010(\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001a\u0010+\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001c\u00101\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001a\u00104\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\t¨\u00067"}, m24212d2 = {"Lcom/spotify/connectivity/MobileDeviceInfo;", "", "<init>", "()V", "osVersion", "", "getOsVersion", "()Ljava/lang/String;", "setOsVersion", "(Ljava/lang/String;)V", "apiLevel", "", "getApiLevel", "()I", "setApiLevel", "(I)V", "name", "getName", "setName", "model", "getModel", "setModel", "brand", "getBrand", "setBrand", "manufacturer", "getManufacturer", "setManufacturer", "deviceType", "getDeviceType", "setDeviceType", "volumeSteps", "getVolumeSteps", "setVolumeSteps", "screenWidth", "getScreenWidth", "setScreenWidth", "screenHeight", "getScreenHeight", "setScreenHeight", "smallestScreenWidthDp", "getSmallestScreenWidthDp", "setSmallestScreenWidthDp", "screenDensityCurrent", "getScreenDensityCurrent", "setScreenDensityCurrent", "screenDensityStable", "getScreenDensityStable", "setScreenDensityStable", "cachePath", "getCachePath", "setCachePath", "installerName", "getInstallerName", "setInstallerName", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MobileDeviceInfo {
    private int apiLevel;
    private String brand;
    private String cachePath;
    private int deviceType;
    private String manufacturer;
    private String model;
    private String name;
    private String osVersion;
    private int screenDensityCurrent;
    private int screenDensityStable;
    private int screenHeight;
    private int screenWidth;
    private int smallestScreenWidthDp;
    private int volumeSteps = 32;
    private String installerName = "";

    public final int getApiLevel() {
        return this.apiLevel;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final String getInstallerName() {
        return this.installerName;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final int getScreenDensityCurrent() {
        return this.screenDensityCurrent;
    }

    public final int getScreenDensityStable() {
        return this.screenDensityStable;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final int getSmallestScreenWidthDp() {
        return this.smallestScreenWidthDp;
    }

    public final int getVolumeSteps() {
        return this.volumeSteps;
    }

    public final void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setInstallerName(String str) {
        this.installerName = str;
    }

    public final void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOsVersion(String str) {
        this.osVersion = str;
    }

    public final void setScreenDensityCurrent(int i) {
        this.screenDensityCurrent = i;
    }

    public final void setScreenDensityStable(int i) {
        this.screenDensityStable = i;
    }

    public final void setScreenHeight(int i) {
        this.screenHeight = i;
    }

    public final void setScreenWidth(int i) {
        this.screenWidth = i;
    }

    public final void setSmallestScreenWidthDp(int i) {
        this.smallestScreenWidthDp = i;
    }

    public final void setVolumeSteps(int i) {
        this.volumeSteps = i;
    }
}
