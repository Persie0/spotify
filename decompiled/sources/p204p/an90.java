package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class an90 {

    /* JADX INFO: renamed from: a */
    public final String f17340a;

    /* JADX INFO: renamed from: b */
    public final String f17341b;

    /* JADX INFO: renamed from: c */
    public final String f17342c;

    /* JADX INFO: renamed from: d */
    public final String f17343d;

    /* JADX INFO: renamed from: e */
    public final bn90 f17344e;

    /* JADX INFO: renamed from: f */
    public final qn90 f17345f;

    /* JADX INFO: renamed from: g */
    public final String f17346g;

    public an90(String str, String str2, String str3, String str4, bn90 bn90Var, qn90 qn90Var, String str5, int i) {
        bn90Var = (i & 16) != 0 ? null : bn90Var;
        qn90Var = (i & 32) != 0 ? null : qn90Var;
        str5 = (i & 64) != 0 ? null : str5;
        this.f17340a = str;
        this.f17341b = str2;
        this.f17342c = str3;
        this.f17343d = str4;
        this.f17344e = bn90Var;
        this.f17345f = qn90Var;
        this.f17346g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an90)) {
            return false;
        }
        an90 an90Var = (an90) obj;
        return wj50.m88271j(this.f17340a, an90Var.f17340a) && wj50.m88271j(this.f17341b, an90Var.f17341b) && wj50.m88271j(this.f17342c, an90Var.f17342c) && wj50.m88271j(this.f17343d, an90Var.f17343d) && wj50.m88271j(this.f17344e, an90Var.f17344e) && wj50.m88271j(this.f17345f, an90Var.f17345f) && wj50.m88271j(this.f17346g, an90Var.f17346g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f17340a.hashCode() * 31, 31, this.f17341b), 31, this.f17342c), 31, this.f17343d);
        bn90 bn90Var = this.f17344e;
        int iHashCode = (iM77243b + (bn90Var == null ? 0 : bn90Var.hashCode())) * 31;
        qn90 qn90Var = this.f17345f;
        int iHashCode2 = (iHashCode + (qn90Var == null ? 0 : qn90Var.hashCode())) * 31;
        String str = this.f17346g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
