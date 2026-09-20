package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kzz0 {

    /* JADX INFO: renamed from: a */
    public final int f128236a;

    /* JADX INFO: renamed from: b */
    public final boolean f128237b;

    /* JADX INFO: renamed from: c */
    public final boolean f128238c;

    /* JADX INFO: renamed from: d */
    public final boolean f128239d;

    /* JADX INFO: renamed from: e */
    public final boolean f128240e;

    public kzz0(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f128236a = i;
        this.f128237b = z;
        this.f128238c = z2;
        this.f128239d = z3;
        this.f128240e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzz0)) {
            return false;
        }
        kzz0 kzz0Var = (kzz0) obj;
        return this.f128236a == kzz0Var.f128236a && this.f128237b == kzz0Var.f128237b && this.f128238c == kzz0Var.f128238c && this.f128239d == kzz0Var.f128239d && this.f128240e == kzz0Var.f128240e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128240e) + s571.m77245d(s571.m77245d(s571.m77245d(edb.m38547C(this.f128236a) * 31, 31, this.f128237b), 31, this.f128238c), 31, this.f128239d);
    }
}
