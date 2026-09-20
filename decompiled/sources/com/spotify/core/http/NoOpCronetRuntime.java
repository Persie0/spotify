package com.spotify.core.http;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, m24212d2 = {"Lcom/spotify/core/http/NoOpCronetRuntime;", "Lcom/spotify/core/http/CronetRuntime;", "<init>", "()V", "Lcom/spotify/core/http/HttpConnectionFactory;", "okHttpFactory", "wrapFactory", "(Lcom/spotify/core/http/HttpConnectionFactory;)Lcom/spotify/core/http/HttpConnectionFactory;", "Lp/w2a1;", "clearCache", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NoOpCronetRuntime implements CronetRuntime {
    public static final NoOpCronetRuntime INSTANCE = new NoOpCronetRuntime();

    private NoOpCronetRuntime() {
    }

    @Override // com.spotify.core.http.CronetRuntime
    public void clearCache() {
    }

    @Override // com.spotify.core.http.CronetRuntime
    public HttpConnectionFactory wrapFactory(HttpConnectionFactory okHttpFactory) {
        return okHttpFactory;
    }
}
