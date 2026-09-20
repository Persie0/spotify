package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ihb1 {

    /* JADX INFO: renamed from: a */
    public final hhb1 f102229a;

    /* JADX INFO: renamed from: b */
    public final m340 f102230b;

    /* JADX INFO: renamed from: c */
    public final ts6 f102231c;

    /* JADX INFO: renamed from: d */
    public final wy81 f102232d;

    public ihb1(hhb1 hhb1Var, m340 m340Var, ts6 ts6Var, wy81 wy81Var) {
        this.f102229a = hhb1Var;
        this.f102230b = m340Var;
        this.f102231c = ts6Var;
        this.f102232d = wy81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihb1)) {
            return false;
        }
        ihb1 ihb1Var = (ihb1) obj;
        return wj50.m88271j(this.f102229a, ihb1Var.f102229a) && wj50.m88271j(this.f102230b, ihb1Var.f102230b) && wj50.m88271j(this.f102231c, ihb1Var.f102231c) && wj50.m88271j(this.f102232d, ihb1Var.f102232d);
    }

    public final int hashCode() {
        int iHashCode = (this.f102230b.hashCode() + (this.f102229a.hashCode() * 31)) * 31;
        ts6 ts6Var = this.f102231c;
        int iHashCode2 = (iHashCode + (ts6Var == null ? 0 : ts6Var.hashCode())) * 31;
        wy81 wy81Var = this.f102232d;
        return iHashCode2 + (wy81Var != null ? wy81Var.hashCode() : 0);
    }
}
