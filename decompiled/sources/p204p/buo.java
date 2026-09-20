package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class buo {

    /* JADX INFO: renamed from: a */
    public final String f31174a;

    /* JADX INFO: renamed from: b */
    public final String f31175b;

    /* JADX INFO: renamed from: c */
    public final String f31176c;

    /* JADX INFO: renamed from: d */
    public final String f31177d;

    /* JADX INFO: renamed from: e */
    public final String f31178e;

    /* JADX INFO: renamed from: f */
    public final String f31179f;

    /* JADX INFO: renamed from: g */
    public final String f31180g;

    public buo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f31174a = str;
        this.f31175b = str2;
        this.f31176c = str3;
        this.f31177d = str4;
        this.f31178e = str5;
        this.f31179f = str6;
        this.f31180g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buo)) {
            return false;
        }
        buo buoVar = (buo) obj;
        return wj50.m88271j(this.f31174a, buoVar.f31174a) && wj50.m88271j(this.f31175b, buoVar.f31175b) && wj50.m88271j(this.f31176c, buoVar.f31176c) && wj50.m88271j(this.f31177d, buoVar.f31177d) && wj50.m88271j(this.f31178e, buoVar.f31178e) && wj50.m88271j(this.f31179f, buoVar.f31179f) && wj50.m88271j(this.f31180g, buoVar.f31180g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f31174a.hashCode() * 31, 31, this.f31175b);
        String str = this.f31176c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f31177d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31178e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31179f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f31180g;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
