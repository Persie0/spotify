package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r8c0 {

    /* JADX INFO: renamed from: a */
    public final String f196763a;

    /* JADX INFO: renamed from: b */
    public final z5c0 f196764b;

    /* JADX INFO: renamed from: c */
    public final boolean f196765c;

    /* JADX INFO: renamed from: d */
    public final boolean f196766d;

    /* JADX INFO: renamed from: e */
    public final Boolean f196767e;

    public r8c0(String str, z5c0 z5c0Var, boolean z, boolean z2, Boolean bool) {
        this.f196763a = str;
        this.f196764b = z5c0Var;
        this.f196765c = z;
        this.f196766d = z2;
        this.f196767e = bool;
    }

    /* JADX INFO: renamed from: a */
    public static r8c0 m74979a(r8c0 r8c0Var, boolean z, boolean z2, Boolean bool) {
        String str = r8c0Var.f196763a;
        z5c0 z5c0Var = r8c0Var.f196764b;
        r8c0Var.getClass();
        return new r8c0(str, z5c0Var, z, z2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8c0)) {
            return false;
        }
        r8c0 r8c0Var = (r8c0) obj;
        return wj50.m88271j(this.f196763a, r8c0Var.f196763a) && this.f196764b == r8c0Var.f196764b && this.f196765c == r8c0Var.f196765c && this.f196766d == r8c0Var.f196766d && wj50.m88271j(this.f196767e, r8c0Var.f196767e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f196764b.hashCode() + (this.f196763a.hashCode() * 31)) * 31, 31, this.f196765c), 31, this.f196766d);
        Boolean bool = this.f196767e;
        return iM77245d + (bool == null ? 0 : bool.hashCode());
    }
}
