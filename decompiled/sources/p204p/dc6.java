package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dc6 {

    /* JADX INFO: renamed from: a */
    public final String f47432a;

    /* JADX INFO: renamed from: b */
    public final String f47433b;

    /* JADX INFO: renamed from: c */
    public final int f47434c;

    /* JADX INFO: renamed from: d */
    public final String f47435d;

    /* JADX INFO: renamed from: e */
    public final String f47436e;

    /* JADX INFO: renamed from: f */
    public final String f47437f;

    /* JADX INFO: renamed from: g */
    public final String f47438g;

    public dc6(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f47432a = str;
        this.f47433b = str2;
        this.f47434c = i;
        this.f47435d = str3;
        this.f47436e = str4;
        this.f47437f = str5;
        this.f47438g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc6)) {
            return false;
        }
        dc6 dc6Var = (dc6) obj;
        return wj50.m88271j(this.f47432a, dc6Var.f47432a) && wj50.m88271j(this.f47433b, dc6Var.f47433b) && this.f47434c == dc6Var.f47434c && wj50.m88271j(this.f47435d, dc6Var.f47435d) && wj50.m88271j(this.f47436e, dc6Var.f47436e) && wj50.m88271j(this.f47437f, dc6Var.f47437f) && wj50.m88271j(this.f47438g, dc6Var.f47438g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(f710.m40938f(this.f47434c, s571.m77243b(this.f47432a.hashCode() * 31, 31, this.f47433b), 31), 31, this.f47435d);
        String str = this.f47436e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f47437f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f47438g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
