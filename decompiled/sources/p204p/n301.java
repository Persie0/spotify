package p204p;

import android.media.session.MediaSession;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class n301 {

    /* JADX INFO: renamed from: b */
    public static final String f149895b;

    /* JADX INFO: renamed from: c */
    public static final String f149896c;

    /* JADX INFO: renamed from: a */
    public final o301 f149897a;

    static {
        dgd0.m35920a("media3.session");
        String str = h0b1.f86200a;
        f149895b = Integer.toString(0, 36);
        f149896c = Integer.toString(1, 36);
    }

    public n301(int i, int i2, int i3, String str, jv30 jv30Var, Bundle bundle, MediaSession.Token token, String str2) {
        this.f149897a = new o301(i, i2, i3, str, jv30Var, bundle, token, str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n301) {
            return this.f149897a.equals(((n301) obj).f149897a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f149897a.hashCode();
    }

    public final String toString() {
        return this.f149897a.toString();
    }
}
