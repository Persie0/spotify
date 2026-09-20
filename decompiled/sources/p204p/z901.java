package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z901 {

    /* JADX INFO: renamed from: a */
    public final boolean f280636a;

    /* JADX INFO: renamed from: b */
    public final boolean f280637b;

    /* JADX INFO: renamed from: c */
    public final boolean f280638c;

    public z901(boolean z, boolean z2, boolean z3) {
        this.f280636a = z;
        this.f280637b = z2;
        this.f280638c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z901)) {
            return false;
        }
        z901 z901Var = (z901) obj;
        return this.f280636a == z901Var.f280636a && this.f280637b == z901Var.f280637b && this.f280638c == z901Var.f280638c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280638c) + s571.m77245d(Boolean.hashCode(this.f280636a) * 31, 31, this.f280637b);
    }
}
