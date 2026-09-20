package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lrs {

    /* JADX INFO: renamed from: a */
    public final String f136354a;

    /* JADX INFO: renamed from: b */
    public final cg9 f136355b;

    public lrs(String str, cg9 cg9Var) {
        this.f136354a = str;
        this.f136355b = cg9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrs)) {
            return false;
        }
        lrs lrsVar = (lrs) obj;
        return wj50.m88271j(this.f136354a, lrsVar.f136354a) && this.f136355b == lrsVar.f136355b;
    }

    public final int hashCode() {
        String str = this.f136354a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        cg9 cg9Var = this.f136355b;
        return iHashCode + (cg9Var != null ? cg9Var.hashCode() : 0);
    }
}
