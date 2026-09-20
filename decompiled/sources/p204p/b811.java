package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b811 {

    /* JADX INFO: renamed from: a */
    public final String f24453a;

    /* JADX INFO: renamed from: b */
    public final String f24454b;

    /* JADX INFO: renamed from: c */
    public final String f24455c;

    /* JADX INFO: renamed from: d */
    public final rv01 f24456d;

    /* JADX INFO: renamed from: e */
    public final int f24457e;

    /* JADX INFO: renamed from: f */
    public final yea0 f24458f;

    public b811(String str, String str2, String str3, rv01 rv01Var, yea0 yea0Var, int i) {
        rv01Var = (i & 8) != 0 ? av01.f20063a : rv01Var;
        int i2 = (i & 16) != 0 ? 1 : 2;
        yea0Var = (i & 32) != 0 ? null : yea0Var;
        this.f24453a = str;
        this.f24454b = str2;
        this.f24455c = str3;
        this.f24456d = rv01Var;
        this.f24457e = i2;
        this.f24458f = yea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b811)) {
            return false;
        }
        b811 b811Var = (b811) obj;
        return wj50.m88271j(this.f24453a, b811Var.f24453a) && wj50.m88271j(this.f24454b, b811Var.f24454b) && wj50.m88271j(this.f24455c, b811Var.f24455c) && wj50.m88271j(this.f24456d, b811Var.f24456d) && this.f24457e == b811Var.f24457e && wj50.m88271j(this.f24458f, b811Var.f24458f);
    }

    public final int hashCode() {
        int iHashCode = this.f24453a.hashCode() * 31;
        String str = this.f24454b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24455c;
        int iM40938f = f710.m40938f(this.f24457e, (this.f24456d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        yea0 yea0Var = this.f24458f;
        return iM40938f + (yea0Var != null ? yea0Var.hashCode() : 0);
    }
}
