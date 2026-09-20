package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lkn0 {

    /* JADX INFO: renamed from: a */
    public final jkn0 f134393a;

    /* JADX INFO: renamed from: b */
    public final boolean f134394b;

    public lkn0(jkn0 jkn0Var, boolean z) {
        this.f134393a = jkn0Var;
        this.f134394b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkn0)) {
            return false;
        }
        lkn0 lkn0Var = (lkn0) obj;
        return wj50.m88271j(this.f134393a, lkn0Var.f134393a) && this.f134394b == lkn0Var.f134394b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f134394b) + (this.f134393a.hashCode() * 31);
    }
}
