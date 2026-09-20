package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p2s0 {

    /* JADX INFO: renamed from: a */
    public final String f173428a;

    /* JADX INFO: renamed from: b */
    public final String f173429b;

    /* JADX INFO: renamed from: c */
    public final boolean f173430c;

    /* JADX INFO: renamed from: d */
    public final bii0 f173431d;

    /* JADX INFO: renamed from: e */
    public final boolean f173432e;

    public p2s0(String str, String str2, boolean z, bii0 bii0Var, boolean z2) {
        this.f173428a = str;
        this.f173429b = str2;
        this.f173430c = z;
        this.f173431d = bii0Var;
        this.f173432e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2s0)) {
            return false;
        }
        p2s0 p2s0Var = (p2s0) obj;
        return wj50.m88271j(this.f173428a, p2s0Var.f173428a) && wj50.m88271j(this.f173429b, p2s0Var.f173429b) && this.f173430c == p2s0Var.f173430c && this.f173431d.equals(p2s0Var.f173431d) && this.f173432e == p2s0Var.f173432e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173432e) + ((this.f173431d.hashCode() + s571.m77245d(s571.m77243b(this.f173428a.hashCode() * 31, 31, this.f173429b), 31, this.f173430c)) * 31);
    }
}
