package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kbc1 implements qbc1 {

    /* JADX INFO: renamed from: a */
    public final fq01 f121182a;

    /* JADX INFO: renamed from: b */
    public final ccl0 f121183b;

    /* JADX INFO: renamed from: c */
    public final ho01 f121184c;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public kbc1(fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f121182a = fq01Var;
        this.f121183b = ccl0Var;
        this.f121184c = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbc1)) {
            return false;
        }
        kbc1 kbc1Var = (kbc1) obj;
        return wj50.m88271j(this.f121182a, kbc1Var.f121182a) && wj50.m88271j(this.f121183b, kbc1Var.f121183b) && wj50.m88271j(this.f121184c, kbc1Var.f121184c);
    }

    public final int hashCode() {
        int iHashCode = this.f121182a.hashCode() * 31;
        ccl0 ccl0Var = this.f121183b;
        return this.f121184c.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
