package com.spotify.logging.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/logging/logging/Logging;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_logging_logging-logging"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Logging {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, m24212d2 = {"Lcom/spotify/logging/logging/Logging$Companion;", "", "<init>", "()V", "", "loggingEnabled", "Lp/w2a1;", "initLogging", "(Z)V", "deinitLogging", "src_main_java_com_spotify_logging_logging-logging"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deinitLogging() {
            Logging.deinitLogging();
        }

        public final void initLogging(boolean loggingEnabled) {
            Logging.initLogging(loggingEnabled);
        }

        private Companion() {
        }
    }

    public static final native void deinitLogging();

    public static final native void initLogging(boolean z);
}
