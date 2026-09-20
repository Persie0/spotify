package com.spotify.playlistmixing.endpoints;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "NotMixedPlaylist", "ReorderFailed", "RevisionConflict", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$NotMixedPlaylist;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$ReorderFailed;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$RevisionConflict;", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class MixingReorderingError extends Exception {

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$NotMixedPlaylist;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class NotMixedPlaylist extends MixingReorderingError {
        static {
            new NotMixedPlaylist();
        }

        private NotMixedPlaylist() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotMixedPlaylist);
        }

        public final int hashCode() {
            return 1768000242;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NotMixedPlaylist";
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$ReorderFailed;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ReorderFailed extends MixingReorderingError {

        /* JADX INFO: renamed from: a */
        public static final ReorderFailed f6467a = new ReorderFailed();

        private ReorderFailed() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReorderFailed);
        }

        public final int hashCode() {
            return -1140432896;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ReorderFailed";
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/playlistmixing/endpoints/MixingReorderingError$RevisionConflict;", "Lcom/spotify/playlistmixing/endpoints/MixingReorderingError;", "<init>", "()V", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class RevisionConflict extends MixingReorderingError {

        /* JADX INFO: renamed from: a */
        public static final RevisionConflict f6468a = new RevisionConflict();

        private RevisionConflict() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RevisionConflict);
        }

        public final int hashCode() {
            return -1650291483;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "RevisionConflict";
        }
    }

    public /* synthetic */ MixingReorderingError(int i) {
        this();
    }

    private MixingReorderingError() {
    }
}
