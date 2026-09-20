package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z4p0 {

    /* JADX INFO: renamed from: a */
    public final boolean f279319a;

    /* JADX INFO: renamed from: b */
    public final boolean f279320b;

    public z4p0(boolean z, boolean z2) {
        this.f279319a = z;
        this.f279320b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4p0)) {
            return false;
        }
        z4p0 z4p0Var = (z4p0) obj;
        return this.f279319a == z4p0Var.f279319a && this.f279320b == z4p0Var.f279320b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279320b) + (Boolean.hashCode(this.f279319a) * 31);
    }
}
