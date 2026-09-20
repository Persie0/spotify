package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fr01 {

    /* JADX INFO: renamed from: a */
    public final hr01 f72321a;

    /* JADX INFO: renamed from: b */
    public final String f72322b;

    /* JADX INFO: renamed from: c */
    public final String f72323c;

    /* JADX INFO: renamed from: d */
    public final String f72324d;

    /* JADX INFO: renamed from: e */
    public final String f72325e;

    /* JADX INFO: renamed from: f */
    public final String f72326f;

    /* JADX INFO: renamed from: g */
    public final String f72327g;

    /* JADX INFO: renamed from: h */
    public final String f72328h;

    /* JADX INFO: renamed from: i */
    public final String f72329i;

    public fr01(hr01 hr01Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f72321a = hr01Var;
        this.f72322b = str;
        this.f72323c = str2;
        this.f72324d = str3;
        this.f72325e = str4;
        this.f72326f = str5;
        this.f72327g = str6;
        this.f72328h = str7;
        this.f72329i = str8;
    }

    /* JADX INFO: renamed from: a */
    public final String m42483a() {
        return this.f72329i;
    }

    /* JADX INFO: renamed from: b */
    public final String m42484b() {
        return this.f72328h;
    }

    /* JADX INFO: renamed from: c */
    public final String m42485c() {
        return this.f72324d;
    }

    /* JADX INFO: renamed from: d */
    public final String m42486d() {
        return this.f72323c;
    }

    /* JADX INFO: renamed from: e */
    public final String m42487e() {
        return this.f72322b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr01)) {
            return false;
        }
        fr01 fr01Var = (fr01) obj;
        return this.f72321a == fr01Var.f72321a && wj50.m88271j(this.f72322b, fr01Var.f72322b) && wj50.m88271j(this.f72323c, fr01Var.f72323c) && wj50.m88271j(this.f72324d, fr01Var.f72324d) && wj50.m88271j(this.f72325e, fr01Var.f72325e) && wj50.m88271j(this.f72326f, fr01Var.f72326f) && wj50.m88271j(this.f72327g, fr01Var.f72327g) && wj50.m88271j(this.f72328h, fr01Var.f72328h) && wj50.m88271j(this.f72329i, fr01Var.f72329i);
    }

    /* JADX INFO: renamed from: f */
    public final String m42488f() {
        return this.f72325e;
    }

    /* JADX INFO: renamed from: g */
    public final hr01 m42489g() {
        return this.f72321a;
    }

    /* JADX INFO: renamed from: h */
    public final String m42490h() {
        return this.f72327g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f72321a.hashCode() * 31, 31, this.f72322b);
        String str = this.f72323c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72324d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72325e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f72326f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f72327g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f72328h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f72329i;
        return (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
    }

    /* JADX INFO: renamed from: i */
    public final String m42491i() {
        return this.f72326f;
    }
}
