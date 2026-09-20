package com.spotify.jvm.jni;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/jvm/jni/NativeCrashDiagnostics;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_jvm_jni-jni"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeCrashDiagnostics {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/jvm/jni/NativeCrashDiagnostics$Companion;", "", "<init>", "()V", "Lp/w2a1;", "crash", "src_main_java_com_spotify_jvm_jni-jni"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void crash() {
            NativeCrashDiagnostics.crash();
        }

        private Companion() {
        }
    }

    public static final native void crash();
}
