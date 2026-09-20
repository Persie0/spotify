package p204p;

import androidx.work.OverwritingInputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class i1e1 {

    /* JADX INFO: renamed from: y */
    public static final mjr0 f97498y;

    /* JADX INFO: renamed from: a */
    public final String f97499a;

    /* JADX INFO: renamed from: b */
    public h0e1 f97500b;

    /* JADX INFO: renamed from: c */
    public final String f97501c;

    /* JADX INFO: renamed from: d */
    public final String f97502d;

    /* JADX INFO: renamed from: e */
    public sco f97503e;

    /* JADX INFO: renamed from: f */
    public final sco f97504f;

    /* JADX INFO: renamed from: g */
    public long f97505g;

    /* JADX INFO: renamed from: h */
    public long f97506h;

    /* JADX INFO: renamed from: i */
    public long f97507i;

    /* JADX INFO: renamed from: j */
    public a8j f97508j;

    /* JADX INFO: renamed from: k */
    public final int f97509k;

    /* JADX INFO: renamed from: l */
    public to8 f97510l;

    /* JADX INFO: renamed from: m */
    public long f97511m;

    /* JADX INFO: renamed from: n */
    public long f97512n;

    /* JADX INFO: renamed from: o */
    public final long f97513o;

    /* JADX INFO: renamed from: p */
    public final long f97514p;

    /* JADX INFO: renamed from: q */
    public boolean f97515q;

    /* JADX INFO: renamed from: r */
    public int f97516r;

    /* JADX INFO: renamed from: s */
    public final int f97517s;

    /* JADX INFO: renamed from: t */
    public final int f97518t;

    /* JADX INFO: renamed from: u */
    public long f97519u;

    /* JADX INFO: renamed from: v */
    public int f97520v;

    /* JADX INFO: renamed from: w */
    public final int f97521w;

    /* JADX INFO: renamed from: x */
    public String f97522x;

    static {
        gaz.m44194g("WorkSpec");
        f97498y = new mjr0(10);
    }

    public i1e1(String str, h0e1 h0e1Var, String str2, String str3, sco scoVar, sco scoVar2, long j, long j2, long j3, a8j a8jVar, int i, to8 to8Var, long j4, long j5, long j6, long j7, boolean z, int i2, int i3, int i4, long j8, int i5, int i6, String str4) {
        this.f97499a = str;
        this.f97500b = h0e1Var;
        this.f97501c = str2;
        this.f97502d = str3;
        this.f97503e = scoVar;
        this.f97504f = scoVar2;
        this.f97505g = j;
        this.f97506h = j2;
        this.f97507i = j3;
        this.f97508j = a8jVar;
        this.f97509k = i;
        this.f97510l = to8Var;
        this.f97511m = j4;
        this.f97512n = j5;
        this.f97513o = j6;
        this.f97514p = j7;
        this.f97515q = z;
        this.f97516r = i2;
        this.f97517s = i3;
        this.f97518t = i4;
        this.f97519u = j8;
        this.f97520v = i5;
        this.f97521w = i6;
        this.f97522x = str4;
    }

    /* JADX INFO: renamed from: b */
    public static i1e1 m49410b(i1e1 i1e1Var, String str, h0e1 h0e1Var, String str2, sco scoVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? i1e1Var.f97499a : str;
        h0e1 h0e1Var2 = (i5 & 2) != 0 ? i1e1Var.f97500b : h0e1Var;
        String str4 = (i5 & 4) != 0 ? i1e1Var.f97501c : str2;
        String str5 = i1e1Var.f97502d;
        sco scoVar2 = (i5 & 16) != 0 ? i1e1Var.f97503e : scoVar;
        sco scoVar3 = i1e1Var.f97504f;
        long j3 = i1e1Var.f97505g;
        long j4 = i1e1Var.f97506h;
        long j5 = i1e1Var.f97507i;
        a8j a8jVar = i1e1Var.f97508j;
        int i6 = (i5 & 1024) != 0 ? i1e1Var.f97509k : i;
        to8 to8Var = i1e1Var.f97510l;
        long j6 = i1e1Var.f97511m;
        long j7 = (i5 & 8192) != 0 ? i1e1Var.f97512n : j;
        long j8 = i1e1Var.f97513o;
        long j9 = i1e1Var.f97514p;
        boolean z = i1e1Var.f97515q;
        int i7 = i1e1Var.f97516r;
        int i8 = (i5 & 262144) != 0 ? i1e1Var.f97517s : i2;
        int i9 = (i5 & 524288) != 0 ? i1e1Var.f97518t : i3;
        long j10 = (i5 & 1048576) != 0 ? i1e1Var.f97519u : j2;
        int i10 = (i5 & 2097152) != 0 ? i1e1Var.f97520v : i4;
        int i11 = i1e1Var.f97521w;
        String str6 = i1e1Var.f97522x;
        i1e1Var.getClass();
        return new i1e1(str3, h0e1Var2, str4, str5, scoVar2, scoVar3, j3, j4, j5, a8jVar, i6, to8Var, j6, j7, j8, j9, z, i7, i8, i9, j10, i10, i11, str6);
    }

    /* JADX INFO: renamed from: a */
    public final long m49411a() {
        return g0b1.m43266h(this.f97500b == h0e1.f86263a && this.f97509k > 0, this.f97509k, this.f97510l, this.f97511m, this.f97512n, this.f97517s, m49413d(), this.f97505g, this.f97507i, this.f97506h, this.f97519u);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m49412c() {
        return !wj50.m88271j(a8j.f13302j, this.f97508j);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m49413d() {
        return this.f97506h != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m49414e(long j, long j2) {
        if (j < 900000) {
            gaz.m44190b().getClass();
        }
        if (j < 900000) {
            j = 900000;
        }
        this.f97506h = j;
        if (j2 < 300000) {
            gaz.m44190b().getClass();
        }
        if (j2 > this.f97506h) {
            gaz.m44190b().getClass();
        }
        this.f97507i = n0e1.m63439p(j2, 300000L, this.f97506h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1e1)) {
            return false;
        }
        i1e1 i1e1Var = (i1e1) obj;
        return wj50.m88271j(this.f97499a, i1e1Var.f97499a) && this.f97500b == i1e1Var.f97500b && wj50.m88271j(this.f97501c, i1e1Var.f97501c) && wj50.m88271j(this.f97502d, i1e1Var.f97502d) && wj50.m88271j(this.f97503e, i1e1Var.f97503e) && wj50.m88271j(this.f97504f, i1e1Var.f97504f) && this.f97505g == i1e1Var.f97505g && this.f97506h == i1e1Var.f97506h && this.f97507i == i1e1Var.f97507i && wj50.m88271j(this.f97508j, i1e1Var.f97508j) && this.f97509k == i1e1Var.f97509k && this.f97510l == i1e1Var.f97510l && this.f97511m == i1e1Var.f97511m && this.f97512n == i1e1Var.f97512n && this.f97513o == i1e1Var.f97513o && this.f97514p == i1e1Var.f97514p && this.f97515q == i1e1Var.f97515q && this.f97516r == i1e1Var.f97516r && this.f97517s == i1e1Var.f97517s && this.f97518t == i1e1Var.f97518t && this.f97519u == i1e1Var.f97519u && this.f97520v == i1e1Var.f97520v && this.f97521w == i1e1Var.f97521w && wj50.m88271j(this.f97522x, i1e1Var.f97522x);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f97521w, mt60.m62800g(this.f97520v, dq60.m36605e(mt60.m62800g(this.f97518t, mt60.m62800g(this.f97517s, f710.m40938f(this.f97516r, s571.m77245d(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e((this.f97510l.hashCode() + mt60.m62800g(this.f97509k, (this.f97508j.hashCode() + dq60.m36605e(dq60.m36605e(dq60.m36605e((this.f97504f.hashCode() + ((this.f97503e.hashCode() + s571.m77243b(s571.m77243b((this.f97500b.hashCode() + (this.f97499a.hashCode() * 31)) * 31, 31, this.f97501c), 31, this.f97502d)) * 31)) * 31, this.f97505g, 31), this.f97506h, 31), this.f97507i, 31)) * 31, 31)) * 31, this.f97511m, 31), this.f97512n, 31), this.f97513o, 31), this.f97514p, 31), 31, this.f97515q), 31), 31), 31), this.f97519u, 31), 31), 31);
        String str = this.f97522x;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("{WorkSpec: "), this.f97499a, '}');
    }

    public /* synthetic */ i1e1(String str, h0e1 h0e1Var, String str2, String str3, sco scoVar, sco scoVar2, long j, long j2, long j3, a8j a8jVar, int i, to8 to8Var, long j4, long j5, long j6, long j7, boolean z, int i2, int i3, long j8, int i4, int i5, String str4, int i6) {
        this(str, (i6 & 2) != 0 ? h0e1.f86263a : h0e1Var, str2, (i6 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i6 & 16) != 0 ? sco.f207772b : scoVar, (i6 & 32) != 0 ? sco.f207772b : scoVar2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? a8j.f13302j : a8jVar, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? to8.f222196a : to8Var, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) == 0 ? j6 : 0L, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? 1 : i2, (262144 & i6) != 0 ? 0 : i3, 0, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (i6 & 8388608) != 0 ? null : str4);
    }
}
