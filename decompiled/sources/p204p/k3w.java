package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k3w {

    /* JADX INFO: renamed from: a */
    public final boolean f118979a;

    /* JADX INFO: renamed from: b */
    public final String f118980b;

    /* JADX INFO: renamed from: c */
    public final String f118981c;

    /* JADX INFO: renamed from: d */
    public final String f118982d;

    /* JADX INFO: renamed from: e */
    public final String f118983e;

    /* JADX INFO: renamed from: f */
    public final String f118984f;

    /* JADX INFO: renamed from: g */
    public final String f118985g;

    /* JADX INFO: renamed from: h */
    public final boolean f118986h;

    /* JADX INFO: renamed from: i */
    public final int f118987i;

    /* JADX INFO: renamed from: j */
    public final yzv f118988j;

    /* JADX INFO: renamed from: k */
    public final boolean f118989k;

    public k3w(boolean z, String str, String str2, String str3, String str4, String str5, String str6, boolean z2, int i, yzv yzvVar, boolean z3) {
        this.f118979a = z;
        this.f118980b = str;
        this.f118981c = str2;
        this.f118982d = str3;
        this.f118983e = str4;
        this.f118984f = str5;
        this.f118985g = str6;
        this.f118986h = z2;
        this.f118987i = i;
        this.f118988j = yzvVar;
        this.f118989k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3w)) {
            return false;
        }
        k3w k3wVar = (k3w) obj;
        return this.f118979a == k3wVar.f118979a && wj50.m88271j(this.f118980b, k3wVar.f118980b) && this.f118981c.equals(k3wVar.f118981c) && this.f118982d.equals(k3wVar.f118982d) && this.f118983e.equals(k3wVar.f118983e) && this.f118984f.equals(k3wVar.f118984f) && wj50.m88271j(this.f118985g, k3wVar.f118985g) && this.f118986h == k3wVar.f118986h && this.f118987i == k3wVar.f118987i && this.f118988j == k3wVar.f118988j && this.f118989k == k3wVar.f118989k;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f118979a) * 31, 31, this.f118980b), 31, this.f118981c), 31, this.f118982d), 31, this.f118983e), 31, this.f118984f);
        String str = this.f118985g;
        return Boolean.hashCode(this.f118989k) + ((this.f118988j.hashCode() + f710.m40938f(this.f118987i, s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f118986h), 31)) * 31);
    }
}
