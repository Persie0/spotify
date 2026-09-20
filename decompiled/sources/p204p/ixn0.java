package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ixn0 implements lxn0 {

    /* JADX INFO: renamed from: a */
    public final jyn0 f106722a;

    /* JADX INFO: renamed from: b */
    public final int f106723b;

    public ixn0(jyn0 jyn0Var, int i) {
        this.f106722a = jyn0Var;
        this.f106723b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixn0)) {
            return false;
        }
        ixn0 ixn0Var = (ixn0) obj;
        return wj50.m88271j(this.f106722a, ixn0Var.f106722a) && this.f106723b == ixn0Var.f106723b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106723b) + (this.f106722a.hashCode() * 31);
    }
}
