package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vhj0 implements fz0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f241529a;

    /* JADX INFO: renamed from: b */
    public final rk7 f241530b;

    public vhj0(Throwable th, rk7 rk7Var) {
        this.f241529a = th;
        this.f241530b = rk7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhj0)) {
            return false;
        }
        vhj0 vhj0Var = (vhj0) obj;
        return wj50.m88271j(this.f241529a, vhj0Var.f241529a) && this.f241530b == vhj0Var.f241530b;
    }

    public final int hashCode() {
        int iHashCode = this.f241529a.hashCode() * 31;
        rk7 rk7Var = this.f241530b;
        return iHashCode + (rk7Var == null ? 0 : rk7Var.hashCode());
    }
}
