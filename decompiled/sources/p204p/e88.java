package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e88 {

    /* JADX INFO: renamed from: a */
    public final c8o0 f57099a;

    /* JADX INFO: renamed from: b */
    public final int f57100b;

    /* JADX INFO: renamed from: c */
    public final boolean f57101c;

    /* JADX INFO: renamed from: d */
    public final String f57102d;

    public e88(c8o0 c8o0Var, int i, boolean z, String str) {
        this.f57099a = c8o0Var;
        this.f57100b = i;
        this.f57101c = z;
        this.f57102d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e88)) {
            return false;
        }
        e88 e88Var = (e88) obj;
        return wj50.m88271j(this.f57099a, e88Var.f57099a) && this.f57100b == e88Var.f57100b && this.f57101c == e88Var.f57101c && wj50.m88271j(this.f57102d, e88Var.f57102d);
    }

    public final int hashCode() {
        return this.f57102d.hashCode() + s571.m77245d(mt60.m62800g(this.f57100b, this.f57099a.hashCode() * 31, 31), 31, this.f57101c);
    }
}
