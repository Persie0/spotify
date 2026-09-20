package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hk0 {

    /* JADX INFO: renamed from: a */
    public final fd01 f92303a;

    /* JADX INFO: renamed from: b */
    public final vj0 f92304b;

    public hk0(fd01 fd01Var, vj0 vj0Var) {
        this.f92303a = fd01Var;
        this.f92304b = vj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0)) {
            return false;
        }
        hk0 hk0Var = (hk0) obj;
        return wj50.m88271j(this.f92303a, hk0Var.f92303a) && this.f92304b == hk0Var.f92304b;
    }

    public final int hashCode() {
        int iHashCode = this.f92303a.hashCode() * 31;
        vj0 vj0Var = this.f92304b;
        return iHashCode + (vj0Var == null ? 0 : vj0Var.hashCode());
    }
}
