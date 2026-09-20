package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jcl0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final fcl0 f111142a;

    /* JADX INFO: renamed from: b */
    public final Long f111143b;

    /* JADX INFO: renamed from: c */
    public final long f111144c;

    /* JADX INFO: renamed from: d */
    public final hcl0 f111145d;

    /* JADX INFO: renamed from: e */
    public final Long f111146e;

    /* JADX INFO: renamed from: f */
    public final icl0 f111147f;

    public jcl0(fcl0 fcl0Var, Long l, long j, hcl0 hcl0Var, Long l2, icl0 icl0Var) {
        this.f111142a = fcl0Var;
        this.f111143b = l;
        this.f111144c = j;
        this.f111145d = hcl0Var;
        this.f111146e = l2;
        this.f111147f = icl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcl0)) {
            return false;
        }
        jcl0 jcl0Var = (jcl0) obj;
        return wj50.m88271j(this.f111142a, jcl0Var.f111142a) && wj50.m88271j(this.f111143b, jcl0Var.f111143b) && this.f111144c == jcl0Var.f111144c && wj50.m88271j(this.f111145d, jcl0Var.f111145d) && wj50.m88271j(this.f111146e, jcl0Var.f111146e) && wj50.m88271j(this.f111147f, jcl0Var.f111147f);
    }

    public final int hashCode() {
        fcl0 fcl0Var = this.f111142a;
        int iHashCode = (fcl0Var == null ? 0 : fcl0Var.hashCode()) * 31;
        Long l = this.f111143b;
        int iM36605e = dq60.m36605e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.f111144c, 31);
        hcl0 hcl0Var = this.f111145d;
        int iHashCode2 = (iM36605e + (hcl0Var == null ? 0 : hcl0Var.hashCode())) * 31;
        Long l2 = this.f111146e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        icl0 icl0Var = this.f111147f;
        return iHashCode3 + (icl0Var != null ? icl0Var.hashCode() : 0);
    }
}
