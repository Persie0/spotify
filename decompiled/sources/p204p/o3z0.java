package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o3z0 extends w3z0 {

    /* JADX INFO: renamed from: d */
    public final d850 f161488d;

    /* JADX INFO: renamed from: e */
    public final int f161489e;

    public o3z0(int i, d850 d850Var) {
        this.f161488d = d850Var;
        this.f161489e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3z0)) {
            return false;
        }
        o3z0 o3z0Var = (o3z0) obj;
        return wj50.m88271j(this.f161488d, o3z0Var.f161488d) && this.f161489e == o3z0Var.f161489e;
    }

    public final int hashCode() {
        d850 d850Var = this.f161488d;
        return Integer.hashCode(this.f161489e) + ((d850Var == null ? 0 : d850Var.hashCode()) * 31);
    }
}
