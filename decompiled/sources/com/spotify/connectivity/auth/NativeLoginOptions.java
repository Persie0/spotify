package com.spotify.connectivity.auth;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001c\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001a\u0010:\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'¨\u0006="}, m24212d2 = {"Lcom/spotify/connectivity/auth/NativeLoginOptions;", "", "<init>", "()V", "apSrvHostOverride", "", "getApSrvHostOverride", "()Ljava/lang/String;", "setApSrvHostOverride", "(Ljava/lang/String;)V", "apHostOverride", "getApHostOverride", "setApHostOverride", "xResolveHostOverride", "getXResolveHostOverride", "setXResolveHostOverride", "authOnly", "", "getAuthOnly", "()Z", "setAuthOnly", "(Z)V", "bootstrapRequired", "getBootstrapRequired", "setBootstrapRequired", "enableAlwaysBootstrap", "getEnableAlwaysBootstrap", "setEnableAlwaysBootstrap", "maintainPersistentApConnection", "getMaintainPersistentApConnection", "setMaintainPersistentApConnection", "canonicalUsername", "getCanonicalUsername", "setCanonicalUsername", "proxyPort", "", "getProxyPort", "()I", "setProxyPort", "(I)V", "proxyHostName", "getProxyHostName", "setProxyHostName", "proxyUserName", "getProxyUserName", "setProxyUserName", "proxyPassword", "getProxyPassword", "setProxyPassword", "cacheId", "", "getCacheId", "()[B", "setCacheId", "([B)V", "cacheSalt", "getCacheSalt", "setCacheSalt", "proxyOption", "getProxyOption", "setProxyOption", "src_main_java_com_spotify_connectivityauth_authimpl-connectivityauth-authimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeLoginOptions {
    private String apHostOverride;
    private String apSrvHostOverride;
    private boolean authOnly;
    private boolean bootstrapRequired;
    private byte[] cacheId;
    private byte[] cacheSalt;
    private String canonicalUsername;
    private boolean enableAlwaysBootstrap;
    private boolean maintainPersistentApConnection = true;
    private String proxyHostName;
    private int proxyOption;
    private String proxyPassword;
    private int proxyPort;
    private String proxyUserName;
    private String xResolveHostOverride;

    public final String getApHostOverride() {
        return this.apHostOverride;
    }

    public final String getApSrvHostOverride() {
        return this.apSrvHostOverride;
    }

    public final boolean getAuthOnly() {
        return this.authOnly;
    }

    public final boolean getBootstrapRequired() {
        return this.bootstrapRequired;
    }

    public final byte[] getCacheId() {
        return this.cacheId;
    }

    public final byte[] getCacheSalt() {
        return this.cacheSalt;
    }

    public final String getCanonicalUsername() {
        return this.canonicalUsername;
    }

    public final boolean getEnableAlwaysBootstrap() {
        return this.enableAlwaysBootstrap;
    }

    public final boolean getMaintainPersistentApConnection() {
        return this.maintainPersistentApConnection;
    }

    public final String getProxyHostName() {
        return this.proxyHostName;
    }

    public final int getProxyOption() {
        return this.proxyOption;
    }

    public final String getProxyPassword() {
        return this.proxyPassword;
    }

    public final int getProxyPort() {
        return this.proxyPort;
    }

    public final String getProxyUserName() {
        return this.proxyUserName;
    }

    public final String getXResolveHostOverride() {
        return this.xResolveHostOverride;
    }

    public final void setApHostOverride(String str) {
        this.apHostOverride = str;
    }

    public final void setApSrvHostOverride(String str) {
        this.apSrvHostOverride = str;
    }

    public final void setAuthOnly(boolean z) {
        this.authOnly = z;
    }

    public final void setBootstrapRequired(boolean z) {
        this.bootstrapRequired = z;
    }

    public final void setCacheId(byte[] bArr) {
        this.cacheId = bArr;
    }

    public final void setCacheSalt(byte[] bArr) {
        this.cacheSalt = bArr;
    }

    public final void setCanonicalUsername(String str) {
        this.canonicalUsername = str;
    }

    public final void setEnableAlwaysBootstrap(boolean z) {
        this.enableAlwaysBootstrap = z;
    }

    public final void setMaintainPersistentApConnection(boolean z) {
        this.maintainPersistentApConnection = z;
    }

    public final void setProxyHostName(String str) {
        this.proxyHostName = str;
    }

    public final void setProxyOption(int i) {
        this.proxyOption = i;
    }

    public final void setProxyPassword(String str) {
        this.proxyPassword = str;
    }

    public final void setProxyPort(int i) {
        this.proxyPort = i;
    }

    public final void setProxyUserName(String str) {
        this.proxyUserName = str;
    }

    public final void setXResolveHostOverride(String str) {
        this.xResolveHostOverride = str;
    }
}
