package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nxy0 {

    /* JADX INFO: renamed from: a */
    public final qbm0 f159639a;

    /* JADX INFO: renamed from: b */
    public final int f159640b;

    /* JADX INFO: renamed from: c */
    public final l0z0 f159641c;

    public nxy0(qbm0 qbm0Var, int i, l0z0 l0z0Var) {
        this.f159639a = qbm0Var;
        this.f159640b = i;
        this.f159641c = l0z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxy0)) {
            return false;
        }
        nxy0 nxy0Var = (nxy0) obj;
        return wj50.m88271j(this.f159639a, nxy0Var.f159639a) && this.f159640b == nxy0Var.f159640b && wj50.m88271j(this.f159641c, nxy0Var.f159641c);
    }

    public final int hashCode() {
        return this.f159641c.hashCode() + mt60.m62800g(this.f159640b, this.f159639a.hashCode() * 31, 31);
    }
}
