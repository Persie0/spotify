package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qo11 {

    /* JADX INFO: renamed from: a */
    public final bp11 f190750a;

    /* JADX INFO: renamed from: b */
    public final das f190751b;

    /* JADX INFO: renamed from: c */
    public final zpe1 f190752c;

    /* JADX INFO: renamed from: d */
    public final ha3 f190753d;

    /* JADX INFO: renamed from: e */
    public final boolean f190754e;

    /* JADX INFO: renamed from: f */
    public final xcw0 f190755f;

    /* JADX INFO: renamed from: g */
    public final ro11 f190756g;

    /* JADX INFO: renamed from: h */
    public final xul0 f190757h;

    /* JADX INFO: renamed from: i */
    public final boolean f190758i;

    public qo11(bp11 bp11Var, das dasVar, zpe1 zpe1Var, ha3 ha3Var, boolean z, xcw0 xcw0Var, ro11 ro11Var, xul0 xul0Var, boolean z2) {
        this.f190750a = bp11Var;
        this.f190751b = dasVar;
        this.f190752c = zpe1Var;
        this.f190753d = ha3Var;
        this.f190754e = z;
        this.f190755f = xcw0Var;
        this.f190756g = ro11Var;
        this.f190757h = xul0Var;
        this.f190758i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo11)) {
            return false;
        }
        qo11 qo11Var = (qo11) obj;
        return wj50.m88271j(this.f190750a, qo11Var.f190750a) && wj50.m88271j(this.f190751b, qo11Var.f190751b) && wj50.m88271j(this.f190752c, qo11Var.f190752c) && wj50.m88271j(this.f190753d, qo11Var.f190753d) && this.f190754e == qo11Var.f190754e && wj50.m88271j(this.f190755f, qo11Var.f190755f) && wj50.m88271j(this.f190756g, qo11Var.f190756g) && wj50.m88271j(this.f190757h, qo11Var.f190757h) && this.f190758i == qo11Var.f190758i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190758i) + ((this.f190757h.hashCode() + ((this.f190756g.hashCode() + ((this.f190755f.hashCode() + s571.m77245d((this.f190753d.hashCode() + ((this.f190752c.hashCode() + ((this.f190751b.hashCode() + (this.f190750a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f190754e)) * 31)) * 31)) * 31);
    }
}
