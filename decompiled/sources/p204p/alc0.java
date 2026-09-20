package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class alc0 {

    /* JADX INFO: renamed from: a */
    public final String f16844a;

    /* JADX INFO: renamed from: b */
    public final String f16845b;

    /* JADX INFO: renamed from: c */
    public final int f16846c;

    /* JADX INFO: renamed from: d */
    public final int f16847d;

    /* JADX INFO: renamed from: e */
    public final boolean f16848e;

    /* JADX INFO: renamed from: f */
    public final boolean f16849f;

    /* JADX INFO: renamed from: g */
    public final boolean f16850g;

    public alc0(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f16844a = str;
        this.f16845b = str2;
        this.f16846c = i;
        this.f16847d = i2;
        this.f16848e = z;
        this.f16849f = z2;
        this.f16850g = z3;
    }

    /* JADX INFO: renamed from: a */
    public final String m26279a() {
        return this.f16845b;
    }

    /* JADX INFO: renamed from: b */
    public final int m26280b() {
        return this.f16847d;
    }

    /* JADX INFO: renamed from: c */
    public final int m26281c() {
        return this.f16846c;
    }

    /* JADX INFO: renamed from: d */
    public final String m26282d() {
        return this.f16844a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m26283e() {
        return this.f16850g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alc0)) {
            return false;
        }
        alc0 alc0Var = (alc0) obj;
        return wj50.m88271j(this.f16844a, alc0Var.f16844a) && wj50.m88271j(this.f16845b, alc0Var.f16845b) && this.f16846c == alc0Var.f16846c && this.f16847d == alc0Var.f16847d && this.f16848e == alc0Var.f16848e && this.f16849f == alc0Var.f16849f && this.f16850g == alc0Var.f16850g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m26284f() {
        return this.f16849f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m26285g() {
        return this.f16848e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16850g) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f16847d, mt60.m62800g(this.f16846c, s571.m77243b(this.f16844a.hashCode() * 31, 31, this.f16845b), 31), 31), 31, this.f16848e), 31, this.f16849f);
    }
}
