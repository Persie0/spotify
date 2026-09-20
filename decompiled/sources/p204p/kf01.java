package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kf01 {

    /* JADX INFO: renamed from: a */
    public final sxd f122008a;

    /* JADX INFO: renamed from: b */
    public final String f122009b;

    /* JADX INFO: renamed from: c */
    public final akk f122010c;

    /* JADX INFO: renamed from: d */
    public final List f122011d;

    /* JADX INFO: renamed from: e */
    public final boolean f122012e;

    /* JADX INFO: renamed from: f */
    public final boolean f122013f;

    /* JADX INFO: renamed from: g */
    public final boolean f122014g;

    /* JADX INFO: renamed from: h */
    public final boolean f122015h;

    /* JADX INFO: renamed from: i */
    public final boolean f122016i;

    /* JADX INFO: renamed from: j */
    public final boolean f122017j;

    /* JADX INFO: renamed from: k */
    public final boolean f122018k;

    /* JADX INFO: renamed from: l */
    public final boolean f122019l;

    /* JADX INFO: renamed from: m */
    public final boolean f122020m;

    /* JADX INFO: renamed from: n */
    public final boolean f122021n;

    /* JADX INFO: renamed from: o */
    public final boolean f122022o;

    /* JADX INFO: renamed from: p */
    public final boolean f122023p;

    /* JADX INFO: renamed from: q */
    public final boolean f122024q;

    public kf01(sxd sxdVar, String str, akk akkVar, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f122008a = sxdVar;
        this.f122009b = str;
        this.f122010c = akkVar;
        this.f122011d = list;
        this.f122012e = z;
        this.f122013f = z2;
        this.f122014g = z3;
        this.f122015h = z4;
        this.f122016i = z5;
        this.f122017j = z6;
        this.f122018k = z7;
        this.f122019l = z8;
        this.f122020m = z9;
        this.f122021n = z10;
        this.f122022o = z11;
        this.f122023p = z12;
        this.f122024q = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf01)) {
            return false;
        }
        kf01 kf01Var = (kf01) obj;
        return wj50.m88271j(this.f122008a, kf01Var.f122008a) && wj50.m88271j(this.f122009b, kf01Var.f122009b) && wj50.m88271j(this.f122010c, kf01Var.f122010c) && wj50.m88271j(this.f122011d, kf01Var.f122011d) && this.f122012e == kf01Var.f122012e && this.f122013f == kf01Var.f122013f && this.f122014g == kf01Var.f122014g && this.f122015h == kf01Var.f122015h && this.f122016i == kf01Var.f122016i && this.f122017j == kf01Var.f122017j && this.f122018k == kf01Var.f122018k && this.f122019l == kf01Var.f122019l && this.f122020m == kf01Var.f122020m && this.f122021n == kf01Var.f122021n && this.f122022o == kf01Var.f122022o && this.f122023p == kf01Var.f122023p && this.f122024q == kf01Var.f122024q;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f122008a.hashCode() * 31, 31, this.f122009b);
        akk akkVar = this.f122010c;
        return Boolean.hashCode(this.f122024q) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c((iM77243b + (akkVar == null ? 0 : akkVar.hashCode())) * 31, 31, this.f122011d), 31, this.f122012e), 31, this.f122013f), 31, this.f122014g), 31, this.f122015h), 31, this.f122016i), 31, this.f122017j), 31, this.f122018k), 31, this.f122019l), 31, this.f122020m), 31, this.f122021n), 31, this.f122022o), 31, this.f122023p);
    }
}
