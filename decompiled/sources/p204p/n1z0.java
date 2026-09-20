package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n1z0 {

    /* JADX INFO: renamed from: a */
    public final String f149567a;

    /* JADX INFO: renamed from: b */
    public final boolean f149568b;

    /* JADX INFO: renamed from: c */
    public final int f149569c;

    /* JADX INFO: renamed from: d */
    public final int f149570d;

    /* JADX INFO: renamed from: e */
    public final int f149571e;

    /* JADX INFO: renamed from: f */
    public final String f149572f;

    public n1z0(int i, int i2, int i3, String str, String str2, boolean z) {
        this.f149567a = str;
        this.f149568b = z;
        this.f149569c = i;
        this.f149570d = i2;
        this.f149571e = i3;
        this.f149572f = str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m63528a() {
        return this.f149570d;
    }

    /* JADX INFO: renamed from: b */
    public final String m63529b() {
        return this.f149572f;
    }

    /* JADX INFO: renamed from: c */
    public final int m63530c() {
        return this.f149571e;
    }

    /* JADX INFO: renamed from: d */
    public final int m63531d() {
        return this.f149569c;
    }

    /* JADX INFO: renamed from: e */
    public final String m63532e() {
        return this.f149567a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1z0)) {
            return false;
        }
        n1z0 n1z0Var = (n1z0) obj;
        return wj50.m88271j(this.f149567a, n1z0Var.f149567a) && this.f149568b == n1z0Var.f149568b && this.f149569c == n1z0Var.f149569c && this.f149570d == n1z0Var.f149570d && this.f149571e == n1z0Var.f149571e && wj50.m88271j(this.f149572f, n1z0Var.f149572f);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m63533f() {
        return this.f149568b;
    }

    public final int hashCode() {
        String str = this.f149567a;
        return this.f149572f.hashCode() + f710.m40938f(this.f149571e, f710.m40938f(this.f149570d, f710.m40938f(this.f149569c, s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f149568b), 31), 31), 31);
    }
}
