package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final mzc1 f173918a;

    /* JADX INFO: renamed from: b */
    public final int f173919b;

    public p4g0(mzc1 mzc1Var, int i) {
        this.f173918a = mzc1Var;
        this.f173919b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4g0)) {
            return false;
        }
        p4g0 p4g0Var = (p4g0) obj;
        return this.f173918a == p4g0Var.f173918a && this.f173919b == p4g0Var.f173919b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173919b) + (this.f173918a.hashCode() * 31);
    }
}
