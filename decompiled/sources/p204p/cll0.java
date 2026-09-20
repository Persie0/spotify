package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cll0 {

    /* JADX INFO: renamed from: a */
    public final int f39314a;

    /* JADX INFO: renamed from: b */
    public final eh00 f39315b;

    public cll0(int i, eh00 eh00Var) {
        this.f39314a = i;
        this.f39315b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cll0)) {
            return false;
        }
        cll0 cll0Var = (cll0) obj;
        return this.f39314a == cll0Var.f39314a && wj50.m88271j(this.f39315b, cll0Var.f39315b);
    }

    public final int hashCode() {
        return this.f39315b.hashCode() + (edb.m38547C(this.f39314a) * 31);
    }
}
