package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lc6 {

    /* JADX INFO: renamed from: a */
    public final dut f131829a;

    /* JADX INFO: renamed from: b */
    public final xg6 f131830b;

    public lc6(dut dutVar, xg6 xg6Var) {
        this.f131829a = dutVar;
        this.f131830b = xg6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc6)) {
            return false;
        }
        lc6 lc6Var = (lc6) obj;
        return wj50.m88271j(this.f131829a, lc6Var.f131829a) && wj50.m88271j(this.f131830b, lc6Var.f131830b);
    }

    public final int hashCode() {
        return this.f131830b.hashCode() + (this.f131829a.hashCode() * 31);
    }
}
