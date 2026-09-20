package p204p;

import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class sne0 {

    /* JADX INFO: renamed from: a */
    public final String f210897a;

    /* JADX INFO: renamed from: b */
    public final boolean f210898b;

    /* JADX INFO: renamed from: c */
    public final String f210899c;

    /* JADX INFO: renamed from: d */
    public final pla1 f210900d;

    /* JADX INFO: renamed from: e */
    public final float f210901e;

    /* JADX INFO: renamed from: f */
    public final rne0 f210902f;

    /* JADX INFO: renamed from: g */
    public final long f210903g;

    /* JADX INFO: renamed from: h */
    public final boolean f210904h;

    /* JADX INFO: renamed from: i */
    public final List f210905i;

    /* JADX INFO: renamed from: j */
    public final eh00 f210906j;

    /* JADX INFO: renamed from: k */
    public final boolean f210907k;

    /* JADX INFO: renamed from: l */
    public final boolean f210908l;

    /* JADX INFO: renamed from: m */
    public final boolean f210909m;

    /* JADX INFO: renamed from: n */
    public final nne0 f210910n;

    /* JADX INFO: renamed from: o */
    public final boolean f210911o;

    /* JADX INFO: renamed from: p */
    public final boolean f210912p;

    /* JADX INFO: renamed from: q */
    public final List f210913q;

    /* JADX INFO: renamed from: r */
    public final boolean f210914r;

    /* JADX INFO: renamed from: s */
    public final boolean f210915s;

    /* JADX INFO: renamed from: t */
    public final boolean f210916t;

    /* JADX INFO: renamed from: u */
    public final boolean f210917u;

    /* JADX INFO: renamed from: v */
    public final gh00 f210918v;

    public sne0(String str, boolean z, String str2, pla1 pla1Var, float f, rne0 rne0Var, long j, boolean z2, List list, eh00 eh00Var, boolean z3, boolean z4, boolean z5, nne0 nne0Var, boolean z6, boolean z7, List list2, boolean z8, boolean z9, boolean z10, boolean z11, gh00 gh00Var) {
        this.f210897a = str;
        this.f210898b = z;
        this.f210899c = str2;
        this.f210900d = pla1Var;
        this.f210901e = f;
        this.f210902f = rne0Var;
        this.f210903g = j;
        this.f210904h = z2;
        this.f210905i = list;
        this.f210906j = eh00Var;
        this.f210907k = z3;
        this.f210908l = z4;
        this.f210909m = z5;
        this.f210910n = nne0Var;
        this.f210911o = z6;
        this.f210912p = z7;
        this.f210913q = list2;
        this.f210914r = z8;
        this.f210915s = z9;
        this.f210916t = z10;
        this.f210917u = z11;
        this.f210918v = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78554a() {
        nne0 nne0Var = this.f210910n;
        return (nne0Var instanceof mne0) || (nne0Var instanceof lne0) || (nne0Var instanceof hne0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sne0)) {
            return false;
        }
        sne0 sne0Var = (sne0) obj;
        return wj50.m88271j(this.f210897a, sne0Var.f210897a) && this.f210898b == sne0Var.f210898b && wj50.m88271j(this.f210899c, sne0Var.f210899c) && wj50.m88271j(this.f210900d, sne0Var.f210900d) && ybs.m93301b(this.f210901e, sne0Var.f210901e) && this.f210902f.equals(sne0Var.f210902f) && this.f210903g == sne0Var.f210903g && this.f210904h == sne0Var.f210904h && wj50.m88271j(this.f210905i, sne0Var.f210905i) && wj50.m88271j(this.f210906j, sne0Var.f210906j) && this.f210907k == sne0Var.f210907k && this.f210908l == sne0Var.f210908l && this.f210909m == sne0Var.f210909m && this.f210910n.equals(sne0Var.f210910n) && this.f210911o == sne0Var.f210911o && this.f210912p == sne0Var.f210912p && wj50.m88271j(this.f210913q, sne0Var.f210913q) && this.f210914r == sne0Var.f210914r && this.f210915s == sne0Var.f210915s && this.f210916t == sne0Var.f210916t && this.f210917u == sne0Var.f210917u && wj50.m88271j(this.f210918v, sne0Var.f210918v);
    }

    public final int hashCode() {
        return this.f210918v.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c(s571.m77245d(s571.m77245d((this.f210910n.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(p1v.m68853j(s571.m77244c(s571.m77245d(dq60.m36605e((this.f210902f.hashCode() + AbstractC0000a.m8g(ydj.m93448g(this.f210900d, s571.m77243b(s571.m77245d(this.f210897a.hashCode() * 31, 31, this.f210898b), 31, this.f210899c), 31), 31, this.f210901e)) * 31, this.f210903g, 31), 31, this.f210904h), 31, this.f210905i), this.f210906j, 31), 31, this.f210907k), 31, this.f210908l), 31, this.f210909m)) * 31, 31, this.f210911o), 31, this.f210912p), 31, this.f210913q), 31, this.f210914r), 31, this.f210915s), 31, this.f210916t), 31, this.f210917u);
    }
}
