package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class aa50 {

    /* JADX INFO: renamed from: a */
    public final int f13766a;

    /* JADX INFO: renamed from: b */
    public final d850 f13767b;

    public aa50(int i, d850 d850Var) {
        this.f13766a = i;
        this.f13767b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa50)) {
            return false;
        }
        aa50 aa50Var = (aa50) obj;
        return this.f13766a == aa50Var.f13766a && wj50.m88271j(this.f13767b, aa50Var.f13767b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f13766a) * 31;
        d850 d850Var = this.f13767b;
        return iM38547C + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
