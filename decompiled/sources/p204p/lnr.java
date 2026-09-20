package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lnr extends pnr {

    /* JADX INFO: renamed from: a */
    public final ll20 f135211a;

    public lnr(ll20 ll20Var) {
        this.f135211a = ll20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnr) && wj50.m88271j(this.f135211a, ((lnr) obj).f135211a);
    }

    public final int hashCode() {
        ll20 ll20Var = this.f135211a;
        if (ll20Var == null) {
            return 0;
        }
        return ll20Var.hashCode();
    }
}
