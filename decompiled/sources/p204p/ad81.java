package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ad81 {

    /* JADX INFO: renamed from: a */
    public final qla1 f14569a;

    /* JADX INFO: renamed from: b */
    public final int f14570b;

    /* JADX INFO: renamed from: c */
    public final int f14571c;

    /* JADX INFO: renamed from: d */
    public final boolean f14572d;

    /* JADX INFO: renamed from: e */
    public final boolean f14573e;

    /* JADX INFO: renamed from: f */
    public final boolean f14574f;

    /* JADX INFO: renamed from: g */
    public final boolean f14575g;

    /* JADX INFO: renamed from: h */
    public final boolean f14576h;

    /* JADX INFO: renamed from: i */
    public final boolean f14577i;

    public ad81(qla1 qla1Var, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f14569a = qla1Var;
        this.f14570b = i;
        this.f14571c = i2;
        this.f14572d = z;
        this.f14573e = z2;
        this.f14574f = z3;
        this.f14575g = z4;
        this.f14576h = z5;
        this.f14577i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad81)) {
            return false;
        }
        ad81 ad81Var = (ad81) obj;
        return wj50.m88271j(this.f14569a, ad81Var.f14569a) && this.f14570b == ad81Var.f14570b && this.f14571c == ad81Var.f14571c && this.f14572d == ad81Var.f14572d && this.f14573e == ad81Var.f14573e && this.f14574f == ad81Var.f14574f && this.f14575g == ad81Var.f14575g && this.f14576h == ad81Var.f14576h && this.f14577i == ad81Var.f14577i;
    }

    public final int hashCode() {
        qla1 qla1Var = this.f14569a;
        return Boolean.hashCode(this.f14577i) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f14571c, mt60.m62800g(this.f14570b, (qla1Var == null ? 0 : qla1Var.hashCode()) * 31, 31), 31), 31, this.f14572d), 31, this.f14573e), 31, this.f14574f), 31, this.f14575g), 31, this.f14576h);
    }
}
