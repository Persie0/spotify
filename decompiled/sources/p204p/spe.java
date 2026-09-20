package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class spe {

    /* JADX INFO: renamed from: a */
    public final String f212820a;

    /* JADX INFO: renamed from: b */
    public final long f212821b;

    /* JADX INFO: renamed from: c */
    public final fq01 f212822c;

    /* JADX INFO: renamed from: d */
    public final String f212823d;

    /* JADX INFO: renamed from: e */
    public final long f212824e;

    /* JADX INFO: renamed from: f */
    public final String f212825f;

    /* JADX INFO: renamed from: g */
    public final String f212826g;

    /* JADX INFO: renamed from: h */
    public final String f212827h;

    /* JADX INFO: renamed from: i */
    public final String f212828i;

    /* JADX INFO: renamed from: j */
    public final Integer f212829j;

    /* JADX INFO: renamed from: k */
    public final String f212830k;

    public spe(String str, long j, fq01 fq01Var, String str2, long j2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        this.f212820a = str;
        this.f212821b = j;
        this.f212822c = fq01Var;
        this.f212823d = str2;
        this.f212824e = j2;
        this.f212825f = str3;
        this.f212826g = str4;
        this.f212827h = str5;
        this.f212828i = str6;
        this.f212829j = num;
        this.f212830k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spe)) {
            return false;
        }
        spe speVar = (spe) obj;
        return wj50.m88271j(this.f212820a, speVar.f212820a) && this.f212821b == speVar.f212821b && wj50.m88271j(this.f212822c, speVar.f212822c) && wj50.m88271j(this.f212823d, speVar.f212823d) && this.f212824e == speVar.f212824e && wj50.m88271j(this.f212825f, speVar.f212825f) && wj50.m88271j(this.f212826g, speVar.f212826g) && wj50.m88271j(this.f212827h, speVar.f212827h) && wj50.m88271j(this.f212828i, speVar.f212828i) && wj50.m88271j(this.f212829j, speVar.f212829j) && wj50.m88271j(this.f212830k, speVar.f212830k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(dq60.m36605e(s571.m77243b((this.f212822c.hashCode() + dq60.m36605e(this.f212820a.hashCode() * 31, this.f212821b, 31)) * 31, 31, this.f212823d), this.f212824e, 31), 31, this.f212825f), 31, this.f212826g);
        String str = this.f212827h;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f212828i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f212829j;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f212830k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
