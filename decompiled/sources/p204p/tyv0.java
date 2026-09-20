package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tyv0 {

    /* JADX INFO: renamed from: a */
    public final String f225058a;

    /* JADX INFO: renamed from: b */
    public final String f225059b;

    /* JADX INFO: renamed from: c */
    public final String f225060c;

    /* JADX INFO: renamed from: d */
    public final String f225061d;

    /* JADX INFO: renamed from: e */
    public final boolean f225062e;

    /* JADX INFO: renamed from: f */
    public final boolean f225063f;

    /* JADX INFO: renamed from: g */
    public final String f225064g;

    /* JADX INFO: renamed from: h */
    public final boolean f225065h;

    /* JADX INFO: renamed from: i */
    public final boolean f225066i;

    public tyv0(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f225058a = str;
        this.f225059b = str2;
        this.f225060c = str3;
        this.f225061d = str4;
        this.f225062e = z;
        this.f225063f = z2;
        this.f225064g = str5;
        this.f225065h = z3;
        this.f225066i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyv0)) {
            return false;
        }
        tyv0 tyv0Var = (tyv0) obj;
        return wj50.m88271j(this.f225058a, tyv0Var.f225058a) && wj50.m88271j(this.f225059b, tyv0Var.f225059b) && wj50.m88271j(this.f225060c, tyv0Var.f225060c) && wj50.m88271j(this.f225061d, tyv0Var.f225061d) && this.f225062e == tyv0Var.f225062e && this.f225063f == tyv0Var.f225063f && wj50.m88271j(this.f225064g, tyv0Var.f225064g) && this.f225065h == tyv0Var.f225065h && this.f225066i == tyv0Var.f225066i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f225058a.hashCode() * 31, 31, this.f225059b), 31, this.f225060c);
        String str = this.f225061d;
        int iM77245d = s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f225062e), 31, this.f225063f);
        String str2 = this.f225064g;
        return Boolean.hashCode(this.f225066i) + s571.m77245d((iM77245d + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f225065h);
    }
}
