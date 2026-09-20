package p204p;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mp71 {

    /* JADX INFO: renamed from: A */
    public static final String f145910A;

    /* JADX INFO: renamed from: B */
    public static final String f145911B;

    /* JADX INFO: renamed from: C */
    public static final String f145912C;

    /* JADX INFO: renamed from: D */
    public static final String f145913D;

    /* JADX INFO: renamed from: E */
    public static final String f145914E;

    /* JADX INFO: renamed from: F */
    public static final String f145915F;

    /* JADX INFO: renamed from: q */
    public static final Object f145916q = new Object();

    /* JADX INFO: renamed from: r */
    public static final ufd0 f145917r;

    /* JADX INFO: renamed from: s */
    public static final String f145918s;

    /* JADX INFO: renamed from: t */
    public static final String f145919t;

    /* JADX INFO: renamed from: u */
    public static final String f145920u;

    /* JADX INFO: renamed from: v */
    public static final String f145921v;

    /* JADX INFO: renamed from: w */
    public static final String f145922w;

    /* JADX INFO: renamed from: x */
    public static final String f145923x;

    /* JADX INFO: renamed from: y */
    public static final String f145924y;

    /* JADX INFO: renamed from: z */
    public static final String f145925z;

    /* JADX INFO: renamed from: b */
    public Object f145927b;

    /* JADX INFO: renamed from: d */
    public Object f145929d;

    /* JADX INFO: renamed from: e */
    public long f145930e;

    /* JADX INFO: renamed from: f */
    public long f145931f;

    /* JADX INFO: renamed from: g */
    public long f145932g;

    /* JADX INFO: renamed from: h */
    public boolean f145933h;

    /* JADX INFO: renamed from: i */
    public boolean f145934i;

    /* JADX INFO: renamed from: j */
    public nfd0 f145935j;

    /* JADX INFO: renamed from: k */
    public boolean f145936k;

    /* JADX INFO: renamed from: l */
    public long f145937l;

    /* JADX INFO: renamed from: m */
    public long f145938m;

    /* JADX INFO: renamed from: n */
    public int f145939n;

    /* JADX INFO: renamed from: o */
    public int f145940o;

    /* JADX INFO: renamed from: p */
    public long f145941p;

    /* JADX INFO: renamed from: a */
    public Object f145926a = f145916q;

    /* JADX INFO: renamed from: c */
    public ufd0 f145928c = f145917r;

    static {
        ofd0 ofd0Var;
        gfd0 gfd0Var = new gfd0();
        kfd0 kfd0Var = new kfd0();
        List list = Collections.EMPTY_LIST;
        wsv0 wsv0Var = wsv0.f254763e;
        mfd0 mfd0Var = new mfd0();
        pfd0 pfd0Var = pfd0.f177032d;
        Uri uri = Uri.EMPTY;
        c95.m31855u(kfd0Var.f122135b == null || kfd0Var.f122134a != null);
        lfd0 lfd0Var = null;
        if (uri != null) {
            if (kfd0Var.f122134a != null) {
                lfd0Var = new lfd0(kfd0Var);
            }
            ofd0Var = new ofd0(uri, null, lfd0Var, null, list, null, wsv0Var, -9223372036854775807L);
        } else {
            ofd0Var = null;
        }
        f145917r = new ufd0("androidx.media3.common.Timeline", new ifd0(gfd0Var), ofd0Var, new nfd0(mfd0Var), phd0.f177558M, pfd0Var);
        f145918s = Integer.toString(1, 36);
        f145919t = Integer.toString(2, 36);
        f145920u = Integer.toString(3, 36);
        f145921v = Integer.toString(4, 36);
        f145922w = Integer.toString(5, 36);
        f145923x = Integer.toString(6, 36);
        f145924y = Integer.toString(7, 36);
        f145925z = Integer.toString(8, 36);
        f145910A = Integer.toString(9, 36);
        f145911B = Integer.toString(10, 36);
        f145912C = Integer.toString(11, 36);
        f145913D = Integer.toString(12, 36);
        f145914E = Integer.toString(13, 36);
        f145915F = Integer.toString(14, 36);
    }

    /* JADX INFO: renamed from: a */
    public final long m62444a() {
        long j = this.f145932g;
        return j == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    /* JADX INFO: renamed from: b */
    public final long m62445b() {
        return h0b1.m46326n0(this.f145938m);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m62446c() {
        return this.f145935j != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m62447d(Object obj, ufd0 ufd0Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, nfd0 nfd0Var, long j4, long j5, int i, int i2, long j6) {
        this.f145926a = obj;
        this.f145928c = ufd0Var != null ? ufd0Var : f145917r;
        if (ufd0Var != null) {
            ofd0 ofd0Var = ufd0Var.f229763b;
        }
        this.f145927b = null;
        this.f145929d = obj2;
        this.f145930e = j;
        this.f145931f = j2;
        this.f145932g = j3;
        this.f145933h = z;
        this.f145934i = z2;
        this.f145935j = nfd0Var;
        this.f145937l = j4;
        this.f145938m = j5;
        this.f145939n = i;
        this.f145940o = i2;
        this.f145941p = j6;
        this.f145936k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mp71.class.equals(obj.getClass())) {
            mp71 mp71Var = (mp71) obj;
            if (Objects.equals(this.f145926a, mp71Var.f145926a) && Objects.equals(this.f145928c, mp71Var.f145928c) && Objects.equals(this.f145929d, mp71Var.f145929d) && Objects.equals(this.f145935j, mp71Var.f145935j) && this.f145930e == mp71Var.f145930e && this.f145931f == mp71Var.f145931f && this.f145932g == mp71Var.f145932g && this.f145933h == mp71Var.f145933h && this.f145934i == mp71Var.f145934i && this.f145936k == mp71Var.f145936k && this.f145937l == mp71Var.f145937l && this.f145938m == mp71Var.f145938m && this.f145939n == mp71Var.f145939n && this.f145940o == mp71Var.f145940o && this.f145941p == mp71Var.f145941p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f145928c.hashCode() + dq60.m36604d(217, 31, this.f145926a)) * 31;
        Object obj = this.f145929d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        nfd0 nfd0Var = this.f145935j;
        int iHashCode3 = (iHashCode2 + (nfd0Var != null ? nfd0Var.hashCode() : 0)) * 31;
        long j = this.f145930e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f145931f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f145932g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f145933h ? 1 : 0)) * 31) + (this.f145934i ? 1 : 0)) * 31) + (this.f145936k ? 1 : 0)) * 31;
        long j4 = this.f145937l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f145938m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f145939n) * 31) + this.f145940o) * 31;
        long j6 = this.f145941p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
