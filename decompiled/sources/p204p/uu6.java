package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uu6 extends wu6 {

    /* JADX INFO: renamed from: a */
    public final int f234114a;

    /* JADX INFO: renamed from: b */
    public final fq01 f234115b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f234116c;

    /* JADX INFO: renamed from: d */
    public final ho01 f234117d;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public uu6(int i, fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f234114a = i;
        this.f234115b = fq01Var;
        this.f234116c = ccl0Var;
        this.f234117d = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu6)) {
            return false;
        }
        uu6 uu6Var = (uu6) obj;
        return this.f234114a == uu6Var.f234114a && wj50.m88271j(this.f234115b, uu6Var.f234115b) && wj50.m88271j(this.f234116c, uu6Var.f234116c) && wj50.m88271j(this.f234117d, uu6Var.f234117d);
    }

    public final int hashCode() {
        int iHashCode = (this.f234115b.hashCode() + (Integer.hashCode(this.f234114a) * 31)) * 31;
        ccl0 ccl0Var = this.f234116c;
        return this.f234117d.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
