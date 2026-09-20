package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u6t0 {

    /* JADX INFO: renamed from: a */
    public final String f227428a;

    /* JADX INFO: renamed from: b */
    public final String f227429b;

    /* JADX INFO: renamed from: c */
    public final int f227430c;

    /* JADX INFO: renamed from: d */
    public final boolean f227431d;

    /* JADX INFO: renamed from: e */
    public final boolean f227432e;

    /* JADX INFO: renamed from: f */
    public final String f227433f;

    public u6t0(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.f227428a = str;
        this.f227429b = str2;
        this.f227430c = i;
        this.f227431d = z;
        this.f227432e = z2;
        this.f227433f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6t0)) {
            return false;
        }
        u6t0 u6t0Var = (u6t0) obj;
        return wj50.m88271j(this.f227428a, u6t0Var.f227428a) && wj50.m88271j(this.f227429b, u6t0Var.f227429b) && this.f227430c == u6t0Var.f227430c && this.f227431d == u6t0Var.f227431d && this.f227432e == u6t0Var.f227432e && wj50.m88271j(this.f227433f, u6t0Var.f227433f);
    }

    public final int hashCode() {
        return this.f227433f.hashCode() + s571.m77245d(s571.m77245d(mt60.m62800g(this.f227430c, s571.m77243b(this.f227428a.hashCode() * 31, 31, this.f227429b), 31), 31, this.f227431d), 31, this.f227432e);
    }
}
