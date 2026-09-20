package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j3j0 {

    /* JADX INFO: renamed from: a */
    public final int f108408a;

    /* JADX INFO: renamed from: b */
    public final j4m0 f108409b;

    public j3j0(int i, j4m0 j4m0Var) {
        this.f108408a = i;
        this.f108409b = j4m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3j0)) {
            return false;
        }
        j3j0 j3j0Var = (j3j0) obj;
        return this.f108408a == j3j0Var.f108408a && this.f108409b.equals(j3j0Var.f108409b);
    }

    public final int hashCode() {
        return this.f108409b.hashCode() + (edb.m38547C(this.f108408a) * 31);
    }
}
