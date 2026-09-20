package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dyt0 {

    /* JADX INFO: renamed from: a */
    public final String f54442a;

    /* JADX INFO: renamed from: b */
    public final boolean f54443b;

    /* JADX INFO: renamed from: c */
    public final boolean f54444c;

    /* JADX INFO: renamed from: d */
    public final c0u0 f54445d;

    static {
        c0u0 c0u0Var = c0u0.f32868i;
    }

    public dyt0(String str, boolean z, boolean z2, c0u0 c0u0Var) {
        this.f54442a = str;
        this.f54443b = z;
        this.f54444c = z2;
        this.f54445d = c0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyt0)) {
            return false;
        }
        dyt0 dyt0Var = (dyt0) obj;
        return this.f54442a.equals(dyt0Var.f54442a) && this.f54443b == dyt0Var.f54443b && this.f54444c == dyt0Var.f54444c && wj50.m88271j(this.f54445d, dyt0Var.f54445d);
    }

    public final int hashCode() {
        return this.f54445d.hashCode() + s571.m77245d(s571.m77245d(this.f54442a.hashCode() * 31, 31, this.f54443b), 31, this.f54444c);
    }
}
