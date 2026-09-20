package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zlb1 {

    /* JADX INFO: renamed from: a */
    public final mb61 f283972a;

    /* JADX INFO: renamed from: b */
    public final Object f283973b;

    /* JADX WARN: Multi-variable type inference failed */
    public zlb1(th00 th00Var, th00 th00Var2) {
        this.f283972a = (mb61) th00Var;
        this.f283973b = th00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlb1)) {
            return false;
        }
        zlb1 zlb1Var = (zlb1) obj;
        return this.f283972a.equals(zlb1Var.f283972a) && this.f283973b.equals(zlb1Var.f283973b);
    }

    public final int hashCode() {
        return this.f283973b.hashCode() + (this.f283972a.hashCode() * 31);
    }
}
