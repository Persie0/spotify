package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class f3c1 {

    /* JADX INFO: renamed from: a */
    public final boolean f65462a;

    /* JADX INFO: renamed from: b */
    public final boolean f65463b;

    /* JADX INFO: renamed from: c */
    public final boolean f65464c;

    /* JADX INFO: renamed from: d */
    public final gh00 f65465d;

    /* JADX INFO: renamed from: e */
    public final boolean f65466e;

    /* JADX INFO: renamed from: f */
    public final boolean f65467f;

    /* JADX INFO: renamed from: g */
    public final boolean f65468g;

    /* JADX INFO: renamed from: h */
    public final boolean f65469h;

    public f3c1(boolean z, boolean z2, boolean z3, gh00 gh00Var, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f65462a = z;
        this.f65463b = z2;
        this.f65464c = z3;
        this.f65465d = gh00Var;
        this.f65466e = z4;
        this.f65467f = z5;
        this.f65468g = z6;
        this.f65469h = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3c1)) {
            return false;
        }
        f3c1 f3c1Var = (f3c1) obj;
        return this.f65462a == f3c1Var.f65462a && this.f65463b == f3c1Var.f65463b && this.f65464c == f3c1Var.f65464c && wj50.m88271j(this.f65465d, f3c1Var.f65465d) && this.f65466e == f3c1Var.f65466e && this.f65467f == f3c1Var.f65467f && this.f65468g == f3c1Var.f65468g && this.f65469h == f3c1Var.f65469h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65469h) + s571.m77245d(s571.m77245d(s571.m77245d(m6b.m60989d(this.f65465d, s571.m77245d(s571.m77245d(Boolean.hashCode(this.f65462a) * 31, 31, this.f65463b), 31, this.f65464c), 31), 31, this.f65466e), 31, this.f65467f), 31, this.f65468g);
    }
}
