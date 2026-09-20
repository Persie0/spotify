package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final String f45922a;

    /* JADX INFO: renamed from: b */
    public final String f45923b;

    /* JADX INFO: renamed from: c */
    public final String f45924c;

    /* JADX INFO: renamed from: d */
    public final String f45925d;

    /* JADX INFO: renamed from: e */
    public final Boolean f45926e;

    /* JADX INFO: renamed from: f */
    public final Integer f45927f;

    /* JADX INFO: renamed from: g */
    public final String f45928g;

    public d6y0(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.f45922a = str;
        this.f45923b = str2;
        this.f45924c = str3;
        this.f45925d = str4;
        this.f45926e = bool;
        this.f45927f = num;
        this.f45928g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6y0)) {
            return false;
        }
        d6y0 d6y0Var = (d6y0) obj;
        return wj50.m88271j(this.f45922a, d6y0Var.f45922a) && wj50.m88271j(this.f45923b, d6y0Var.f45923b) && wj50.m88271j(this.f45924c, d6y0Var.f45924c) && wj50.m88271j(this.f45925d, d6y0Var.f45925d) && wj50.m88271j(this.f45926e, d6y0Var.f45926e) && wj50.m88271j(this.f45927f, d6y0Var.f45927f) && wj50.m88271j(this.f45928g, d6y0Var.f45928g);
    }

    public final int hashCode() {
        String str = this.f45922a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f45923b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f45924c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f45925d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f45926e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f45927f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f45928g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
