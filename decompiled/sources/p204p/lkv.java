package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lkv {

    /* JADX INFO: renamed from: a */
    public final String f134456a;

    /* JADX INFO: renamed from: b */
    public final String f134457b;

    /* JADX INFO: renamed from: c */
    public final String f134458c;

    /* JADX INFO: renamed from: d */
    public final String f134459d;

    /* JADX INFO: renamed from: e */
    public final String f134460e;

    /* JADX INFO: renamed from: f */
    public final int f134461f;

    /* JADX INFO: renamed from: g */
    public final mto0 f134462g;

    public lkv(String str, String str2, String str3, String str4, String str5, int i, mto0 mto0Var) {
        this.f134456a = str;
        this.f134457b = str2;
        this.f134458c = str3;
        this.f134459d = str4;
        this.f134460e = str5;
        this.f134461f = i;
        this.f134462g = mto0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkv)) {
            return false;
        }
        lkv lkvVar = (lkv) obj;
        return wj50.m88271j(this.f134456a, lkvVar.f134456a) && wj50.m88271j(this.f134457b, lkvVar.f134457b) && wj50.m88271j(this.f134458c, lkvVar.f134458c) && this.f134459d.equals(lkvVar.f134459d) && wj50.m88271j(this.f134460e, lkvVar.f134460e) && this.f134461f == lkvVar.f134461f && this.f134462g == lkvVar.f134462g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f134456a.hashCode() * 31, 31, this.f134457b), 31, this.f134458c), 31, this.f134459d);
        String str = this.f134460e;
        return this.f134462g.hashCode() + f710.m40938f(this.f134461f, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
