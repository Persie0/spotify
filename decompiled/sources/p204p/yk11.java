package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yk11 {

    /* JADX INFO: renamed from: a */
    public final String f273542a;

    /* JADX INFO: renamed from: b */
    public final String f273543b;

    /* JADX INFO: renamed from: c */
    public final String f273544c;

    /* JADX INFO: renamed from: d */
    public final String f273545d;

    /* JADX INFO: renamed from: e */
    public final String f273546e;

    /* JADX INFO: renamed from: f */
    public final String f273547f;

    /* JADX INFO: renamed from: g */
    public final String f273548g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f273549h;

    /* JADX INFO: renamed from: i */
    public final int f273550i;

    /* JADX INFO: renamed from: j */
    public final Integer f273551j;

    /* JADX INFO: renamed from: k */
    public final String f273552k;

    /* JADX INFO: renamed from: l */
    public final boolean f273553l;

    public yk11(String str, String str2, String str3, String str4, String str5, String str6, String str7, rcm0 rcm0Var, int i, Integer num, String str8, boolean z) {
        this.f273542a = str;
        this.f273543b = str2;
        this.f273544c = str3;
        this.f273545d = str4;
        this.f273546e = str5;
        this.f273547f = str6;
        this.f273548g = str7;
        this.f273549h = rcm0Var;
        this.f273550i = i;
        this.f273551j = num;
        this.f273552k = str8;
        this.f273553l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk11)) {
            return false;
        }
        yk11 yk11Var = (yk11) obj;
        return wj50.m88271j(this.f273542a, yk11Var.f273542a) && wj50.m88271j(this.f273543b, yk11Var.f273543b) && wj50.m88271j(this.f273544c, yk11Var.f273544c) && wj50.m88271j(this.f273545d, yk11Var.f273545d) && wj50.m88271j(this.f273546e, yk11Var.f273546e) && wj50.m88271j(this.f273547f, yk11Var.f273547f) && wj50.m88271j(this.f273548g, yk11Var.f273548g) && wj50.m88271j(this.f273549h, yk11Var.f273549h) && this.f273550i == yk11Var.f273550i && wj50.m88271j(this.f273551j, yk11Var.f273551j) && wj50.m88271j(this.f273552k, yk11Var.f273552k) && this.f273553l == yk11Var.f273553l;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f273550i, yds.m93483m(this.f273549h, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f273542a.hashCode() * 31, 31, this.f273543b), 31, this.f273544c), 31, this.f273545d), 31, this.f273546e), 31, this.f273547f), 31, this.f273548g), 31), 31);
        Integer num = this.f273551j;
        int iHashCode = (iM62800g + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f273552k;
        return Boolean.hashCode(this.f273553l) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
