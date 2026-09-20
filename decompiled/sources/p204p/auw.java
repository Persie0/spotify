package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class auw implements y2x {

    /* JADX INFO: renamed from: a */
    public final kfn0 f20035a;

    /* JADX INFO: renamed from: b */
    public final e3x0 f20036b;

    public auw(kfn0 kfn0Var, e3x0 e3x0Var) {
        this.f20035a = kfn0Var;
        this.f20036b = e3x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auw)) {
            return false;
        }
        auw auwVar = (auw) obj;
        return wj50.m88271j(this.f20035a, auwVar.f20035a) && wj50.m88271j(this.f20036b, auwVar.f20036b);
    }

    public final int hashCode() {
        int iHashCode = this.f20035a.hashCode() * 31;
        e3x0 e3x0Var = this.f20036b;
        return iHashCode + (e3x0Var == null ? 0 : e3x0Var.f55898a.hashCode());
    }
}
