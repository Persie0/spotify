package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vmq0 {

    /* JADX INFO: renamed from: a */
    public final smq0 f242909a;

    /* JADX INFO: renamed from: b */
    public final int f242910b;

    public vmq0(smq0 smq0Var, int i) {
        this.f242909a = smq0Var;
        this.f242910b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmq0)) {
            return false;
        }
        vmq0 vmq0Var = (vmq0) obj;
        return wj50.m88271j(this.f242909a, vmq0Var.f242909a) && this.f242910b == vmq0Var.f242910b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f242910b) + (this.f242909a.hashCode() * 31);
    }
}
