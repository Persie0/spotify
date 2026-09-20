package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r1z0 {

    /* JADX INFO: renamed from: a */
    public final String f194977a;

    /* JADX INFO: renamed from: b */
    public final qf40 f194978b;

    /* JADX INFO: renamed from: c */
    public final v64 f194979c;

    /* JADX INFO: renamed from: d */
    public final int f194980d;

    /* JADX INFO: renamed from: e */
    public final int f194981e;

    /* JADX INFO: renamed from: f */
    public final boolean f194982f;

    /* JADX INFO: renamed from: g */
    public final boolean f194983g;

    /* JADX INFO: renamed from: h */
    public final boolean f194984h;

    public r1z0(String str, qf40 qf40Var, v64 v64Var, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f194977a = str;
        this.f194978b = qf40Var;
        this.f194979c = v64Var;
        this.f194980d = i;
        this.f194981e = i2;
        this.f194982f = z;
        this.f194983g = z2;
        this.f194984h = z3;
    }

    /* JADX INFO: renamed from: a */
    public final v64 m74493a() {
        return this.f194979c;
    }

    /* JADX INFO: renamed from: b */
    public final qf40 m74494b() {
        return this.f194978b;
    }

    /* JADX INFO: renamed from: c */
    public final int m74495c() {
        return this.f194981e;
    }

    /* JADX INFO: renamed from: d */
    public final int m74496d() {
        return this.f194980d;
    }

    /* JADX INFO: renamed from: e */
    public final String m74497e() {
        return this.f194977a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1z0)) {
            return false;
        }
        r1z0 r1z0Var = (r1z0) obj;
        return wj50.m88271j(this.f194977a, r1z0Var.f194977a) && wj50.m88271j(this.f194978b, r1z0Var.f194978b) && this.f194979c == r1z0Var.f194979c && this.f194980d == r1z0Var.f194980d && this.f194981e == r1z0Var.f194981e && this.f194982f == r1z0Var.f194982f && this.f194983g == r1z0Var.f194983g && this.f194984h == r1z0Var.f194984h;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m74498f() {
        return this.f194983g;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m74499g() {
        return this.f194984h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m74500h() {
        return this.f194982f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194984h) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f194981e, f710.m40938f(this.f194980d, (this.f194979c.hashCode() + fr0.m42461e(this.f194978b, this.f194977a.hashCode() * 31, 31)) * 31, 31), 31), 31, this.f194982f), 31, this.f194983g);
    }
}
