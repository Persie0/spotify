package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z3j0 {

    /* JADX INFO: renamed from: a */
    public final wwu f278971a;

    /* JADX INFO: renamed from: b */
    public final int f278972b;

    /* JADX INFO: renamed from: c */
    public final voc1 f278973c;

    /* JADX INFO: renamed from: d */
    public final y3j0 f278974d;

    /* JADX INFO: renamed from: e */
    public final xv41 f278975e;

    public z3j0(wwu wwuVar, int i, voc1 voc1Var, y3j0 y3j0Var, xv41 xv41Var) {
        this.f278971a = wwuVar;
        this.f278972b = i;
        this.f278973c = voc1Var;
        this.f278974d = y3j0Var;
        this.f278975e = xv41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3j0)) {
            return false;
        }
        z3j0 z3j0Var = (z3j0) obj;
        return wj50.m88271j(this.f278971a, z3j0Var.f278971a) && this.f278972b == z3j0Var.f278972b && wj50.m88271j(this.f278973c, z3j0Var.f278973c) && wj50.m88271j(this.f278974d, z3j0Var.f278974d) && wj50.m88271j(this.f278975e, z3j0Var.f278975e);
    }

    public final int hashCode() {
        return this.f278975e.hashCode() + ((this.f278974d.hashCode() + s571.m77243b(mt60.m62800g(this.f278972b, this.f278971a.hashCode() * 31, 31), 31, this.f278973c.f243453a)) * 31);
    }
}
