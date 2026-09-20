package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aw6 extends bw6 {

    /* JADX INFO: renamed from: a */
    public final fq01 f20406a;

    /* JADX INFO: renamed from: b */
    public final ccl0 f20407b;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public aw6(fq01 fq01Var, ccl0 ccl0Var) {
        this.f20406a = fq01Var;
        this.f20407b = ccl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw6)) {
            return false;
        }
        aw6 aw6Var = (aw6) obj;
        return wj50.m88271j(this.f20406a, aw6Var.f20406a) && wj50.m88271j(this.f20407b, aw6Var.f20407b);
    }

    public final int hashCode() {
        int iHashCode = this.f20406a.hashCode() * 31;
        ccl0 ccl0Var = this.f20407b;
        return iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode());
    }
}
