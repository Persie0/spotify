package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class ibp0 {

    /* JADX INFO: renamed from: a */
    public final long f100615a;

    /* JADX INFO: renamed from: b */
    public final boolean f100616b;

    /* JADX INFO: renamed from: c */
    public final long f100617c;

    /* JADX INFO: renamed from: d */
    public final String f100618d;

    /* JADX INFO: renamed from: e */
    public final float f100619e;

    /* JADX INFO: renamed from: f */
    public final float f100620f;

    /* JADX INFO: renamed from: g */
    public final String f100621g;

    /* JADX INFO: renamed from: h */
    public final String f100622h;

    /* JADX INFO: renamed from: i */
    public final int f100623i;

    /* JADX INFO: renamed from: j */
    public final boolean f100624j;

    /* JADX INFO: renamed from: k */
    public final String f100625k;

    /* JADX INFO: renamed from: l */
    public final int f100626l;

    /* JADX INFO: renamed from: m */
    public final boolean f100627m;

    public ibp0(long j, boolean z, long j2, String str, float f, float f2, String str2, String str3, int i, boolean z2, String str4, int i2, boolean z3) {
        this.f100615a = j;
        this.f100616b = z;
        this.f100617c = j2;
        this.f100618d = str;
        this.f100619e = f;
        this.f100620f = f2;
        this.f100621g = str2;
        this.f100622h = str3;
        this.f100623i = i;
        this.f100624j = z2;
        this.f100625k = str4;
        this.f100626l = i2;
        this.f100627m = z3;
    }

    /* JADX INFO: renamed from: a */
    public final int m50196a() {
        return this.f100626l;
    }

    /* JADX INFO: renamed from: b */
    public final int m50197b() {
        return this.f100623i;
    }

    /* JADX INFO: renamed from: c */
    public final long m50198c() {
        return this.f100615a;
    }

    /* JADX INFO: renamed from: d */
    public final String m50199d() {
        return this.f100621g;
    }

    /* JADX INFO: renamed from: e */
    public final long m50200e() {
        return this.f100617c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibp0)) {
            return false;
        }
        ibp0 ibp0Var = (ibp0) obj;
        return this.f100615a == ibp0Var.f100615a && this.f100616b == ibp0Var.f100616b && this.f100617c == ibp0Var.f100617c && this.f100618d.equals(ibp0Var.f100618d) && Float.compare(this.f100619e, ibp0Var.f100619e) == 0 && Float.compare(this.f100620f, ibp0Var.f100620f) == 0 && wj50.m88271j(this.f100621g, ibp0Var.f100621g) && this.f100622h.equals(ibp0Var.f100622h) && this.f100623i == ibp0Var.f100623i && this.f100624j == ibp0Var.f100624j && wj50.m88271j(this.f100625k, ibp0Var.f100625k) && this.f100626l == ibp0Var.f100626l && this.f100627m == ibp0Var.f100627m;
    }

    /* JADX INFO: renamed from: f */
    public final float m50201f() {
        return this.f100619e;
    }

    /* JADX INFO: renamed from: g */
    public final String m50202g() {
        return this.f100622h;
    }

    /* JADX INFO: renamed from: h */
    public final String m50203h() {
        return this.f100618d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100627m) + mt60.m62800g(this.f100626l, s571.m77243b(s571.m77245d(mt60.m62800g(this.f100623i, s571.m77243b(s571.m77243b(AbstractC0000a.m8g(AbstractC0000a.m8g(s571.m77243b(dq60.m36605e(s571.m77245d(dq60.m36605e(-349254717, this.f100615a, 31), 31, this.f100616b), this.f100617c, 31), 31, this.f100618d), 31, this.f100619e), 31, this.f100620f), 31, this.f100621g), 31, this.f100622h), 31), 31, this.f100624j), 31, this.f100625k), 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m50204i() {
        return this.f100625k;
    }

    /* JADX INFO: renamed from: j */
    public final float m50205j() {
        return this.f100620f;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m50206k() {
        return this.f100624j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m50207l() {
        return this.f100616b;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m50208m() {
        return this.f100627m;
    }
}
