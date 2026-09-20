package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nj71 {

    /* JADX INFO: renamed from: a */
    public final String f154456a;

    /* JADX INFO: renamed from: b */
    public final int f154457b;

    /* JADX INFO: renamed from: c */
    public final int f154458c;

    /* JADX INFO: renamed from: d */
    public final int f154459d;

    /* JADX INFO: renamed from: e */
    public final String f154460e;

    /* JADX INFO: renamed from: f */
    public final String f154461f;

    /* JADX INFO: renamed from: g */
    public final mj71 f154462g;

    /* JADX INFO: renamed from: h */
    public final String f154463h;

    public nj71(String str, int i, int i2, int i3, String str2, String str3, mj71 mj71Var, String str4) {
        this.f154456a = str;
        this.f154457b = i;
        this.f154458c = i2;
        this.f154459d = i3;
        this.f154460e = str2;
        this.f154461f = str3;
        this.f154462g = mj71Var;
        this.f154463h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj71)) {
            return false;
        }
        nj71 nj71Var = (nj71) obj;
        return wj50.m88271j(this.f154456a, nj71Var.f154456a) && this.f154457b == nj71Var.f154457b && this.f154458c == nj71Var.f154458c && this.f154459d == nj71Var.f154459d && this.f154460e.equals(nj71Var.f154460e) && wj50.m88271j(this.f154461f, nj71Var.f154461f) && wj50.m88271j(this.f154462g, nj71Var.f154462g) && wj50.m88271j(this.f154463h, nj71Var.f154463h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(f710.m40938f(this.f154459d, mt60.m62800g(this.f154458c, f710.m40938f(this.f154457b, this.f154456a.hashCode() * 31, 31), 31), 31), 31, this.f154460e), 31, this.f154461f);
        mj71 mj71Var = this.f154462g;
        int iHashCode = (iM77243b + (mj71Var == null ? 0 : mj71Var.hashCode())) * 31;
        String str = this.f154463h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
