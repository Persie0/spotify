package com.spotify.playlistmixing.endpoints;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "GetAutoTransitionUriFailed", "Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError$GetAutoTransitionUriFailed;", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class GetAutoTransitionUriError extends Exception {

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError$GetAutoTransitionUriFailed;", "Lcom/spotify/playlistmixing/endpoints/GetAutoTransitionUriError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class GetAutoTransitionUriFailed extends GetAutoTransitionUriError {

        /* JADX INFO: renamed from: a */
        public static final GetAutoTransitionUriFailed f6465a = new GetAutoTransitionUriFailed();

        /* JADX INFO: renamed from: b */
        public static final String f6466b = "Failed to get auto transition URI";

        private GetAutoTransitionUriFailed() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetAutoTransitionUriFailed);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return f6466b;
        }

        public final int hashCode() {
            return -1830098900;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GetAutoTransitionUriFailed";
        }
    }

    public /* synthetic */ GetAutoTransitionUriError(int i) {
        this();
    }

    private GetAutoTransitionUriError() {
    }
}
