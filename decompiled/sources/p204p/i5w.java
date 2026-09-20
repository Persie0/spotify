package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i5w {

    /* JADX INFO: renamed from: a */
    public final String f99033a;

    /* JADX INFO: renamed from: b */
    public final String f99034b;

    /* JADX INFO: renamed from: c */
    public final String f99035c;

    /* JADX INFO: renamed from: d */
    public final String f99036d;

    /* JADX INFO: renamed from: e */
    public final String f99037e;

    /* JADX INFO: renamed from: f */
    public final String f99038f;

    /* JADX INFO: renamed from: g */
    public final String f99039g;

    /* JADX INFO: renamed from: h */
    public final qsj f99040h;

    /* JADX INFO: renamed from: i */
    public final int f99041i;

    /* JADX INFO: renamed from: j */
    public final boolean f99042j;

    /* JADX INFO: renamed from: k */
    public final boolean f99043k;

    /* JADX INFO: renamed from: l */
    public final ks00 f99044l;

    /* JADX INFO: renamed from: m */
    public final String f99045m;

    /* JADX INFO: renamed from: n */
    public final o9c1 f99046n;

    public i5w(String str, String str2, String str3, String str4, String str5, String str6, String str7, qsj qsjVar, int i, boolean z, boolean z2, ks00 ks00Var, String str8, o9c1 o9c1Var) {
        this.f99033a = str;
        this.f99034b = str2;
        this.f99035c = str3;
        this.f99036d = str4;
        this.f99037e = str5;
        this.f99038f = str6;
        this.f99039g = str7;
        this.f99040h = qsjVar;
        this.f99041i = i;
        this.f99042j = z;
        this.f99043k = z2;
        this.f99044l = ks00Var;
        this.f99045m = str8;
        this.f99046n = o9c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5w)) {
            return false;
        }
        i5w i5wVar = (i5w) obj;
        return wj50.m88271j(this.f99033a, i5wVar.f99033a) && wj50.m88271j(this.f99034b, i5wVar.f99034b) && wj50.m88271j(this.f99035c, i5wVar.f99035c) && wj50.m88271j(this.f99036d, i5wVar.f99036d) && wj50.m88271j(this.f99037e, i5wVar.f99037e) && wj50.m88271j(this.f99038f, i5wVar.f99038f) && wj50.m88271j(this.f99039g, i5wVar.f99039g) && this.f99040h == i5wVar.f99040h && this.f99041i == i5wVar.f99041i && this.f99042j == i5wVar.f99042j && this.f99043k == i5wVar.f99043k && wj50.m88271j(this.f99044l, i5wVar.f99044l) && wj50.m88271j(this.f99045m, i5wVar.f99045m) && wj50.m88271j(this.f99046n, i5wVar.f99046n);
    }

    public final int hashCode() {
        int iHashCode = this.f99033a.hashCode() * 31;
        String str = this.f99034b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99035c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99036d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f99037e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f99038f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f99039g;
        int iM91401j = xl81.m91401j(this.f99040h, (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        int i = this.f99041i;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM91401j + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31, true), 31, false), 31, this.f99042j), 31, this.f99043k);
        ks00 ks00Var = this.f99044l;
        int iHashCode7 = (iM77245d + (ks00Var == null ? 0 : ks00Var.hashCode())) * 31;
        String str7 = this.f99045m;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        o9c1 o9c1Var = this.f99046n;
        return iHashCode8 + (o9c1Var != null ? o9c1Var.hashCode() : 0);
    }
}
