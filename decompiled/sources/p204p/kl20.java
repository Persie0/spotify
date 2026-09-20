package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kl20 {

    /* JADX INFO: renamed from: a */
    public final String f123780a;

    /* JADX INFO: renamed from: b */
    public final boolean f123781b;

    /* JADX INFO: renamed from: c */
    public final String f123782c;

    /* JADX INFO: renamed from: d */
    public final String f123783d;

    /* JADX INFO: renamed from: e */
    public final boolean f123784e;

    /* JADX INFO: renamed from: f */
    public final boolean f123785f;

    /* JADX INFO: renamed from: g */
    public final tqr0 f123786g;

    /* JADX INFO: renamed from: h */
    public final boolean f123787h;

    /* JADX INFO: renamed from: i */
    public final h7z f123788i;

    public kl20(String str, boolean z, String str2, String str3, boolean z2, boolean z3, tqr0 tqr0Var, boolean z4, h7z h7zVar) {
        this.f123780a = str;
        this.f123781b = z;
        this.f123782c = str2;
        this.f123783d = str3;
        this.f123784e = z2;
        this.f123785f = z3;
        this.f123786g = tqr0Var;
        this.f123787h = z4;
        this.f123788i = h7zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl20)) {
            return false;
        }
        kl20 kl20Var = (kl20) obj;
        return wj50.m88271j(this.f123780a, kl20Var.f123780a) && this.f123781b == kl20Var.f123781b && wj50.m88271j(this.f123782c, kl20Var.f123782c) && wj50.m88271j(this.f123783d, kl20Var.f123783d) && this.f123784e == kl20Var.f123784e && this.f123785f == kl20Var.f123785f && wj50.m88271j(this.f123786g, kl20Var.f123786g) && this.f123787h == kl20Var.f123787h && wj50.m88271j(this.f123788i, kl20Var.f123788i);
    }

    public final int hashCode() {
        String str = this.f123780a;
        int iM77245d = s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f123781b);
        String str2 = this.f123782c;
        int iHashCode = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f123783d;
        return this.f123788i.hashCode() + s571.m77245d((this.f123786g.hashCode() + s571.m77245d(s571.m77245d((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f123784e), 31, this.f123785f)) * 31, 31, this.f123787h);
    }
}
