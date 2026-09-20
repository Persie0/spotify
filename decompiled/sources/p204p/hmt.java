package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hmt implements nmt {

    /* JADX INFO: renamed from: a */
    public final wb41 f93072a;

    public hmt(wb41 wb41Var) {
        this.f93072a = wb41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmt) && this.f93072a == ((hmt) obj).f93072a;
    }

    public final int hashCode() {
        return this.f93072a.hashCode();
    }
}
