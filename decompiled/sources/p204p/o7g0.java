package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o7g0 implements p7g0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f162548a;

    /* JADX INFO: renamed from: b */
    public final int f162549b;

    /* JADX INFO: renamed from: c */
    public final boolean f162550c;

    /* JADX INFO: renamed from: d */
    public final boolean f162551d;

    /* JADX INFO: renamed from: e */
    public final int f162552e;

    public /* synthetic */ o7g0(lb81 lb81Var, int i, boolean z) {
        this(lb81Var, i, z, false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7g0)) {
            return false;
        }
        o7g0 o7g0Var = (o7g0) obj;
        return this.f162548a == o7g0Var.f162548a && this.f162549b == o7g0Var.f162549b && this.f162550c == o7g0Var.f162550c && this.f162551d == o7g0Var.f162551d && this.f162552e == o7g0Var.f162552e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162552e) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f162549b, this.f162548a.hashCode() * 31, 31), 31, this.f162550c), 31, this.f162551d);
    }

    public o7g0(lb81 lb81Var, int i, boolean z, boolean z2, int i2) {
        this.f162548a = lb81Var;
        this.f162549b = i;
        this.f162550c = z;
        this.f162551d = z2;
        this.f162552e = i2;
    }
}
