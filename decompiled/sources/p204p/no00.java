package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class no00 {

    /* JADX INFO: renamed from: a */
    public final String f156540a;

    /* JADX INFO: renamed from: b */
    public final String f156541b;

    /* JADX INFO: renamed from: c */
    public final String f156542c;

    /* JADX INFO: renamed from: d */
    public final int f156543d;

    /* JADX INFO: renamed from: e */
    public final String f156544e;

    /* JADX INFO: renamed from: f */
    public final boolean f156545f;

    public no00(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f156540a = str;
        this.f156541b = str2;
        this.f156542c = str3;
        this.f156543d = i;
        this.f156544e = str4;
        this.f156545f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no00)) {
            return false;
        }
        no00 no00Var = (no00) obj;
        return wj50.m88271j(this.f156540a, no00Var.f156540a) && wj50.m88271j(this.f156541b, no00Var.f156541b) && wj50.m88271j(this.f156542c, no00Var.f156542c) && this.f156543d == no00Var.f156543d && wj50.m88271j(this.f156544e, no00Var.f156544e) && this.f156545f == no00Var.f156545f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f156540a.hashCode() * 31, 31, this.f156541b);
        String str = this.f156542c;
        int iM62800g = mt60.m62800g(this.f156543d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f156544e;
        return Boolean.hashCode(this.f156545f) + ((iM62800g + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
