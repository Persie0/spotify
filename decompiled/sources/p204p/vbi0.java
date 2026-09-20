package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vbi0 {

    /* JADX INFO: renamed from: a */
    public final boolean f239505a;

    /* JADX INFO: renamed from: b */
    public final mb61 f239506b;

    /* JADX WARN: Multi-variable type inference failed */
    public vbi0(boolean z, th00 th00Var) {
        this.f239505a = z;
        this.f239506b = (mb61) th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbi0)) {
            return false;
        }
        vbi0 vbi0Var = (vbi0) obj;
        return this.f239505a == vbi0Var.f239505a && this.f239506b.equals(vbi0Var.f239506b);
    }

    public final int hashCode() {
        return this.f239506b.hashCode() + (Boolean.hashCode(this.f239505a) * 31);
    }
}
