package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ifv0 extends kfv0 {

    /* JADX INFO: renamed from: a */
    public final String f101830a;

    /* JADX INFO: renamed from: b */
    public final qro0 f101831b;

    public ifv0(String str, qro0 qro0Var) {
        this.f101830a = str;
        this.f101831b = qro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifv0)) {
            return false;
        }
        ifv0 ifv0Var = (ifv0) obj;
        return wj50.m88271j(this.f101830a, ifv0Var.f101830a) && wj50.m88271j(this.f101831b, ifv0Var.f101831b);
    }

    public final int hashCode() {
        return this.f101831b.hashCode() + (this.f101830a.hashCode() * 31);
    }
}
