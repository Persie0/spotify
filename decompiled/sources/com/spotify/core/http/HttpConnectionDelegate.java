package com.spotify.core.http;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/core/http/HttpConnectionDelegate;", "", "Lcom/spotify/core/http/HttpConnection;", "httpConnection", "Lcom/spotify/core/http/HttpRequest;", "httpRequest", "Lcom/spotify/core/http/HttpOptions;", "httpOptions", "Lp/w2a1;", "send", "(Lcom/spotify/core/http/HttpConnection;Lcom/spotify/core/http/HttpRequest;Lcom/spotify/core/http/HttpOptions;)V", "abort", "()V", "", "isRequestStarted", "()Z", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface HttpConnectionDelegate {
    void abort();

    boolean isRequestStarted();

    void send(HttpConnection httpConnection, HttpRequest httpRequest, HttpOptions httpOptions);
}
