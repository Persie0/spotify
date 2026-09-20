package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vf00 {

    /* JADX INFO: renamed from: a */
    public final boolean f240861a;

    /* JADX INFO: renamed from: b */
    public final obk0 f240862b;

    public vf00(boolean z, obk0 obk0Var) {
        this.f240861a = z;
        this.f240862b = obk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf00)) {
            return false;
        }
        vf00 vf00Var = (vf00) obj;
        return this.f240861a == vf00Var.f240861a && this.f240862b == vf00Var.f240862b;
    }

    public final int hashCode() {
        return this.f240862b.hashCode() + (Boolean.hashCode(this.f240861a) * 31);
    }
}
