package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e7b1 extends m7b1 {

    /* JADX INFO: renamed from: a */
    public final String f56893a;

    /* JADX INFO: renamed from: b */
    public final d850 f56894b;

    public e7b1(String str, d850 d850Var) {
        this.f56893a = str;
        this.f56894b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7b1)) {
            return false;
        }
        e7b1 e7b1Var = (e7b1) obj;
        return wj50.m88271j(this.f56893a, e7b1Var.f56893a) && wj50.m88271j(this.f56894b, e7b1Var.f56894b);
    }

    public final int hashCode() {
        int iHashCode = this.f56893a.hashCode() * 31;
        d850 d850Var = this.f56894b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
