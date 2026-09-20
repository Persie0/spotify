package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bcr0 implements ccr0 {

    /* JADX INFO: renamed from: a */
    public final fq01 f25934a;

    /* JADX INFO: renamed from: b */
    public final ccl0 f25935b;

    public bcr0(fq01 fq01Var, ccl0 ccl0Var) {
        this.f25934a = fq01Var;
        this.f25935b = ccl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcr0)) {
            return false;
        }
        bcr0 bcr0Var = (bcr0) obj;
        return wj50.m88271j(this.f25934a, bcr0Var.f25934a) && wj50.m88271j(this.f25935b, bcr0Var.f25935b);
    }

    public final int hashCode() {
        int iHashCode = this.f25934a.hashCode() * 31;
        ccl0 ccl0Var = this.f25935b;
        return iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode());
    }
}
