package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s371 extends hsg1 {

    /* JADX INFO: renamed from: b */
    public final fq01 f205198b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f205199c;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public s371(fq01 fq01Var, ccl0 ccl0Var) {
        this.f205198b = fq01Var;
        this.f205199c = ccl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s371)) {
            return false;
        }
        s371 s371Var = (s371) obj;
        return wj50.m88271j(this.f205198b, s371Var.f205198b) && wj50.m88271j(this.f205199c, s371Var.f205199c);
    }

    public final int hashCode() {
        int iHashCode = this.f205198b.hashCode() * 31;
        ccl0 ccl0Var = this.f205199c;
        return iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode());
    }
}
