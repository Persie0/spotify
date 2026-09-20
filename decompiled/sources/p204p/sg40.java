package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sg40 {

    /* JADX INFO: renamed from: a */
    public final String f208712a;

    /* JADX INFO: renamed from: b */
    public final is50 f208713b;

    /* JADX INFO: renamed from: c */
    public final lg40 f208714c;

    /* JADX INFO: renamed from: d */
    public final String f208715d;

    /* JADX INFO: renamed from: e */
    public final String f208716e;

    /* JADX INFO: renamed from: f */
    public final String f208717f;

    /* JADX INFO: renamed from: g */
    public final String f208718g;

    /* JADX INFO: renamed from: h */
    public final String f208719h;

    public sg40(String str, is50 is50Var, lg40 lg40Var, String str2, String str3, String str4, String str5, String str6) {
        this.f208712a = str;
        this.f208713b = is50Var;
        this.f208714c = lg40Var;
        this.f208715d = str2;
        this.f208716e = str3;
        this.f208717f = str4;
        this.f208718g = str5;
        this.f208719h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg40)) {
            return false;
        }
        sg40 sg40Var = (sg40) obj;
        return wj50.m88271j(this.f208712a, sg40Var.f208712a) && wj50.m88271j(this.f208713b, sg40Var.f208713b) && wj50.m88271j(this.f208714c, sg40Var.f208714c) && wj50.m88271j(this.f208715d, sg40Var.f208715d) && wj50.m88271j(this.f208716e, sg40Var.f208716e) && wj50.m88271j(this.f208717f, sg40Var.f208717f) && wj50.m88271j(this.f208718g, sg40Var.f208718g) && wj50.m88271j(this.f208719h, sg40Var.f208719h);
    }

    public final int hashCode() {
        int iHashCode = (this.f208713b.hashCode() + (this.f208712a.hashCode() * 31)) * 31;
        lg40 lg40Var = this.f208714c;
        int iHashCode2 = (iHashCode + (lg40Var == null ? 0 : lg40Var.hashCode())) * 31;
        String str = this.f208715d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f208716e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f208717f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f208718g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f208719h;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
