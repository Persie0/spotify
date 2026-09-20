package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ub60 {

    /* JADX INFO: renamed from: a */
    public final wb60 f228635a;

    /* JADX INFO: renamed from: b */
    public final tb60 f228636b;

    public ub60(wb60 wb60Var, tb60 tb60Var) {
        this.f228635a = wb60Var;
        this.f228636b = tb60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub60)) {
            return false;
        }
        ub60 ub60Var = (ub60) obj;
        return wj50.m88271j(this.f228635a, ub60Var.f228635a) && wj50.m88271j(this.f228636b, ub60Var.f228636b);
    }

    public final int hashCode() {
        return this.f228636b.hashCode() + (this.f228635a.hashCode() * 31);
    }
}
