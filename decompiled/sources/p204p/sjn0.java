package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sjn0 {

    /* JADX INFO: renamed from: a */
    public final kbm0 f209881a;

    /* JADX INFO: renamed from: b */
    public final zam0 f209882b;

    /* JADX INFO: renamed from: c */
    public final fnm0 f209883c;

    /* JADX INFO: renamed from: d */
    public final long f209884d;

    public sjn0(kbm0 kbm0Var, zam0 zam0Var, fnm0 fnm0Var, long j) {
        this.f209881a = kbm0Var;
        this.f209882b = zam0Var;
        this.f209883c = fnm0Var;
        this.f209884d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjn0)) {
            return false;
        }
        sjn0 sjn0Var = (sjn0) obj;
        return wj50.m88271j(this.f209881a, sjn0Var.f209881a) && wj50.m88271j(this.f209882b, sjn0Var.f209882b) && wj50.m88271j(this.f209883c, sjn0Var.f209883c) && this.f209884d == sjn0Var.f209884d;
    }

    public final int hashCode() {
        int iHashCode = (this.f209882b.hashCode() + (this.f209881a.f121231a.hashCode() * 31)) * 31;
        fnm0 fnm0Var = this.f209883c;
        return Long.hashCode(this.f209884d) + ((iHashCode + (fnm0Var == null ? 0 : fnm0Var.f71323a.hashCode())) * 31);
    }
}
