package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qy9 {

    /* JADX INFO: renamed from: a */
    public final boolean f193853a;

    /* JADX INFO: renamed from: b */
    public final wy9 f193854b;

    public qy9(boolean z, wy9 wy9Var) {
        this.f193853a = z;
        this.f193854b = wy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj != null && qy9.class.equals(obj.getClass())) {
            qy9 qy9Var = (qy9) obj;
            wy9 wy9Var = qy9Var.f193854b;
            if (this.f193853a == qy9Var.f193853a) {
                wy9 wy9Var2 = this.f193854b;
                if (wy9Var2 == null ? wy9Var != null : !wy9Var2.equals(wy9Var)) {
                    z = true;
                }
                return !z;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f193853a ? 1 : 0) * 31;
        wy9 wy9Var = this.f193854b;
        return i + (wy9Var != null ? wy9Var.hashCode() : 0);
    }
}
