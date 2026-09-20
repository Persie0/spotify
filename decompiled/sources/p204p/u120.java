package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u120 {

    /* JADX INFO: renamed from: a */
    public final nlm0 f225657a;

    /* JADX INFO: renamed from: b */
    public final String f225658b;

    /* JADX INFO: renamed from: c */
    public final String f225659c;

    /* JADX INFO: renamed from: d */
    public final String f225660d;

    /* JADX INFO: renamed from: e */
    public final String f225661e;

    /* JADX INFO: renamed from: f */
    public final List f225662f;

    /* JADX INFO: renamed from: g */
    public final String f225663g;

    /* JADX INFO: renamed from: h */
    public final String f225664h;

    /* JADX INFO: renamed from: i */
    public final String f225665i;

    /* JADX INFO: renamed from: j */
    public final String f225666j;

    /* JADX INFO: renamed from: k */
    public final String f225667k;

    /* JADX INFO: renamed from: l */
    public final String f225668l;

    /* JADX INFO: renamed from: m */
    public final boolean f225669m;

    /* JADX INFO: renamed from: n */
    public final boolean f225670n;

    public u120(nlm0 nlm0Var, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        this.f225657a = nlm0Var;
        this.f225658b = str;
        this.f225659c = str2;
        this.f225660d = str3;
        this.f225661e = str4;
        this.f225662f = list;
        this.f225663g = str5;
        this.f225664h = str6;
        this.f225665i = str7;
        this.f225666j = str8;
        this.f225667k = str9;
        this.f225668l = str10;
        this.f225669m = z;
        this.f225670n = z2;
    }

    /* JADX INFO: renamed from: a */
    public static u120 m82190a(u120 u120Var, boolean z) {
        nlm0 nlm0Var = u120Var.f225657a;
        String str = u120Var.f225658b;
        String str2 = u120Var.f225659c;
        String str3 = u120Var.f225660d;
        String str4 = u120Var.f225661e;
        List list = u120Var.f225662f;
        String str5 = u120Var.f225663g;
        String str6 = u120Var.f225664h;
        String str7 = u120Var.f225665i;
        String str8 = u120Var.f225666j;
        String str9 = u120Var.f225667k;
        String str10 = u120Var.f225668l;
        boolean z2 = u120Var.f225669m;
        u120Var.getClass();
        return new u120(nlm0Var, str, str2, str3, str4, list, str5, str6, str7, str8, str9, str10, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u120)) {
            return false;
        }
        u120 u120Var = (u120) obj;
        return this.f225657a == u120Var.f225657a && this.f225658b.equals(u120Var.f225658b) && wj50.m88271j(this.f225659c, u120Var.f225659c) && wj50.m88271j(this.f225660d, u120Var.f225660d) && wj50.m88271j(this.f225661e, u120Var.f225661e) && wj50.m88271j(this.f225662f, u120Var.f225662f) && wj50.m88271j(this.f225663g, u120Var.f225663g) && wj50.m88271j(this.f225664h, u120Var.f225664h) && wj50.m88271j(this.f225665i, u120Var.f225665i) && wj50.m88271j(this.f225666j, u120Var.f225666j) && wj50.m88271j(this.f225667k, u120Var.f225667k) && wj50.m88271j(this.f225668l, u120Var.f225668l) && this.f225669m == u120Var.f225669m && this.f225670n == u120Var.f225670n;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f225657a.hashCode() * 31, 31, this.f225658b);
        String str = this.f225659c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f225660d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f225661e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f225662f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f225663g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f225664h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f225665i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f225666j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f225667k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f225668l;
        return Boolean.hashCode(this.f225670n) + s571.m77245d((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31, 31, this.f225669m);
    }
}
