package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f9r0 extends g9r0 {

    /* JADX INFO: renamed from: a */
    public final String f67329a;

    /* JADX INFO: renamed from: b */
    public final String f67330b;

    /* JADX INFO: renamed from: c */
    public final boolean f67331c;

    /* JADX INFO: renamed from: d */
    public final boolean f67332d;

    public f9r0(String str, boolean z, String str2, boolean z2) {
        this.f67329a = str;
        this.f67330b = str2;
        this.f67331c = z;
        this.f67332d = z2;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: a */
    public final String mo25163a() {
        return this.f67330b;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo25164b() {
        return this.f67332d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9r0)) {
            return false;
        }
        f9r0 f9r0Var = (f9r0) obj;
        return wj50.m88271j(this.f67329a, f9r0Var.f67329a) && wj50.m88271j(this.f67330b, f9r0Var.f67330b) && this.f67331c == f9r0Var.f67331c && this.f67332d == f9r0Var.f67332d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67332d) + s571.m77245d(s571.m77243b(this.f67329a.hashCode() * 31, 31, this.f67330b), 31, this.f67331c);
    }
}
