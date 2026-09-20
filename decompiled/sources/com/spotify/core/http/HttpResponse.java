package com.spotify.core.http;

import kotlin.Metadata;
import p204p.dq60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u000e\u001a\u00020\u0005H\u0096\u0080\u0004J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0003H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/core/http/HttpResponse;", "", "status", "", "url", "", "headers", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getStatus", "()I", "getUrl", "()Ljava/lang/String;", "getHeaders", "toString", "equals", "", "other", "hashCode", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class HttpResponse {
    private final String headers;
    private final int status;
    private final String url;

    public HttpResponse(int i, String str, String str2) {
        this.status = i;
        this.url = str;
        this.headers = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!HttpResponse.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return this.status == httpResponse.status && wj50.m88271j(this.url, httpResponse.url) && wj50.m88271j(this.headers, httpResponse.headers);
    }

    public final String getHeaders() {
        return this.headers;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.headers.hashCode() + s571.m77243b(this.status * 31, 31, this.url);
    }

    public String toString() {
        int i = this.status;
        String str = this.url;
        String str2 = this.headers;
        StringBuilder sb = new StringBuilder("HttpResponse{status=");
        sb.append(i);
        sb.append(", url='");
        sb.append(str);
        sb.append("', headers='");
        return dq60.m36616p(str2, "'}", sb);
    }
}
