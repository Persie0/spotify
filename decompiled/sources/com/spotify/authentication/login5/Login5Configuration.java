package com.spotify.authentication.login5;

import kotlin.Metadata;
import p204p.kyx;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/authentication/login5/Login5Configuration;", "", "<init>", "()V", kyx.f127931b, "", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "setDeviceId", "protocolVersion", "", "getProtocolVersion", "()I", "setProtocolVersion", "(I)V", "src_main_java_com_spotify_authentication_login5-login5"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Login5Configuration {
    private String clientId = "";
    private String deviceId = "";
    private int protocolVersion = 3;

    public final String getClientId() {
        return this.clientId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setProtocolVersion(int i) {
        this.protocolVersion = i;
    }
}
