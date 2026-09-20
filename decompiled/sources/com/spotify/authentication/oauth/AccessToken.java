package com.spotify.authentication.oauth;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/authentication/oauth/AccessToken;", "", "<init>", "()V", "tokenType", "", "getTokenType", "()Ljava/lang/String;", "setTokenType", "(Ljava/lang/String;)V", "accessToken", "getAccessToken", "setAccessToken", "expiresAt", "", "getExpiresAt", "()J", "setExpiresAt", "(J)V", "src_main_java_com_spotify_authentication_oauth-oauth"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AccessToken {
    private long expiresAt;
    private String tokenType = "";
    private String accessToken = "";

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setExpiresAt(long j) {
        this.expiresAt = j;
    }

    public final void setTokenType(String str) {
        this.tokenType = str;
    }
}
