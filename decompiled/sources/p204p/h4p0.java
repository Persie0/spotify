package p204p;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h4p0 {

    /* JADX INFO: renamed from: A */
    public long f87579A;

    /* JADX INFO: renamed from: B */
    public long f87580B;

    /* JADX INFO: renamed from: C */
    public long f87581C;

    /* JADX INFO: renamed from: D */
    public long f87582D;

    /* JADX INFO: renamed from: E */
    public int f87583E;

    /* JADX INFO: renamed from: F */
    public int f87584F;

    /* JADX INFO: renamed from: G */
    public int f87585G;

    /* JADX INFO: renamed from: H */
    public long f87586H;

    /* JADX INFO: renamed from: I */
    public boolean f87587I;

    /* JADX INFO: renamed from: J */
    public boolean f87588J;

    /* JADX INFO: renamed from: K */
    public boolean f87589K;

    /* JADX INFO: renamed from: L */
    public boolean f87590L;

    /* JADX INFO: renamed from: M */
    public boolean f87591M;

    /* JADX INFO: renamed from: N */
    public long f87592N;

    /* JADX INFO: renamed from: O */
    public r300 f87593O;

    /* JADX INFO: renamed from: P */
    public r300 f87594P;

    /* JADX INFO: renamed from: Q */
    public long f87595Q;

    /* JADX INFO: renamed from: R */
    public long f87596R;

    /* JADX INFO: renamed from: S */
    public float f87597S;

    /* JADX INFO: renamed from: a */
    public final long[] f87598a = new long[16];

    /* JADX INFO: renamed from: b */
    public final List f87599b;

    /* JADX INFO: renamed from: c */
    public final List f87600c;

    /* JADX INFO: renamed from: d */
    public final List f87601d;

    /* JADX INFO: renamed from: e */
    public final List f87602e;

    /* JADX INFO: renamed from: f */
    public final List f87603f;

    /* JADX INFO: renamed from: g */
    public final List f87604g;

    /* JADX INFO: renamed from: h */
    public final boolean f87605h;

    /* JADX INFO: renamed from: i */
    public long f87606i;

    /* JADX INFO: renamed from: j */
    public boolean f87607j;

    /* JADX INFO: renamed from: k */
    public boolean f87608k;

    /* JADX INFO: renamed from: l */
    public boolean f87609l;

    /* JADX INFO: renamed from: m */
    public int f87610m;

    /* JADX INFO: renamed from: n */
    public int f87611n;

    /* JADX INFO: renamed from: o */
    public int f87612o;

    /* JADX INFO: renamed from: p */
    public int f87613p;

    /* JADX INFO: renamed from: q */
    public long f87614q;

    /* JADX INFO: renamed from: r */
    public int f87615r;

    /* JADX INFO: renamed from: s */
    public long f87616s;

    /* JADX INFO: renamed from: t */
    public long f87617t;

    /* JADX INFO: renamed from: u */
    public long f87618u;

    /* JADX INFO: renamed from: v */
    public long f87619v;

    /* JADX INFO: renamed from: w */
    public long f87620w;

    /* JADX INFO: renamed from: x */
    public long f87621x;

    /* JADX INFO: renamed from: y */
    public long f87622y;

    /* JADX INFO: renamed from: z */
    public long f87623z;

    public h4p0(np3 np3Var) {
        List list = Collections.EMPTY_LIST;
        this.f87599b = list;
        this.f87600c = list;
        this.f87601d = list;
        this.f87602e = list;
        this.f87603f = list;
        this.f87604g = list;
        boolean z = false;
        this.f87585G = 0;
        this.f87586H = np3Var.f156858a;
        this.f87606i = -9223372036854775807L;
        this.f87614q = -9223372036854775807L;
        vsd0 vsd0Var = np3Var.f156861d;
        if (vsd0Var != null && vsd0Var.m86309c()) {
            z = true;
        }
        this.f87605h = z;
        this.f87617t = -1L;
        this.f87616s = -1L;
        this.f87615r = -1;
        this.f87597S = 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m46662b(int i) {
        return i == 6 || i == 7 || i == 10;
    }

    /* JADX INFO: renamed from: a */
    public final g4p0 m46663a(boolean z) {
        List arrayList;
        long[] jArrCopyOf = this.f87598a;
        List list = this.f87600c;
        if (z) {
            arrayList = list;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, 16);
            long jMax = Math.max(0L, jElapsedRealtime - this.f87586H);
            int i = this.f87585G;
            jArrCopyOf[i] = jArrCopyOf[i] + jMax;
            m46667f(jElapsedRealtime);
            m46665d(jElapsedRealtime);
            m46664c(jElapsedRealtime);
            arrayList = new ArrayList(list);
        }
        long[] jArr = jArrCopyOf;
        int i2 = (this.f87609l || !this.f87607j) ? 1 : 0;
        long j = i2 != 0 ? -9223372036854775807L : jArr[2];
        int i3 = jArr[1] > 0 ? 1 : 0;
        List list2 = this.f87601d;
        List arrayList2 = z ? list2 : new ArrayList(list2);
        List list3 = this.f87602e;
        List arrayList3 = z ? list3 : new ArrayList(list3);
        List list4 = this.f87599b;
        List arrayList4 = z ? list4 : new ArrayList(list4);
        long j2 = this.f87606i;
        boolean z2 = this.f87588J;
        int i4 = !this.f87607j ? 1 : 0;
        boolean z3 = this.f87608k;
        int i5 = i2 ^ 1;
        int i6 = this.f87610m;
        int i7 = this.f87611n;
        int i8 = this.f87612o;
        int i9 = this.f87613p;
        long j3 = this.f87614q;
        long j4 = this.f87618u;
        long j5 = this.f87619v;
        long j6 = this.f87620w;
        long j7 = this.f87621x;
        long j8 = this.f87622y;
        long j9 = this.f87623z;
        int i10 = this.f87615r;
        int i11 = i10 == -1 ? 0 : 1;
        long j10 = this.f87616s;
        int i12 = j10 == -1 ? 0 : 1;
        long j11 = this.f87617t;
        int i13 = j11 == -1 ? 0 : 1;
        long j12 = this.f87579A;
        long j13 = this.f87580B;
        long j14 = this.f87581C;
        long j15 = this.f87582D;
        int i14 = this.f87583E;
        return new g4p0(1, jArr, arrayList4, arrayList, j2, z2 ? 1 : 0, i4, z3 ? 1 : 0, i3, j, i5, i6, i7, i8, i9, j3, this.f87605h ? 1 : 0, arrayList2, arrayList3, j4, j5, j6, j7, j8, j9, i11, i12, i10, j10, i13, j11, j12, j13, j14, j15, i14 > 0 ? 1 : 0, i14, this.f87584F, this.f87603f, this.f87604g);
    }

    /* JADX INFO: renamed from: c */
    public final void m46664c(long j) {
        r300 r300Var;
        int i;
        if (this.f87585G == 3 && (r300Var = this.f87594P) != null && (i = r300Var.f195382k) != -1) {
            long j2 = (long) ((j - this.f87596R) * this.f87597S);
            this.f87622y += j2;
            this.f87623z = (j2 * ((long) i)) + this.f87623z;
        }
        this.f87596R = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m46665d(long j) {
        r300 r300Var;
        if (this.f87585G == 3 && (r300Var = this.f87593O) != null) {
            long j2 = (long) ((j - this.f87595Q) * this.f87597S);
            int i = r300Var.f195395x;
            if (i != -1) {
                this.f87618u += j2;
                this.f87619v = (((long) i) * j2) + this.f87619v;
            }
            int i2 = r300Var.f195382k;
            if (i2 != -1) {
                this.f87620w += j2;
                this.f87621x = (j2 * ((long) i2)) + this.f87621x;
            }
        }
        this.f87595Q = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m46666e(np3 np3Var, r300 r300Var) {
        int i;
        if (Objects.equals(this.f87594P, r300Var)) {
            return;
        }
        m46664c(np3Var.f156858a);
        if (r300Var != null && this.f87617t == -1 && (i = r300Var.f195382k) != -1) {
            this.f87617t = i;
        }
        this.f87594P = r300Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m46667f(long j) {
        if (m46662b(this.f87585G)) {
            long j2 = j - this.f87592N;
            long j3 = this.f87614q;
            if (j3 == -9223372036854775807L || j2 > j3) {
                this.f87614q = j2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m46668g(np3 np3Var, r300 r300Var) {
        int i;
        int i2;
        if (Objects.equals(this.f87593O, r300Var)) {
            return;
        }
        m46665d(np3Var.f156858a);
        if (r300Var != null) {
            if (this.f87615r == -1 && (i2 = r300Var.f195395x) != -1) {
                this.f87615r = i2;
            }
            if (this.f87616s == -1 && (i = r300Var.f195382k) != -1) {
                this.f87616s = i;
            }
        }
        this.f87593O = r300Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m46669h(int i, np3 np3Var) {
        long j = np3Var.f156858a;
        c95.m31843i(j >= this.f87586H);
        long j2 = j - this.f87586H;
        int i2 = this.f87585G;
        long[] jArr = this.f87598a;
        jArr[i2] = jArr[i2] + j2;
        if (this.f87606i == -9223372036854775807L) {
            this.f87606i = j;
        }
        this.f87609l |= ((i2 != 1 && i2 != 2 && i2 != 14) || i == 1 || i == 2 || i == 14 || i == 3 || i == 4 || i == 9 || i == 11) ? false : true;
        this.f87607j |= i == 3 || i == 4 || i == 9;
        this.f87608k = (i == 11) | this.f87608k;
        if (i2 != 4 && i2 != 7 && (i == 4 || i == 7)) {
            this.f87610m++;
        }
        if (i == 5) {
            this.f87612o++;
        }
        if (!m46662b(i2) && m46662b(i)) {
            this.f87613p++;
            this.f87592N = j;
        }
        if (m46662b(this.f87585G) && this.f87585G != 7 && i == 7) {
            this.f87611n++;
        }
        m46667f(j);
        this.f87585G = i;
        this.f87586H = j;
    }
}
