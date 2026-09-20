package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yo51 implements dp51 {

    /* JADX INFO: renamed from: a */
    public final String f274566a;

    /* JADX INFO: renamed from: b */
    public final String f274567b;

    /* JADX INFO: renamed from: c */
    public final String f274568c;

    /* JADX INFO: renamed from: d */
    public final String f274569d;

    /* JADX INFO: renamed from: e */
    public final String f274570e;

    /* JADX INFO: renamed from: f */
    public final String f274571f;

    /* JADX INFO: renamed from: g */
    public final int f274572g;

    public yo51(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f274566a = str;
        this.f274567b = str2;
        this.f274568c = str3;
        this.f274569d = str4;
        this.f274570e = str5;
        this.f274571f = str6;
        this.f274572g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo51)) {
            return false;
        }
        yo51 yo51Var = (yo51) obj;
        return wj50.m88271j(this.f274566a, yo51Var.f274566a) && wj50.m88271j(this.f274567b, yo51Var.f274567b) && wj50.m88271j(this.f274568c, yo51Var.f274568c) && wj50.m88271j(this.f274569d, yo51Var.f274569d) && wj50.m88271j(this.f274570e, yo51Var.f274570e) && wj50.m88271j(this.f274571f, yo51Var.f274571f) && this.f274572g == yo51Var.f274572g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f274566a.hashCode() * 31, 31, this.f274567b), 31, this.f274568c);
        String str = this.f274569d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f274570e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f274571f;
        return Integer.hashCode(this.f274572g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
