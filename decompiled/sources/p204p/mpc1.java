package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mpc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f145970a;

    /* JADX INFO: renamed from: b */
    public final boolean f145971b;

    /* JADX INFO: renamed from: c */
    public final boolean f145972c;

    /* JADX INFO: renamed from: d */
    public final boolean f145973d;

    /* JADX INFO: renamed from: e */
    public final boolean f145974e;

    public mpc1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f145970a = z;
        this.f145971b = z2;
        this.f145972c = z3;
        this.f145973d = z4;
        this.f145974e = z || z2 || z3 || z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpc1)) {
            return false;
        }
        mpc1 mpc1Var = (mpc1) obj;
        return this.f145970a == mpc1Var.f145970a && this.f145971b == mpc1Var.f145971b && this.f145972c == mpc1Var.f145972c && this.f145973d == mpc1Var.f145973d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145973d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f145970a) * 31, 31, this.f145971b), 31, this.f145972c);
    }
}
