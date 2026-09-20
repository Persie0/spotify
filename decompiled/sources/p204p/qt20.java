package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qt20 {

    /* JADX INFO: renamed from: a */
    public final qro0 f192260a;

    /* JADX INFO: renamed from: b */
    public final it20 f192261b;

    public qt20(qro0 qro0Var, it20 it20Var) {
        this.f192260a = qro0Var;
        this.f192261b = it20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt20)) {
            return false;
        }
        qt20 qt20Var = (qt20) obj;
        return wj50.m88271j(this.f192260a, qt20Var.f192260a) && wj50.m88271j(this.f192261b, qt20Var.f192261b);
    }

    public final int hashCode() {
        return this.f192261b.hashCode() + (this.f192260a.hashCode() * 31);
    }
}
