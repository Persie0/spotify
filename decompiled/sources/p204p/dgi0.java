package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dgi0 {

    /* JADX INFO: renamed from: a */
    public final String f48806a;

    /* JADX INFO: renamed from: b */
    public final int f48807b;

    /* JADX INFO: renamed from: c */
    public final int f48808c;

    /* JADX INFO: renamed from: d */
    public final String f48809d;

    /* JADX INFO: renamed from: e */
    public final boolean f48810e;

    /* JADX INFO: renamed from: f */
    public final boolean f48811f;

    public dgi0(boolean z, boolean z2, int i, String str, String str2, int i2) {
        this.f48806a = str;
        this.f48807b = i;
        this.f48808c = i2;
        this.f48809d = str2;
        this.f48810e = z;
        this.f48811f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgi0)) {
            return false;
        }
        dgi0 dgi0Var = (dgi0) obj;
        return wj50.m88271j(this.f48806a, dgi0Var.f48806a) && this.f48807b == dgi0Var.f48807b && this.f48808c == dgi0Var.f48808c && wj50.m88271j(this.f48809d, dgi0Var.f48809d) && this.f48810e == dgi0Var.f48810e && this.f48811f == dgi0Var.f48811f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48811f) + s571.m77245d(s571.m77243b(mt60.m62800g(this.f48808c, mt60.m62800g(this.f48807b, this.f48806a.hashCode() * 31, 31), 31), 31, this.f48809d), 31, this.f48810e);
    }
}
