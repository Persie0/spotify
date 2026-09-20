package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class t17 {

    /* JADX INFO: renamed from: a */
    public final Uri f216161a;

    /* JADX INFO: renamed from: b */
    public final long f216162b;

    /* JADX INFO: renamed from: c */
    public final boolean f216163c;

    /* JADX INFO: renamed from: d */
    public final boolean f216164d;

    /* JADX INFO: renamed from: e */
    public final boolean f216165e;

    /* JADX INFO: renamed from: f */
    public final long f216166f;

    /* JADX INFO: renamed from: g */
    public final long f216167g;

    /* JADX INFO: renamed from: h */
    public final long f216168h;

    public /* synthetic */ t17() {
        this(null, 0L, false, false, false, 0L, 0L, 0L);
    }

    /* JADX INFO: renamed from: a */
    public static t17 m79865a(t17 t17Var, Uri uri, long j, boolean z, boolean z2, boolean z3, long j2, long j3, long j4, int i) {
        if ((i & 1) != 0) {
            uri = t17Var.f216161a;
        }
        Uri uri2 = uri;
        long j5 = (i & 2) != 0 ? t17Var.f216162b : j;
        boolean z4 = (i & 4) != 0 ? t17Var.f216163c : z;
        boolean z5 = (i & 8) != 0 ? t17Var.f216164d : z2;
        boolean z6 = (i & 16) != 0 ? t17Var.f216165e : z3;
        long j6 = (i & 32) != 0 ? t17Var.f216166f : j2;
        long j7 = (i & 64) != 0 ? t17Var.f216167g : j3;
        long j8 = (i & 128) != 0 ? t17Var.f216168h : j4;
        t17Var.getClass();
        return new t17(uri2, j5, z4, z5, z6, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t17)) {
            return false;
        }
        t17 t17Var = (t17) obj;
        return wj50.m88271j(this.f216161a, t17Var.f216161a) && this.f216162b == t17Var.f216162b && this.f216163c == t17Var.f216163c && this.f216164d == t17Var.f216164d && this.f216165e == t17Var.f216165e && this.f216166f == t17Var.f216166f && this.f216167g == t17Var.f216167g && this.f216168h == t17Var.f216168h;
    }

    public final int hashCode() {
        Uri uri = this.f216161a;
        return Long.hashCode(this.f216168h) + dq60.m36605e(dq60.m36605e(s571.m77245d(s571.m77245d(s571.m77245d(dq60.m36605e((uri == null ? 0 : uri.hashCode()) * 31, this.f216162b, 31), 31, this.f216163c), 31, this.f216164d), 31, this.f216165e), this.f216166f, 31), this.f216167g, 31);
    }

    public t17(Uri uri, long j, boolean z, boolean z2, boolean z3, long j2, long j3, long j4) {
        this.f216161a = uri;
        this.f216162b = j;
        this.f216163c = z;
        this.f216164d = z2;
        this.f216165e = z3;
        this.f216166f = j2;
        this.f216167g = j3;
        this.f216168h = j4;
    }
}
