package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z371 extends c471 {

    /* JADX INFO: renamed from: a */
    public final fq01 f278810a;

    /* JADX INFO: renamed from: b */
    public final ccl0 f278811b;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public z371(fq01 fq01Var, ccl0 ccl0Var) {
        this.f278810a = fq01Var;
        this.f278811b = ccl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z371)) {
            return false;
        }
        z371 z371Var = (z371) obj;
        return wj50.m88271j(this.f278810a, z371Var.f278810a) && wj50.m88271j(this.f278811b, z371Var.f278811b);
    }

    public final int hashCode() {
        int iHashCode = this.f278810a.hashCode() * 31;
        ccl0 ccl0Var = this.f278811b;
        return iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode());
    }
}
