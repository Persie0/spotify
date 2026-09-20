package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hua0 {

    /* JADX INFO: renamed from: a */
    public final i7n0 f95356a;

    /* JADX INFO: renamed from: b */
    public final hg7 f95357b;

    public hua0(i7n0 i7n0Var, hg7 hg7Var) {
        this.f95356a = i7n0Var;
        this.f95357b = hg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hua0)) {
            return false;
        }
        hua0 hua0Var = (hua0) obj;
        return wj50.m88271j(this.f95356a, hua0Var.f95356a) && wj50.m88271j(this.f95357b, hua0Var.f95357b);
    }

    public final int hashCode() {
        return this.f95357b.hashCode() + (this.f95356a.hashCode() * 31);
    }
}
