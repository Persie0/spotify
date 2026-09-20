package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z2q0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final y2q0 f278642a;

    /* JADX INFO: renamed from: b */
    public final boolean f278643b;

    /* JADX INFO: renamed from: c */
    public final w2q0 f278644c;

    public z2q0(y2q0 y2q0Var, boolean z, w2q0 w2q0Var) {
        this.f278642a = y2q0Var;
        this.f278643b = z;
        this.f278644c = w2q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2q0)) {
            return false;
        }
        z2q0 z2q0Var = (z2q0) obj;
        return wj50.m88271j(this.f278642a, z2q0Var.f278642a) && this.f278643b == z2q0Var.f278643b && wj50.m88271j(this.f278644c, z2q0Var.f278644c);
    }

    public final int hashCode() {
        y2q0 y2q0Var = this.f278642a;
        int iM77245d = s571.m77245d((y2q0Var == null ? 0 : y2q0Var.hashCode()) * 31, 31, this.f278643b);
        w2q0 w2q0Var = this.f278644c;
        return iM77245d + (w2q0Var != null ? w2q0Var.hashCode() : 0);
    }
}
