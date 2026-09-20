package com.spotify.cosmos.cosmos;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\u0016\u001a\u00020\u0005H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/cosmos/cosmos/Response;", "", "status", "", "uri", "", "headers", "", "body", "", "<init>", "(ILjava/lang/String;Ljava/util/Map;[B)V", "getStatus", "()I", "getUri", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getBody", "()[B", "bodyString", "getBodyString", "toString", "src_main_java_com_spotify_cosmos_cosmos-cosmos"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Response {
    private final byte[] body;
    private final Map<String, String> headers;
    private final int status;
    private final String uri;

    public Response(int i, String str, Map<String, String> map, byte[] bArr) {
        this.status = i;
        this.uri = str;
        this.headers = map;
        this.body = bArr;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final String getBodyString() {
        byte[] bArr = this.body;
        return bArr != null ? new String(bArr, ResponseKt.DEFAULT_CHARSET) : new String();
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUri() {
        return this.uri;
    }

    public String toString() {
        return "Response{mStatus=" + this.status + ", mUri='" + this.uri + "', mHeaders=" + this.headers + ", mBody='" + getBodyString() + "'}";
    }
}
