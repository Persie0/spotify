package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b131 {

    /* JADX INFO: renamed from: a */
    public final r431 f22202a;

    /* JADX INFO: renamed from: b */
    public final r431 f22203b;

    /* JADX INFO: renamed from: c */
    public final int f22204c;

    /* JADX INFO: renamed from: d */
    public final boolean f22205d;

    /* JADX INFO: renamed from: e */
    public final boolean f22206e;

    public b131(r431 r431Var, r431 r431Var2, int i, boolean z, boolean z2) {
        this.f22202a = r431Var;
        this.f22203b = r431Var2;
        this.f22204c = i;
        this.f22205d = z;
        this.f22206e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b131)) {
            return false;
        }
        b131 b131Var = (b131) obj;
        return this.f22202a == b131Var.f22202a && this.f22203b == b131Var.f22203b && this.f22204c == b131Var.f22204c && this.f22205d == b131Var.f22205d && this.f22206e == b131Var.f22206e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22206e) + s571.m77245d(s571.m77245d(f710.m40938f(this.f22204c, (this.f22203b.hashCode() + (this.f22202a.hashCode() * 31)) * 31, 31), 31, this.f22205d), 31, true);
    }
}
