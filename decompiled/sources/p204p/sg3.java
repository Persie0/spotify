package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sg3 {

    /* JADX INFO: renamed from: a */
    public final String f208697a;

    /* JADX INFO: renamed from: b */
    public final ibj f208698b;

    /* JADX INFO: renamed from: c */
    public final tqr0 f208699c;

    /* JADX INFO: renamed from: d */
    public final boolean f208700d;

    /* JADX INFO: renamed from: e */
    public final boolean f208701e;

    /* JADX INFO: renamed from: f */
    public final String f208702f;

    /* JADX INFO: renamed from: g */
    public final boolean f208703g;

    /* JADX INFO: renamed from: h */
    public final boolean f208704h;

    public sg3(String str, ibj ibjVar, tqr0 tqr0Var, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        this.f208697a = str;
        this.f208698b = ibjVar;
        this.f208699c = tqr0Var;
        this.f208700d = z;
        this.f208701e = z2;
        this.f208702f = str2;
        this.f208703g = z3;
        this.f208704h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg3)) {
            return false;
        }
        sg3 sg3Var = (sg3) obj;
        return wj50.m88271j(this.f208697a, sg3Var.f208697a) && wj50.m88271j(this.f208698b, sg3Var.f208698b) && wj50.m88271j(this.f208699c, sg3Var.f208699c) && this.f208700d == sg3Var.f208700d && this.f208701e == sg3Var.f208701e && wj50.m88271j(this.f208702f, sg3Var.f208702f) && this.f208703g == sg3Var.f208703g && this.f208704h == sg3Var.f208704h;
    }

    public final int hashCode() {
        String str = this.f208697a;
        int iM77245d = s571.m77245d(s571.m77245d((this.f208699c.hashCode() + ((this.f208698b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31, this.f208700d), 31, this.f208701e);
        String str2 = this.f208702f;
        return Boolean.hashCode(this.f208704h) + s571.m77245d((iM77245d + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f208703g);
    }
}
