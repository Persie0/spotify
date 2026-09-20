package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dxz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f54127a;

    /* JADX INFO: renamed from: b */
    public final boolean f54128b;

    public /* synthetic */ dxz0(int i) {
        this((i & 1) != 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static dxz0 m37277a(dxz0 dxz0Var, int i) {
        boolean z = (i & 1) != 0 ? dxz0Var.f54127a : false;
        boolean z2 = (i & 2) != 0 ? dxz0Var.f54128b : true;
        dxz0Var.getClass();
        return new dxz0(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxz0)) {
            return false;
        }
        dxz0 dxz0Var = (dxz0) obj;
        return this.f54127a == dxz0Var.f54127a && this.f54128b == dxz0Var.f54128b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54128b) + (Boolean.hashCode(this.f54127a) * 31);
    }

    public dxz0(boolean z, boolean z2) {
        this.f54127a = z;
        this.f54128b = z2;
    }
}
