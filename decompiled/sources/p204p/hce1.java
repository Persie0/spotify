package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hce1 {

    /* JADX INFO: renamed from: a */
    public final gmr0 f89782a;

    public hce1(gmr0 gmr0Var) {
        this.f89782a = gmr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hce1) && wj50.m88271j(this.f89782a, ((hce1) obj).f89782a);
    }

    public final int hashCode() {
        gmr0 gmr0Var = this.f89782a;
        if (gmr0Var == null) {
            return 0;
        }
        return gmr0Var.hashCode();
    }
}
