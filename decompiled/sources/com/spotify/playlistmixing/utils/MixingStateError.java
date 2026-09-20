package com.spotify.playlistmixing.utils;

import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/playlistmixing/utils/MixingStateError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SignalFailed", "LensOperationFailed", "Lcom/spotify/playlistmixing/utils/MixingStateError$LensOperationFailed;", "Lcom/spotify/playlistmixing/utils/MixingStateError$SignalFailed;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class MixingStateError extends Exception {

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/playlistmixing/utils/MixingStateError$LensOperationFailed;", "Lcom/spotify/playlistmixing/utils/MixingStateError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class LensOperationFailed extends MixingStateError {

        /* JADX INFO: renamed from: a */
        public final String f6471a;

        public LensOperationFailed(String str) {
            super(str);
            this.f6471a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LensOperationFailed) && wj50.m88271j(this.f6471a, ((LensOperationFailed) obj).f6471a);
        }

        public final int hashCode() {
            String str = this.f6471a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public LensOperationFailed() {
            this(null);
        }
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/playlistmixing/utils/MixingStateError$SignalFailed;", "Lcom/spotify/playlistmixing/utils/MixingStateError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class SignalFailed extends MixingStateError {

        /* JADX INFO: renamed from: a */
        public final String f6472a;

        public SignalFailed(String str) {
            super(str);
            this.f6472a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignalFailed) && wj50.m88271j(this.f6472a, ((SignalFailed) obj).f6472a);
        }

        public final int hashCode() {
            String str = this.f6472a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public SignalFailed() {
            this(null);
        }
    }
}
