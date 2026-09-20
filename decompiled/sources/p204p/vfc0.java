package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vfc0 {

    /* JADX INFO: renamed from: a */
    public final String f240935a;

    /* JADX INFO: renamed from: b */
    public final String f240936b;

    /* JADX INFO: renamed from: c */
    public final String f240937c;

    /* JADX INFO: renamed from: d */
    public final boolean f240938d;

    /* JADX INFO: renamed from: e */
    public final qf40 f240939e;

    /* JADX INFO: renamed from: f */
    public final String f240940f;

    /* JADX INFO: renamed from: g */
    public final String f240941g;

    /* JADX INFO: renamed from: h */
    public final Integer f240942h;

    /* JADX INFO: renamed from: i */
    public final long f240943i;

    /* JADX INFO: renamed from: j */
    public final long f240944j;

    /* JADX INFO: renamed from: k */
    public final boolean f240945k;

    /* JADX INFO: renamed from: l */
    public final eh00 f240946l;

    /* JADX INFO: renamed from: m */
    public final Integer f240947m;

    /* JADX INFO: renamed from: n */
    public final Integer f240948n;

    /* JADX INFO: renamed from: o */
    public final gu5 f240949o;

    public vfc0(String str, String str2, String str3, boolean z, qf40 qf40Var, String str4, String str5, Integer num, long j, long j2, boolean z2, eh00 eh00Var, Integer num2, Integer num3, gu5 gu5Var) {
        this.f240935a = str;
        this.f240936b = str2;
        this.f240937c = str3;
        this.f240938d = z;
        this.f240939e = qf40Var;
        this.f240940f = str4;
        this.f240941g = str5;
        this.f240942h = num;
        this.f240943i = j;
        this.f240944j = j2;
        this.f240945k = z2;
        this.f240946l = eh00Var;
        this.f240947m = num2;
        this.f240948n = num3;
        this.f240949o = gu5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfc0)) {
            return false;
        }
        vfc0 vfc0Var = (vfc0) obj;
        if (!wj50.m88271j(this.f240935a, vfc0Var.f240935a) || !wj50.m88271j(this.f240936b, vfc0Var.f240936b) || !wj50.m88271j(this.f240937c, vfc0Var.f240937c) || this.f240938d != vfc0Var.f240938d || !wj50.m88271j(this.f240939e, vfc0Var.f240939e) || !wj50.m88271j(this.f240940f, vfc0Var.f240940f) || !wj50.m88271j(this.f240941g, vfc0Var.f240941g) || !wj50.m88271j(this.f240942h, vfc0Var.f240942h)) {
            return false;
        }
        long j = vfc0Var.f240943i;
        int i = n6f.f150872l;
        return as91.m27074b(this.f240943i, j) && as91.m27074b(this.f240944j, vfc0Var.f240944j) && this.f240945k == vfc0Var.f240945k && wj50.m88271j(this.f240946l, vfc0Var.f240946l) && wj50.m88271j(this.f240947m, vfc0Var.f240947m) && wj50.m88271j(this.f240948n, vfc0Var.f240948n) && wj50.m88271j(this.f240949o, vfc0Var.f240949o);
    }

    public final int hashCode() {
        String str = this.f240935a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f240936b);
        String str2 = this.f240937c;
        int iM77243b2 = s571.m77243b(fr0.m42461e(this.f240939e, s571.m77245d((iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f240938d), 31), 31, this.f240940f);
        String str3 = this.f240941g;
        int iHashCode = (iM77243b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f240942h;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        int i = n6f.f150872l;
        int iM77245d = s571.m77245d(dq60.m36605e(dq60.m36605e(iHashCode2, this.f240943i, 31), this.f240944j, 31), 31, this.f240945k);
        eh00 eh00Var = this.f240946l;
        int iHashCode3 = (iM77245d + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31;
        Integer num2 = this.f240947m;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f240948n;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        gu5 gu5Var = this.f240949o;
        return iHashCode5 + (gu5Var != null ? gu5Var.hashCode() : 0);
    }
}
