package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class bq81 {

    /* JADX INFO: renamed from: a */
    public final String f29728a;

    /* JADX INFO: renamed from: b */
    public final String f29729b;

    /* JADX INFO: renamed from: c */
    public final qsj f29730c;

    /* JADX INFO: renamed from: d */
    public final boolean f29731d;

    /* JADX INFO: renamed from: e */
    public final zp81 f29732e;

    /* JADX INFO: renamed from: f */
    public final boolean f29733f;

    /* JADX INFO: renamed from: g */
    public final boolean f29734g;

    /* JADX INFO: renamed from: h */
    public final List f29735h;

    /* JADX INFO: renamed from: i */
    public final boolean f29736i;

    /* JADX INFO: renamed from: j */
    public final boolean f29737j;

    /* JADX INFO: renamed from: k */
    public final boolean f29738k;

    /* JADX INFO: renamed from: l */
    public final r86 f29739l;

    /* JADX INFO: renamed from: m */
    public final boolean f29740m;

    /* JADX INFO: renamed from: n */
    public final boolean f29741n;

    /* JADX INFO: renamed from: o */
    public final boolean f29742o;

    /* JADX INFO: renamed from: p */
    public final boolean f29743p;

    /* JADX INFO: renamed from: q */
    public final boolean f29744q;

    public bq81(String str, String str2, qsj qsjVar, boolean z, zp81 zp81Var, boolean z2, boolean z3, List list, boolean z4, boolean z5, boolean z6, r86 r86Var, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f29728a = str;
        this.f29729b = str2;
        this.f29730c = qsjVar;
        this.f29731d = z;
        this.f29732e = zp81Var;
        this.f29733f = z2;
        this.f29734g = z3;
        this.f29735h = list;
        this.f29736i = z4;
        this.f29737j = z5;
        this.f29738k = z6;
        this.f29739l = r86Var;
        this.f29740m = z7;
        this.f29741n = z8;
        this.f29742o = z9;
        this.f29743p = z10;
        this.f29744q = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq81)) {
            return false;
        }
        bq81 bq81Var = (bq81) obj;
        return wj50.m88271j(this.f29728a, bq81Var.f29728a) && wj50.m88271j(this.f29729b, bq81Var.f29729b) && this.f29730c == bq81Var.f29730c && this.f29731d == bq81Var.f29731d && this.f29732e == bq81Var.f29732e && this.f29733f == bq81Var.f29733f && this.f29734g == bq81Var.f29734g && wj50.m88271j(this.f29735h, bq81Var.f29735h) && this.f29736i == bq81Var.f29736i && this.f29737j == bq81Var.f29737j && this.f29738k == bq81Var.f29738k && wj50.m88271j(this.f29739l, bq81Var.f29739l) && this.f29740m == bq81Var.f29740m && this.f29741n == bq81Var.f29741n && this.f29742o == bq81Var.f29742o && this.f29743p == bq81Var.f29743p && this.f29744q == bq81Var.f29744q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29744q) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f29739l.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c(s571.m77245d(s571.m77245d((this.f29732e.hashCode() + s571.m77245d(xl81.m91401j(this.f29730c, s571.m77243b(this.f29728a.hashCode() * 31, 31, this.f29729b), 31), 31, this.f29731d)) * 31, 31, this.f29733f), 31, this.f29734g), 31, this.f29735h), 31, this.f29736i), 31, this.f29737j), 31, this.f29738k)) * 31, 31, this.f29740m), 31, this.f29741n), 31, this.f29742o), 31, this.f29743p);
    }
}
