package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o1r0 {

    /* JADX INFO: renamed from: a */
    public final z2r0 f160836a;

    /* JADX INFO: renamed from: b */
    public final y2r0 f160837b;

    /* JADX INFO: renamed from: c */
    public final boolean f160838c;

    public o1r0(z2r0 z2r0Var, y2r0 y2r0Var, boolean z) {
        this.f160836a = z2r0Var;
        this.f160837b = y2r0Var;
        this.f160838c = z;
    }

    /* JADX INFO: renamed from: a */
    public static o1r0 m66079a(o1r0 o1r0Var, y2r0 y2r0Var, boolean z, int i) {
        z2r0 z2r0Var = o1r0Var.f160836a;
        if ((i & 2) != 0) {
            y2r0Var = o1r0Var.f160837b;
        }
        o1r0Var.getClass();
        return new o1r0(z2r0Var, y2r0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1r0)) {
            return false;
        }
        o1r0 o1r0Var = (o1r0) obj;
        return wj50.m88271j(this.f160836a, o1r0Var.f160836a) && wj50.m88271j(this.f160837b, o1r0Var.f160837b) && this.f160838c == o1r0Var.f160838c;
    }

    public final int hashCode() {
        int iHashCode = this.f160836a.hashCode() * 31;
        y2r0 y2r0Var = this.f160837b;
        return Boolean.hashCode(this.f160838c) + ((iHashCode + (y2r0Var == null ? 0 : y2r0Var.hashCode())) * 31);
    }
}
