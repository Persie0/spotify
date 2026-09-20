package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fte1 {

    /* JADX INFO: renamed from: a */
    public final boolean f73201a;

    /* JADX INFO: renamed from: b */
    public final boolean f73202b;

    /* JADX INFO: renamed from: c */
    public final boolean f73203c;

    /* JADX INFO: renamed from: d */
    public final boolean f73204d;

    public fte1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f73201a = z;
        this.f73202b = z2;
        this.f73203c = z3;
        this.f73204d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fte1)) {
            return false;
        }
        fte1 fte1Var = (fte1) obj;
        return this.f73201a == fte1Var.f73201a && this.f73202b == fte1Var.f73202b && this.f73203c == fte1Var.f73203c && this.f73204d == fte1Var.f73204d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73204d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f73201a) * 31, 31, this.f73202b), 31, this.f73203c);
    }
}
