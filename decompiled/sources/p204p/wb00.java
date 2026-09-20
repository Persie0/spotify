package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wb00 {

    /* JADX INFO: renamed from: a */
    public final String f249652a;

    /* JADX INFO: renamed from: b */
    public final String f249653b;

    /* JADX INFO: renamed from: c */
    public final String f249654c;

    /* JADX INFO: renamed from: d */
    public final String f249655d;

    /* JADX INFO: renamed from: e */
    public final String f249656e;

    /* JADX INFO: renamed from: f */
    public final boolean f249657f;

    /* JADX INFO: renamed from: g */
    public final boolean f249658g;

    public wb00(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f249652a = str;
        this.f249653b = str2;
        this.f249654c = str3;
        this.f249655d = str4;
        this.f249656e = str5;
        this.f249657f = z;
        this.f249658g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb00)) {
            return false;
        }
        wb00 wb00Var = (wb00) obj;
        return wj50.m88271j(this.f249652a, wb00Var.f249652a) && wj50.m88271j(this.f249653b, wb00Var.f249653b) && wj50.m88271j(this.f249654c, wb00Var.f249654c) && wj50.m88271j(this.f249655d, wb00Var.f249655d) && wj50.m88271j(this.f249656e, wb00Var.f249656e) && this.f249657f == wb00Var.f249657f && this.f249658g == wb00Var.f249658g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f249652a.hashCode() * 31, 31, this.f249653b);
        String str = this.f249654c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f249655d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f249656e;
        return Boolean.hashCode(this.f249658g) + s571.m77245d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f249657f);
    }
}
