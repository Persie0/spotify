package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lc41 {

    /* JADX INFO: renamed from: a */
    public final int f131824a;

    /* JADX INFO: renamed from: b */
    public final r300 f131825b;

    /* JADX INFO: renamed from: c */
    public final lfz0 f131826c;

    public lc41(int i, r300 r300Var, lfz0 lfz0Var) {
        this.f131824a = i;
        this.f131825b = r300Var;
        this.f131826c = lfz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc41)) {
            return false;
        }
        lc41 lc41Var = (lc41) obj;
        return this.f131824a == lc41Var.f131824a && wj50.m88271j(this.f131825b, lc41Var.f131825b) && wj50.m88271j(this.f131826c, lc41Var.f131826c);
    }

    public final int hashCode() {
        return this.f131826c.hashCode() + ((this.f131825b.hashCode() + (Integer.hashCode(this.f131824a) * 31)) * 31);
    }
}
