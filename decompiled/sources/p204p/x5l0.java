package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x5l0 implements z5l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f258470a;

    /* JADX INFO: renamed from: b */
    public final boolean f258471b;

    public x5l0(boolean z, boolean z2) {
        this.f258470a = z;
        this.f258471b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5l0)) {
            return false;
        }
        x5l0 x5l0Var = (x5l0) obj;
        return this.f258470a == x5l0Var.f258470a && this.f258471b == x5l0Var.f258471b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258471b) + (Boolean.hashCode(this.f258470a) * 31);
    }
}
