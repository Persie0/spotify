package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xni {

    /* JADX INFO: renamed from: a */
    public final String f263620a;

    /* JADX INFO: renamed from: b */
    public final ney0 f263621b;

    /* JADX INFO: renamed from: c */
    public final lo11 f263622c;

    /* JADX INFO: renamed from: d */
    public final String f263623d;

    /* JADX INFO: renamed from: e */
    public final g081 f263624e;

    /* JADX INFO: renamed from: f */
    public final ol21 f263625f;

    /* JADX INFO: renamed from: g */
    public final boolean f263626g;

    /* JADX INFO: renamed from: h */
    public final String f263627h;

    public xni(String str, ney0 ney0Var, lo11 lo11Var, String str2, g081 g081Var, ol21 ol21Var, boolean z, String str3) {
        this.f263620a = str;
        this.f263621b = ney0Var;
        this.f263622c = lo11Var;
        this.f263623d = str2;
        this.f263624e = g081Var;
        this.f263625f = ol21Var;
        this.f263626g = z;
        this.f263627h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xni)) {
            return false;
        }
        xni xniVar = (xni) obj;
        return wj50.m88271j(this.f263620a, xniVar.f263620a) && wj50.m88271j(this.f263621b, xniVar.f263621b) && wj50.m88271j(this.f263622c, xniVar.f263622c) && wj50.m88271j(this.f263623d, xniVar.f263623d) && wj50.m88271j(this.f263624e, xniVar.f263624e) && this.f263625f == xniVar.f263625f && this.f263626g == xniVar.f263626g && wj50.m88271j(this.f263627h, xniVar.f263627h);
    }

    public final int hashCode() {
        int iHashCode = (this.f263621b.hashCode() + (this.f263620a.hashCode() * 31)) * 31;
        lo11 lo11Var = this.f263622c;
        int iHashCode2 = (iHashCode + (lo11Var == null ? 0 : lo11Var.hashCode())) * 31;
        String str = this.f263623d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        g081 g081Var = this.f263624e;
        int iHashCode4 = (iHashCode3 + (g081Var == null ? 0 : g081Var.f75311a.hashCode())) * 31;
        ol21 ol21Var = this.f263625f;
        int iM77245d = s571.m77245d((iHashCode4 + (ol21Var == null ? 0 : ol21Var.hashCode())) * 31, 31, this.f263626g);
        String str2 = this.f263627h;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
