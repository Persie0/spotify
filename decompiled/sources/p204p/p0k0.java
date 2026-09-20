package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p0k0 {

    /* JADX INFO: renamed from: a */
    public final String f172706a;

    /* JADX INFO: renamed from: b */
    public final eyj0 f172707b;

    /* JADX INFO: renamed from: c */
    public final boolean f172708c;

    /* JADX INFO: renamed from: d */
    public final boolean f172709d;

    public p0k0(String str, eyj0 eyj0Var, boolean z, boolean z2) {
        this.f172706a = str;
        this.f172707b = eyj0Var;
        this.f172708c = z;
        this.f172709d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static p0k0 m68718a(p0k0 p0k0Var, boolean z, boolean z2, int i) {
        String str = p0k0Var.f172706a;
        eyj0 eyj0Var = p0k0Var.f172707b;
        if ((i & 4) != 0) {
            z = p0k0Var.f172708c;
        }
        if ((i & 8) != 0) {
            z2 = p0k0Var.f172709d;
        }
        p0k0Var.getClass();
        return new p0k0(str, eyj0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0k0)) {
            return false;
        }
        p0k0 p0k0Var = (p0k0) obj;
        return wj50.m88271j(this.f172706a, p0k0Var.f172706a) && wj50.m88271j(this.f172707b, p0k0Var.f172707b) && this.f172708c == p0k0Var.f172708c && this.f172709d == p0k0Var.f172709d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172709d) + s571.m77245d((this.f172707b.hashCode() + (this.f172706a.hashCode() * 31)) * 31, 31, this.f172708c);
    }
}
