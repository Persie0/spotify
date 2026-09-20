package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n8d1 extends p8d1 {

    /* JADX INFO: renamed from: a */
    public final String f151503a;

    /* JADX INFO: renamed from: b */
    public final String f151504b;

    /* JADX INFO: renamed from: c */
    public final String f151505c;

    /* JADX INFO: renamed from: d */
    public final String f151506d;

    /* JADX INFO: renamed from: e */
    public final boolean f151507e;

    /* JADX INFO: renamed from: f */
    public final n6f f151508f;

    public n8d1(String str, String str2, String str3, String str4, boolean z, n6f n6fVar) {
        this.f151503a = str;
        this.f151504b = str2;
        this.f151505c = str3;
        this.f151506d = str4;
        this.f151507e = z;
        this.f151508f = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8d1)) {
            return false;
        }
        n8d1 n8d1Var = (n8d1) obj;
        return wj50.m88271j(this.f151503a, n8d1Var.f151503a) && wj50.m88271j(this.f151504b, n8d1Var.f151504b) && wj50.m88271j(this.f151505c, n8d1Var.f151505c) && wj50.m88271j(this.f151506d, n8d1Var.f151506d) && this.f151507e == n8d1Var.f151507e && wj50.m88271j(this.f151508f, n8d1Var.f151508f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f151503a.hashCode() * 31, 31, this.f151504b), 31, this.f151505c), 31, this.f151506d), 31, this.f151507e);
        n6f n6fVar = this.f151508f;
        return iM77245d + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a));
    }
}
