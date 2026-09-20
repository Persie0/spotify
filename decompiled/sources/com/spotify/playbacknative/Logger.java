package com.spotify.playbacknative;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/playbacknative/Logger;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\nJ3\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/playbacknative/Logger$Companion;", "", "<init>", "()V", "", "s", "", "args", "Lp/w2a1;", "d", "(Ljava/lang/String;[Ljava/lang/Object;)V", "e", "w", "", "t", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public final void m17650d(String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }

        /* JADX INFO: renamed from: e */
        public final void m17651e(String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }

        /* JADX INFO: renamed from: w */
        public final void m17652w(String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: w */
        public final void m17653w(Throwable t, String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m17646d(String str, Object... objArr) {
        INSTANCE.m17650d(str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static final void m17647e(String str, Object... objArr) {
        INSTANCE.m17651e(str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static final void m17648w(String str, Object... objArr) {
        INSTANCE.m17652w(str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static final void m17649w(Throwable th, String str, Object... objArr) {
        INSTANCE.m17653w(th, str, objArr);
    }
}
