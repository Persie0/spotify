package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bxr0 {

    /* JADX INFO: renamed from: a */
    public final zwr0 f31970a;

    /* JADX INFO: renamed from: b */
    public final nmr0 f31971b;

    /* JADX INFO: renamed from: c */
    public final boolean f31972c;

    /* JADX INFO: renamed from: d */
    public final boolean f31973d;

    /* JADX INFO: renamed from: e */
    public final String f31974e;

    /* JADX INFO: renamed from: f */
    public final gh00 f31975f;

    /* JADX INFO: renamed from: g */
    public final eh00 f31976g;

    /* JADX INFO: renamed from: h */
    public final gh00 f31977h;

    /* JADX INFO: renamed from: i */
    public final eh00 f31978i;

    public bxr0(zwr0 zwr0Var, nmr0 nmr0Var, boolean z, boolean z2, String str, gh00 gh00Var, eh00 eh00Var, gh00 gh00Var2, eh00 eh00Var2) {
        this.f31970a = zwr0Var;
        this.f31971b = nmr0Var;
        this.f31972c = z;
        this.f31973d = z2;
        this.f31974e = str;
        this.f31975f = gh00Var;
        this.f31976g = eh00Var;
        this.f31977h = gh00Var2;
        this.f31978i = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxr0)) {
            return false;
        }
        bxr0 bxr0Var = (bxr0) obj;
        return this.f31970a.equals(bxr0Var.f31970a) && this.f31971b.equals(bxr0Var.f31971b) && this.f31972c == bxr0Var.f31972c && this.f31973d == bxr0Var.f31973d && wj50.m88271j(this.f31974e, bxr0Var.f31974e) && wj50.m88271j(this.f31975f, bxr0Var.f31975f) && wj50.m88271j(this.f31976g, bxr0Var.f31976g) && wj50.m88271j(this.f31977h, bxr0Var.f31977h) && wj50.m88271j(this.f31978i, bxr0Var.f31978i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f31971b.hashCode() + (this.f31970a.hashCode() * 31)) * 31, 31, this.f31972c), 31, this.f31973d);
        String str = this.f31974e;
        return this.f31978i.hashCode() + m6b.m60989d(this.f31977h, p1v.m68853j(m6b.m60989d(this.f31975f, (iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31), this.f31976g, 31), 31);
    }
}
