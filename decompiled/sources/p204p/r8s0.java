package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r8s0 {

    /* JADX INFO: renamed from: a */
    public final int f196830a;

    /* JADX INFO: renamed from: b */
    public final boolean f196831b;

    public r8s0(int i, boolean z) {
        this.f196830a = i;
        this.f196831b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8s0.class != obj.getClass()) {
            return false;
        }
        r8s0 r8s0Var = (r8s0) obj;
        return this.f196830a == r8s0Var.f196830a && this.f196831b == r8s0Var.f196831b;
    }

    public final int hashCode() {
        return (this.f196830a * 31) + (this.f196831b ? 1 : 0);
    }
}
