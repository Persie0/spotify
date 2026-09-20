package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xvs0 {

    /* JADX INFO: renamed from: a */
    public final fq01 f266474a;

    /* JADX INFO: renamed from: b */
    public final ccl0 f266475b;

    /* JADX INFO: renamed from: c */
    public final ho01 f266476c;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public xvs0(fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f266474a = fq01Var;
        this.f266475b = ccl0Var;
        this.f266476c = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvs0)) {
            return false;
        }
        xvs0 xvs0Var = (xvs0) obj;
        return wj50.m88271j(this.f266474a, xvs0Var.f266474a) && wj50.m88271j(this.f266475b, xvs0Var.f266475b) && wj50.m88271j(this.f266476c, xvs0Var.f266476c);
    }

    public final int hashCode() {
        int iHashCode = this.f266474a.hashCode() * 31;
        ccl0 ccl0Var = this.f266475b;
        return this.f266476c.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
