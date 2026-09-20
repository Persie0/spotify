package com.spotify.playlistmixing.utils;

import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/playlistmixing/utils/TransitionCuratorError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "UpdateCustomTransitionFailed", "RevertToAutoFailed", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError$RevertToAutoFailed;", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError$UpdateCustomTransitionFailed;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class TransitionCuratorError extends Exception {

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/playlistmixing/utils/TransitionCuratorError$RevertToAutoFailed;", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class RevertToAutoFailed extends TransitionCuratorError {

        /* JADX INFO: renamed from: a */
        public final String f6473a;

        public RevertToAutoFailed(String str) {
            super(str);
            this.f6473a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevertToAutoFailed) && wj50.m88271j(this.f6473a, ((RevertToAutoFailed) obj).f6473a);
        }

        public final int hashCode() {
            String str = this.f6473a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public RevertToAutoFailed() {
            this(null);
        }
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/playlistmixing/utils/TransitionCuratorError$UpdateCustomTransitionFailed;", "Lcom/spotify/playlistmixing/utils/TransitionCuratorError;", "src_main_java_com_spotify_playlistmixing_utils-utils"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class UpdateCustomTransitionFailed extends TransitionCuratorError {

        /* JADX INFO: renamed from: a */
        public final String f6474a;

        public UpdateCustomTransitionFailed(String str) {
            super(str);
            this.f6474a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCustomTransitionFailed) && wj50.m88271j(this.f6474a, ((UpdateCustomTransitionFailed) obj).f6474a);
        }

        public final int hashCode() {
            String str = this.f6474a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public UpdateCustomTransitionFailed() {
            this(null);
        }
    }
}
