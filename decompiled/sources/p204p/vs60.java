package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vs60 {

    /* JADX INFO: renamed from: a */
    public final us60 f244358a;

    /* JADX INFO: renamed from: b */
    public final int f244359b;

    /* JADX INFO: renamed from: c */
    public final boolean f244360c;

    /* JADX INFO: renamed from: d */
    public final boolean f244361d;

    /* JADX INFO: renamed from: e */
    public final boolean f244362e;

    public vs60(us60 us60Var, int i, boolean z, boolean z2, boolean z3) {
        this.f244358a = us60Var;
        this.f244359b = i;
        this.f244360c = z;
        this.f244361d = z2;
        this.f244362e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs60)) {
            return false;
        }
        vs60 vs60Var = (vs60) obj;
        return wj50.m88271j(this.f244358a, vs60Var.f244358a) && this.f244359b == vs60Var.f244359b && this.f244360c == vs60Var.f244360c && this.f244361d == vs60Var.f244361d && this.f244362e == vs60Var.f244362e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244362e) + s571.m77245d(s571.m77245d(f710.m40938f(this.f244359b, this.f244358a.hashCode() * 31, 31), 31, this.f244360c), 31, this.f244361d);
    }
}
