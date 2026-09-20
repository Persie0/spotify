package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oft {

    /* JADX INFO: renamed from: a */
    public final fq01 f164902a;

    /* JADX INFO: renamed from: b */
    public final ccl0 f164903b;

    /* JADX INFO: renamed from: c */
    public final ho01 f164904c;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public oft(fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var) {
        this.f164902a = fq01Var;
        this.f164903b = ccl0Var;
        this.f164904c = ho01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oft)) {
            return false;
        }
        oft oftVar = (oft) obj;
        return wj50.m88271j(this.f164902a, oftVar.f164902a) && wj50.m88271j(this.f164903b, oftVar.f164903b) && wj50.m88271j(this.f164904c, oftVar.f164904c);
    }

    public final int hashCode() {
        int iHashCode = this.f164902a.hashCode() * 31;
        ccl0 ccl0Var = this.f164903b;
        return this.f164904c.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31);
    }
}
