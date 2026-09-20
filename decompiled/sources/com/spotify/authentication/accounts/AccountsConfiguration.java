package com.spotify.authentication.accounts;

import kotlin.Metadata;
import p204p.kyx;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m24212d2 = {"Lcom/spotify/authentication/accounts/AccountsConfiguration;", "", "<init>", "()V", kyx.f127931b, "", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "setDeviceId", "src_main_java_com_spotify_authentication_accounts-accounts"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AccountsConfiguration {
    private String clientId = "";
    private String deviceId = "";

    public final String getClientId() {
        return this.clientId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }
}
