package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ctk0 {

    /* JADX INFO: renamed from: a */
    public final String f41905a;

    /* JADX INFO: renamed from: b */
    public final String f41906b;

    /* JADX INFO: renamed from: c */
    public final String f41907c;

    /* JADX INFO: renamed from: d */
    public final String f41908d;

    /* JADX INFO: renamed from: e */
    public final l79 f41909e;

    /* JADX INFO: renamed from: f */
    public final String f41910f;

    /* JADX INFO: renamed from: g */
    public final String f41911g;

    /* JADX INFO: renamed from: h */
    public final String f41912h;

    public ctk0(String str, String str2, String str3, String str4, l79 l79Var, String str5, String str6, String str7) {
        this.f41905a = str;
        this.f41906b = str2;
        this.f41907c = str3;
        this.f41908d = str4;
        this.f41909e = l79Var;
        this.f41910f = str5;
        this.f41911g = str6;
        this.f41912h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctk0)) {
            return false;
        }
        ctk0 ctk0Var = (ctk0) obj;
        return wj50.m88271j(this.f41905a, ctk0Var.f41905a) && wj50.m88271j(this.f41906b, ctk0Var.f41906b) && wj50.m88271j(this.f41907c, ctk0Var.f41907c) && wj50.m88271j(this.f41908d, ctk0Var.f41908d) && wj50.m88271j(this.f41909e, ctk0Var.f41909e) && wj50.m88271j(this.f41910f, ctk0Var.f41910f) && wj50.m88271j(this.f41911g, ctk0Var.f41911g) && wj50.m88271j(this.f41912h, ctk0Var.f41912h);
    }

    public final int hashCode() {
        int iHashCode = (this.f41909e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f41905a.hashCode() * 31, 31, this.f41906b), 31, this.f41907c), 31, this.f41908d)) * 31;
        String str = this.f41910f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41911g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f41912h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
