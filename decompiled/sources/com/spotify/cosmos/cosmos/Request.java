package com.spotify.cosmos.cosmos;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\nB=\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\rJ\n\u0010\u001c\u001a\u00020\u0005H\u0096\u0080\u0004R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m24212d2 = {"Lcom/spotify/cosmos/cosmos/Request;", "", "<init>", "()V", "action", "", "uri", "(Ljava/lang/String;Ljava/lang/String;)V", "body", "", "(Ljava/lang/String;Ljava/lang/String;[B)V", "headers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getUri", "setUri", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getBody", "()[B", "setBody", "([B)V", "toString", "Companion", "src_main_java_com_spotify_cosmos_cosmos-cosmos"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Request {
    public static final String DELETE = "DELETE";
    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String SUB = "SUB";
    private String action;
    private byte[] body;
    private Map<String, String> headers;
    private String uri;
    public static final byte[] EMPTY_BODY = new byte[0];

    public Request() {
        this.action = null;
        this.uri = null;
        this.headers = null;
        this.body = null;
    }

    public final String getAction() {
        return this.action;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getUri() {
        return this.uri;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public String toString() {
        return String.format("Request{mAction='%s', mUri='%s'}", Arrays.copyOf(new Object[]{this.action, this.uri}, 2));
    }

    public Request(String str, String str2) {
        this(str, str2, new LinkedHashMap(), EMPTY_BODY);
    }

    public Request(String str, String str2, byte[] bArr) {
        this(str, str2, new LinkedHashMap(), bArr);
    }

    public Request(String str, String str2, Map<String, String> map, byte[] bArr) {
        if (str2 != null) {
            if (str2.length() > 0) {
                this.action = str;
                this.uri = str2;
                this.headers = map;
                this.body = bArr;
                return;
            }
            throw new IllegalArgumentException("URI cannot be empty");
        }
        throw new IllegalArgumentException("URI cannot be null");
    }
}
