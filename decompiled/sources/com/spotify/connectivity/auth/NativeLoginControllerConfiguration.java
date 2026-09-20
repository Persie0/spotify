package com.spotify.connectivity.auth;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001a\u0010.\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u00101\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018¨\u00064"}, m24212d2 = {"Lcom/spotify/connectivity/auth/NativeLoginControllerConfiguration;", "", "<init>", "()V", "clientID", "", "getClientID", "()Ljava/lang/String;", "setClientID", "(Ljava/lang/String;)V", "cachePath", "getCachePath", "setCachePath", "deviceId", "getDeviceId", "setDeviceId", "deviceHardwareModel", "getDeviceHardwareModel", "setDeviceHardwareModel", "protocolOsOverride", "", "getProtocolOsOverride", "()I", "setProtocolOsOverride", "(I)V", "revision", "", "getRevision", "()J", "setRevision", "(J)V", "versionLong", "getVersionLong", "setVersionLong", "accesspointLanguage", "getAccesspointLanguage", "setAccesspointLanguage", "tracingEnabled", "", "getTracingEnabled", "()Z", "setTracingEnabled", "(Z)V", "contentAccessRefreshToken", "getContentAccessRefreshToken", "setContentAccessRefreshToken", "reconnectPolicy", "getReconnectPolicy", "setReconnectPolicy", "streamingRulesSupported", "getStreamingRulesSupported", "setStreamingRulesSupported", "src_main_java_com_spotify_connectivityauth_authimpl-connectivityauth-authimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeLoginControllerConfiguration {
    private String accesspointLanguage;
    private String cachePath;
    private String clientID;
    private String contentAccessRefreshToken;
    private String deviceHardwareModel;
    private String deviceId;
    private int protocolOsOverride;
    private int reconnectPolicy = 2;
    private long revision;
    private int streamingRulesSupported;
    private boolean tracingEnabled;
    private String versionLong;

    public final String getAccesspointLanguage() {
        return this.accesspointLanguage;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final String getClientID() {
        return this.clientID;
    }

    public final String getContentAccessRefreshToken() {
        return this.contentAccessRefreshToken;
    }

    public final String getDeviceHardwareModel() {
        return this.deviceHardwareModel;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getProtocolOsOverride() {
        return this.protocolOsOverride;
    }

    public final int getReconnectPolicy() {
        return this.reconnectPolicy;
    }

    public final long getRevision() {
        return this.revision;
    }

    public final int getStreamingRulesSupported() {
        return this.streamingRulesSupported;
    }

    public final boolean getTracingEnabled() {
        return this.tracingEnabled;
    }

    public final String getVersionLong() {
        return this.versionLong;
    }

    public final void setAccesspointLanguage(String str) {
        this.accesspointLanguage = str;
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setClientID(String str) {
        this.clientID = str;
    }

    public final void setContentAccessRefreshToken(String str) {
        this.contentAccessRefreshToken = str;
    }

    public final void setDeviceHardwareModel(String str) {
        this.deviceHardwareModel = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setProtocolOsOverride(int i) {
        this.protocolOsOverride = i;
    }

    public final void setReconnectPolicy(int i) {
        this.reconnectPolicy = i;
    }

    public final void setRevision(long j) {
        this.revision = j;
    }

    public final void setStreamingRulesSupported(int i) {
        this.streamingRulesSupported = i;
    }

    public final void setTracingEnabled(boolean z) {
        this.tracingEnabled = z;
    }

    public final void setVersionLong(String str) {
        this.versionLong = str;
    }
}
