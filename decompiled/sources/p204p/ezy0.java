package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ezy0 {

    /* JADX INFO: renamed from: a */
    public final rpy0 f64497a;

    /* JADX INFO: renamed from: b */
    public final int f64498b;

    public ezy0(rpy0 rpy0Var, int i) {
        this.f64497a = rpy0Var;
        this.f64498b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezy0)) {
            return false;
        }
        ezy0 ezy0Var = (ezy0) obj;
        return wj50.m88271j(this.f64497a, ezy0Var.f64497a) && this.f64498b == ezy0Var.f64498b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64498b) + (this.f64497a.hashCode() * 31);
    }
}
