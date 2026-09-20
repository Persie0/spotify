package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fj81 {

    /* JADX INFO: renamed from: a */
    public final boolean f70117a;

    /* JADX INFO: renamed from: b */
    public final boolean f70118b;

    /* JADX INFO: renamed from: c */
    public final boolean f70119c;

    /* JADX INFO: renamed from: d */
    public final boolean f70120d;

    /* JADX INFO: renamed from: e */
    public final boolean f70121e;

    /* JADX INFO: renamed from: f */
    public final boolean f70122f;

    /* JADX INFO: renamed from: g */
    public final boolean f70123g;

    public fj81(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f70117a = z;
        this.f70118b = z2;
        this.f70119c = z3;
        this.f70120d = z4;
        this.f70121e = z5;
        this.f70122f = z6;
        this.f70123g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj81)) {
            return false;
        }
        fj81 fj81Var = (fj81) obj;
        return this.f70117a == fj81Var.f70117a && this.f70118b == fj81Var.f70118b && this.f70119c == fj81Var.f70119c && this.f70120d == fj81Var.f70120d && this.f70121e == fj81Var.f70121e && this.f70122f == fj81Var.f70122f && this.f70123g == fj81Var.f70123g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70123g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f70117a) * 31, 31, this.f70118b), 31, this.f70119c), 31, this.f70120d), 31, this.f70121e), 31, this.f70122f);
    }
}
