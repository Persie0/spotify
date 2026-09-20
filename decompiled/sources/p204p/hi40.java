package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hi40 {

    /* JADX INFO: renamed from: a */
    public final String f91692a;

    /* JADX INFO: renamed from: b */
    public final String f91693b;

    /* JADX INFO: renamed from: c */
    public final String f91694c;

    /* JADX INFO: renamed from: d */
    public final String f91695d;

    /* JADX INFO: renamed from: e */
    public final String f91696e;

    /* JADX INFO: renamed from: f */
    public final String f91697f;

    /* JADX INFO: renamed from: g */
    public final int f91698g;

    public hi40(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f91692a = str;
        this.f91693b = str2;
        this.f91694c = str3;
        this.f91695d = str4;
        this.f91696e = str5;
        this.f91697f = str6;
        this.f91698g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi40)) {
            return false;
        }
        hi40 hi40Var = (hi40) obj;
        return wj50.m88271j(this.f91692a, hi40Var.f91692a) && wj50.m88271j(this.f91693b, hi40Var.f91693b) && wj50.m88271j(this.f91694c, hi40Var.f91694c) && wj50.m88271j(this.f91695d, hi40Var.f91695d) && wj50.m88271j(this.f91696e, hi40Var.f91696e) && wj50.m88271j(this.f91697f, hi40Var.f91697f) && this.f91698g == hi40Var.f91698g;
    }

    public final int hashCode() {
        String str = this.f91692a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91693b;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f91694c), 31, this.f91695d);
        String str3 = this.f91696e;
        return Integer.hashCode(this.f91698g) + s571.m77243b((iM77243b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f91697f);
    }
}
