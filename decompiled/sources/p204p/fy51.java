package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fy51 {

    /* JADX INFO: renamed from: a */
    public final gy51 f74528a;

    /* JADX INFO: renamed from: b */
    public final boolean f74529b;

    public fy51(gy51 gy51Var, boolean z) {
        this.f74528a = gy51Var;
        this.f74529b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy51)) {
            return false;
        }
        fy51 fy51Var = (fy51) obj;
        return wj50.m88271j(this.f74528a, fy51Var.f74528a) && this.f74529b == fy51Var.f74529b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74529b) + (this.f74528a.hashCode() * 31);
    }
}
