package com.spotify.connectivity;

import com.comscore.util.log.LogLevel;
import kotlin.Metadata;
import p204p.kyx;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, m24212d2 = {"Lcom/spotify/connectivity/AuthenticatedScopeConfiguration;", "", "<init>", "()V", "clientVersionLong", "", "getClientVersionLong", "()Ljava/lang/String;", "setClientVersionLong", "(Ljava/lang/String;)V", "cachePath", "getCachePath", "setCachePath", kyx.f127931b, "getClientId", "setClientId", "deviceId", "getDeviceId", "setDeviceId", "webgateLocale", "getWebgateLocale", "setWebgateLocale", "webgateTimeZone", "getWebgateTimeZone", "setWebgateTimeZone", "webgateUserAgentParameterAppVersion", "getWebgateUserAgentParameterAppVersion", "setWebgateUserAgentParameterAppVersion", "webgateUserAgentParameterAppPlatform", "getWebgateUserAgentParameterAppPlatform", "setWebgateUserAgentParameterAppPlatform", "webgateUserAgentParameterOsVersion", "getWebgateUserAgentParameterOsVersion", "setWebgateUserAgentParameterOsVersion", "webgateUserAgentParameterExtraInformation", "getWebgateUserAgentParameterExtraInformation", "setWebgateUserAgentParameterExtraInformation", "dealerPingTime", "", "getDealerPingTime", "()I", "setDealerPingTime", "(I)V", "appNativeTokenExchangeSetupLifecycle", "", "getAppNativeTokenExchangeSetupLifecycle", "()Z", "setAppNativeTokenExchangeSetupLifecycle", "(Z)V", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AuthenticatedScopeConfiguration {
    private boolean appNativeTokenExchangeSetupLifecycle;
    private String cachePath;
    private String clientId;
    private String clientVersionLong;
    private int dealerPingTime = LogLevel.NONE;
    private String deviceId;
    private String webgateLocale;
    private String webgateTimeZone;
    private String webgateUserAgentParameterAppPlatform;
    private String webgateUserAgentParameterAppVersion;
    private String webgateUserAgentParameterExtraInformation;
    private String webgateUserAgentParameterOsVersion;

    public final boolean getAppNativeTokenExchangeSetupLifecycle() {
        return this.appNativeTokenExchangeSetupLifecycle;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientVersionLong() {
        return this.clientVersionLong;
    }

    public final int getDealerPingTime() {
        return this.dealerPingTime;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getWebgateLocale() {
        return this.webgateLocale;
    }

    public final String getWebgateTimeZone() {
        return this.webgateTimeZone;
    }

    public final String getWebgateUserAgentParameterAppPlatform() {
        return this.webgateUserAgentParameterAppPlatform;
    }

    public final String getWebgateUserAgentParameterAppVersion() {
        return this.webgateUserAgentParameterAppVersion;
    }

    public final String getWebgateUserAgentParameterExtraInformation() {
        return this.webgateUserAgentParameterExtraInformation;
    }

    public final String getWebgateUserAgentParameterOsVersion() {
        return this.webgateUserAgentParameterOsVersion;
    }

    public final void setAppNativeTokenExchangeSetupLifecycle(boolean z) {
        this.appNativeTokenExchangeSetupLifecycle = z;
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setClientVersionLong(String str) {
        this.clientVersionLong = str;
    }

    public final void setDealerPingTime(int i) {
        this.dealerPingTime = i;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setWebgateLocale(String str) {
        this.webgateLocale = str;
    }

    public final void setWebgateTimeZone(String str) {
        this.webgateTimeZone = str;
    }

    public final void setWebgateUserAgentParameterAppPlatform(String str) {
        this.webgateUserAgentParameterAppPlatform = str;
    }

    public final void setWebgateUserAgentParameterAppVersion(String str) {
        this.webgateUserAgentParameterAppVersion = str;
    }

    public final void setWebgateUserAgentParameterExtraInformation(String str) {
        this.webgateUserAgentParameterExtraInformation = str;
    }

    public final void setWebgateUserAgentParameterOsVersion(String str) {
        this.webgateUserAgentParameterOsVersion = str;
    }
}
