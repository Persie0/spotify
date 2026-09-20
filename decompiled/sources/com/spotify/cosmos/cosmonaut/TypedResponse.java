package com.spotify.cosmos.cosmonaut;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edb;
import p204p.gtq;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\"#B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonaut/TypedResponse;", "T", "", "status", "", "uri", "", "headers", "", "body", "<init>", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/Object;)V", "getStatus", "()I", "getUri", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "toBuilder", "Lcom/spotify/cosmos/cosmonaut/TypedResponse$Builder;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Lcom/spotify/cosmos/cosmonaut/TypedResponse;", "equals", "", "other", "hashCode", "toString", "Companion", "Builder", "src_main_java_com_spotify_cosmos_cosmonaut-cosmonaut"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class TypedResponse<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final T body;
    private final Map<String, String> headers;
    private final int status;
    private final String uri;

    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonaut/TypedResponse$Builder;", "T", "", "<init>", "()V", "status", "", "Ljava/lang/Integer;", "uri", "", "headers", "", "body", "Ljava/lang/Object;", "(Ljava/lang/Object;)Lcom/spotify/cosmos/cosmonaut/TypedResponse$Builder;", "build", "Lcom/spotify/cosmos/cosmonaut/TypedResponse;", "src_main_java_com_spotify_cosmos_cosmonaut-cosmonaut"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Builder<T> {
        private T body;
        private Map<String, String> headers;
        private Integer status;
        private String uri;

        public final Builder<T> body(T body) {
            this.body = body;
            return this;
        }

        public final TypedResponse<T> build() {
            Integer num = this.status;
            if (num == null) {
                throw new IllegalStateException("status was not set!");
            }
            int iIntValue = num.intValue();
            String str = this.uri;
            if (str == null) {
                throw new IllegalStateException("uri was not set!");
            }
            Map<String, String> map = this.headers;
            if (map != null) {
                return new TypedResponse<>(iIntValue, str, map, this.body);
            }
            throw new IllegalStateException("headers was not set!");
        }

        public final Builder<T> headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public final Builder<T> status(int status) {
            this.status = Integer.valueOf(status);
            return this;
        }

        public final Builder<T> uri(String uri) {
            this.uri = uri;
            return this;
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u0006H\u0007¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonaut/TypedResponse$Companion;", "", "<init>", "()V", "builder", "Lcom/spotify/cosmos/cosmonaut/TypedResponse$Builder;", "T", "src_main_java_com_spotify_cosmos_cosmonaut-cosmonaut"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @gtq
        public final <T> Builder<T> builder() {
            return new Builder<>();
        }

        private Companion() {
        }
    }

    public TypedResponse(int i, String str, Map<String, String> map, T t) {
        this.status = i;
        this.uri = str;
        this.headers = map;
        this.body = t;
    }

    @gtq
    public static final <T> Builder<T> builder() {
        return INSTANCE.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypedResponse copy$default(TypedResponse typedResponse, int i, String str, Map map, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = typedResponse.status;
        }
        if ((i2 & 2) != 0) {
            str = typedResponse.uri;
        }
        if ((i2 & 4) != 0) {
            map = typedResponse.headers;
        }
        if ((i2 & 8) != 0) {
            obj = typedResponse.body;
        }
        return typedResponse.copy(i, str, map, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    public final T component4() {
        return this.body;
    }

    public final TypedResponse<T> copy(int status, String uri, Map<String, String> headers, T body) {
        return new TypedResponse<>(status, uri, headers, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypedResponse)) {
            return false;
        }
        TypedResponse typedResponse = (TypedResponse) other;
        return this.status == typedResponse.status && wj50.m88271j(this.uri, typedResponse.uri) && wj50.m88271j(this.headers, typedResponse.headers) && wj50.m88271j(this.body, typedResponse.body);
    }

    public final T getBody() {
        return this.body;
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

    public int hashCode() {
        int iM38557f = edb.m38557f(s571.m77243b(Integer.hashCode(this.status) * 31, 31, this.uri), 31, this.headers);
        T t = this.body;
        return iM38557f + (t == null ? 0 : t.hashCode());
    }

    public final Builder<T> toBuilder() {
        return new Builder().status(this.status).uri(this.uri).headers(this.headers).body(this.body);
    }

    public String toString() {
        return super.toString();
    }
}
