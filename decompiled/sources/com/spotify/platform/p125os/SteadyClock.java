package com.spotify.platform.p125os;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/platform/os/SteadyClock;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_platform_os-os"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SteadyClock {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long timeSinceEpochMs = 0;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00058Æ\u0001X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/platform/os/SteadyClock$Companion;", "", "<init>", "()V", "timeSinceEpochMs", "", "getTimeSinceEpochMs$annotations", "src_main_java_com_spotify_platform_os-os"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getTimeSinceEpochMs$annotations() {
        }

        public final long getTimeSinceEpochMs() {
            return SteadyClock.getTimeSinceEpochMs();
        }

        private Companion() {
        }
    }

    public static final native long getTimeSinceEpochMs();
}
