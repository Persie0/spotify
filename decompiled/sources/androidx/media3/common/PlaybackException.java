package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;
import p204p.h0b1;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: d */
    public static final String f959d;

    /* JADX INFO: renamed from: e */
    public static final String f960e;

    /* JADX INFO: renamed from: f */
    public static final String f961f;

    /* JADX INFO: renamed from: g */
    public static final String f962g;

    /* JADX INFO: renamed from: h */
    public static final String f963h;

    /* JADX INFO: renamed from: i */
    public static final String f964i;

    /* JADX INFO: renamed from: a */
    public final int f965a;

    /* JADX INFO: renamed from: b */
    public final long f966b;

    /* JADX INFO: renamed from: c */
    public final Bundle f967c;

    static {
        String str = h0b1.f86200a;
        f959d = Integer.toString(0, 36);
        f960e = Integer.toString(1, 36);
        f961f = Integer.toString(2, 36);
        f962g = Integer.toString(3, 36);
        f963h = Integer.toString(4, 36);
        f964i = Integer.toString(5, 36);
    }

    public PlaybackException(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.f965a = i;
        this.f967c = bundle;
        this.f966b = j;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo756a(PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.f965a == playbackException.f965a && Objects.equals(getMessage(), playbackException.getMessage()) && this.f966b == playbackException.f966b) {
                return true;
            }
        }
        return false;
    }
}
