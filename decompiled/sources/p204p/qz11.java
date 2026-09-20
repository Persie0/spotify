package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qz11 {

    /* JADX INFO: renamed from: a */
    public final zy11 f194088a;

    /* JADX INFO: renamed from: b */
    public final xhy0 f194089b;

    public qz11(zy11 zy11Var, xhy0 xhy0Var) {
        this.f194088a = zy11Var;
        this.f194089b = xhy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz11)) {
            return false;
        }
        qz11 qz11Var = (qz11) obj;
        return wj50.m88271j(this.f194088a, qz11Var.f194088a) && wj50.m88271j(this.f194089b, qz11Var.f194089b);
    }

    public final int hashCode() {
        return this.f194089b.hashCode() + (this.f194088a.hashCode() * 31);
    }
}
