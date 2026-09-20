package com.spotify.core.http;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/core/http/CronetRuntime;", "", "Lcom/spotify/core/http/HttpConnectionFactory;", "okHttpFactory", "wrapFactory", "(Lcom/spotify/core/http/HttpConnectionFactory;)Lcom/spotify/core/http/HttpConnectionFactory;", "Lp/w2a1;", "clearCache", "()V", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CronetRuntime {
    void clearCache();

    HttpConnectionFactory wrapFactory(HttpConnectionFactory okHttpFactory);
}
