package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class l4b {

    /* JADX INFO: renamed from: a */
    public final whj0 f129616a;

    public l4b(whj0 whj0Var) {
        this.f129616a = whj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l4b) {
            return wj50.m88271j(this.f129616a, ((l4b) obj).f129616a);
        }
        return false;
    }

    public final int hashCode() {
        whj0 whj0Var = this.f129616a;
        if (whj0Var != null) {
            return whj0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.f129616a + ')';
    }
}
