package p204p;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o301 {

    /* JADX INFO: renamed from: j */
    public static final String f161191j;

    /* JADX INFO: renamed from: k */
    public static final String f161192k;

    /* JADX INFO: renamed from: l */
    public static final String f161193l;

    /* JADX INFO: renamed from: m */
    public static final String f161194m;

    /* JADX INFO: renamed from: n */
    public static final String f161195n;

    /* JADX INFO: renamed from: o */
    public static final String f161196o;

    /* JADX INFO: renamed from: p */
    public static final String f161197p;

    /* JADX INFO: renamed from: q */
    public static final String f161198q;

    /* JADX INFO: renamed from: r */
    public static final String f161199r;

    /* JADX INFO: renamed from: s */
    public static final String f161200s;

    /* JADX INFO: renamed from: t */
    public static final String f161201t;

    /* JADX INFO: renamed from: a */
    public final int f161202a;

    /* JADX INFO: renamed from: b */
    public final int f161203b;

    /* JADX INFO: renamed from: c */
    public final int f161204c;

    /* JADX INFO: renamed from: d */
    public final String f161205d;

    /* JADX INFO: renamed from: e */
    public final String f161206e;

    /* JADX INFO: renamed from: f */
    public final String f161207f;

    /* JADX INFO: renamed from: g */
    public final IBinder f161208g;

    /* JADX INFO: renamed from: h */
    public final Bundle f161209h;

    /* JADX INFO: renamed from: i */
    public final MediaSession.Token f161210i;

    static {
        String str = h0b1.f86200a;
        f161191j = Integer.toString(0, 36);
        f161192k = Integer.toString(1, 36);
        f161193l = Integer.toString(2, 36);
        f161194m = Integer.toString(3, 36);
        f161195n = Integer.toString(4, 36);
        f161196o = Integer.toString(5, 36);
        f161197p = Integer.toString(6, 36);
        f161198q = Integer.toString(7, 36);
        f161199r = Integer.toString(8, 36);
        f161200s = Integer.toString(9, 36);
        f161201t = Integer.toString(10, 36);
    }

    public o301(int i, int i2, int i3, String str, jv30 jv30Var, Bundle bundle, MediaSession.Token token, String str2) {
        str.getClass();
        IBinder iBinderAsBinder = jv30Var.asBinder();
        bundle.getClass();
        this.f161202a = i;
        this.f161203b = i2;
        this.f161204c = i3;
        this.f161205d = str;
        this.f161207f = "";
        this.f161208g = iBinderAsBinder;
        this.f161209h = bundle;
        this.f161210i = token;
        this.f161206e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o301)) {
            return false;
        }
        o301 o301Var = (o301) obj;
        return this.f161202a == o301Var.f161202a && this.f161203b == o301Var.f161203b && this.f161204c == o301Var.f161204c && TextUtils.equals(this.f161205d, o301Var.f161205d) && TextUtils.equals(this.f161207f, o301Var.f161207f) && Objects.equals(this.f161208g, o301Var.f161208g) && Objects.equals(this.f161210i, o301Var.f161210i) && Objects.equals(this.f161206e, o301Var.f161206e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f161202a), 0, Integer.valueOf(this.f161203b), Integer.valueOf(this.f161204c), this.f161205d, this.f161207f, null, this.f161208g, this.f161210i, this.f161206e);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f161205d + " type=0 libraryVersion=" + this.f161203b + " interfaceVersion=" + this.f161204c + " service=" + this.f161207f + " IMediaSession=" + this.f161208g + " extras=" + this.f161209h + "}";
    }
}
