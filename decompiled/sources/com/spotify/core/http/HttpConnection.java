package com.spotify.core.http;

import kotlin.Metadata;
import spotify.connectivity.http.proto.ConnectionMetrics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 #2\u00020\u0001:\u0001#J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H&¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\u0018H&¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/core/http/HttpConnection;", "", "Lcom/spotify/core/http/HttpRequest;", "request", "Lcom/spotify/core/http/HttpOptions;", "options", "Lp/w2a1;", "send", "(Lcom/spotify/core/http/HttpRequest;Lcom/spotify/core/http/HttpOptions;)V", "Lcom/spotify/core/http/HttpResponse;", "response", "onHeaders", "(Lcom/spotify/core/http/HttpResponse;)V", "onRedirect", "()V", "", "error", "onError", "(I)V", "", "buffer", "length", "onBytesAvailable", "([BI)V", "", "expectMetrics", "onComplete", "(Z)V", "Lspotify/connectivity/http/proto/ConnectionMetrics;", "metrics", "onMetrics", "(Lspotify/connectivity/http/proto/ConnectionMetrics;)V", "abort", "isRequestStarted", "()Z", "Companion", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface HttpConnection {
    public static final int kErrorSuccess = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int kErrorClassHttp = 300;
    public static final int kErrorHttpConnectTimeout = 300 + 1;
    public static final int kErrorHttpConnectFail = 300 + 2;
    public static final int kErrorHttpInvalidUrl = 300 + 3;
    public static final int kErrorHttpBadReply = 300 + 4;
    public static final int kErrorHttpBadRange = 300 + 5;
    public static final int kErrorHttpTooManyRedirects = 300 + 6;
    public static final int kErrorHttpBadTransferEncoding = 300 + 7;
    public static final int kErrorHttpTimeout = 300 + 8;
    public static final int kErrorHttpFail = 300 + 9;
    public static final int kErrorHttpGzipDecode = 300 + 10;
    public static final int kErrorHttpAborted = 300 + 11;
    public static final String kDefaultContentType = "text/plain";

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0012\u001a\u00020\u00138\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/core/http/HttpConnection$Companion;", "", "<init>", "()V", "kErrorSuccess", "", "kErrorClassHttp", "kErrorHttpConnectTimeout", "kErrorHttpConnectFail", "kErrorHttpInvalidUrl", "kErrorHttpBadReply", "kErrorHttpBadRange", "kErrorHttpTooManyRedirects", "kErrorHttpBadTransferEncoding", "kErrorHttpTimeout", "kErrorHttpFail", "kErrorHttpGzipDecode", "kErrorHttpAborted", "kDefaultContentType", "", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ void onComplete$default(HttpConnection httpConnection, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        httpConnection.onComplete(z);
    }

    void abort();

    boolean isRequestStarted();

    void onBytesAvailable(byte[] buffer, int length);

    void onComplete(boolean expectMetrics);

    void onError(int error);

    void onHeaders(HttpResponse response);

    void onMetrics(ConnectionMetrics metrics);

    void onRedirect();

    void send(HttpRequest request, HttpOptions options);
}
