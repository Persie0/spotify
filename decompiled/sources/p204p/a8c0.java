package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a8c0 {

    /* JADX INFO: renamed from: a */
    public final a6c0 f13249a;

    /* JADX INFO: renamed from: b */
    public final z5c0 f13250b;

    public a8c0(a6c0 a6c0Var, z5c0 z5c0Var) {
        this.f13249a = a6c0Var;
        this.f13250b = z5c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8c0)) {
            return false;
        }
        a8c0 a8c0Var = (a8c0) obj;
        return wj50.m88271j(this.f13249a, a8c0Var.f13249a) && this.f13250b == a8c0Var.f13250b;
    }

    public final int hashCode() {
        return this.f13250b.hashCode() + (this.f13249a.hashCode() * 31);
    }
}
