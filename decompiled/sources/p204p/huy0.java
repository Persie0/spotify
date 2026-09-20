package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class huy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f95484a;

    /* JADX INFO: renamed from: b */
    public final d850 f95485b;

    public huy0(d850 d850Var, boolean z) {
        this.f95484a = z;
        this.f95485b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huy0)) {
            return false;
        }
        huy0 huy0Var = (huy0) obj;
        return this.f95484a == huy0Var.f95484a && wj50.m88271j(this.f95485b, huy0Var.f95485b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f95484a) * 31;
        d850 d850Var = this.f95485b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
