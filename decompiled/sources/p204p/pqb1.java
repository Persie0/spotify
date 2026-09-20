package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pqb1 {

    /* JADX INFO: renamed from: a */
    public final fq01 f180254a;

    /* JADX INFO: renamed from: b */
    public final ccl0 f180255b;

    /* JADX INFO: renamed from: c */
    public final ho01 f180256c;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public pqb1(fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f180254a = fq01Var;
        this.f180255b = ccl0Var;
        this.f180256c = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqb1)) {
            return false;
        }
        pqb1 pqb1Var = (pqb1) obj;
        return wj50.m88271j(this.f180254a, pqb1Var.f180254a) && wj50.m88271j(this.f180255b, pqb1Var.f180255b) && wj50.m88271j(this.f180256c, pqb1Var.f180256c);
    }

    public final int hashCode() {
        int iHashCode = this.f180254a.hashCode() * 31;
        ccl0 ccl0Var = this.f180255b;
        return this.f180256c.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
