package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h3j0 {

    /* JADX INFO: renamed from: a */
    public final z3j0 f87244a;

    /* JADX INFO: renamed from: b */
    public final boolean f87245b;

    public h3j0(z3j0 z3j0Var, boolean z) {
        this.f87244a = z3j0Var;
        this.f87245b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3j0)) {
            return false;
        }
        h3j0 h3j0Var = (h3j0) obj;
        return wj50.m88271j(this.f87244a, h3j0Var.f87244a) && this.f87245b == h3j0Var.f87245b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87245b) + (this.f87244a.hashCode() * 31);
    }
}
