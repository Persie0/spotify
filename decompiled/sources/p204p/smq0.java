package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class smq0 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final int f210706b;

    /* JADX INFO: renamed from: c */
    public final String f210707c;

    /* JADX INFO: renamed from: d */
    public final String f210708d;

    /* JADX INFO: renamed from: e */
    public final String f210709e;

    /* JADX INFO: renamed from: f */
    public final String f210710f;

    /* JADX INFO: renamed from: g */
    public final String f210711g;

    /* JADX INFO: renamed from: h */
    public final String f210712h;

    /* JADX INFO: renamed from: i */
    public final String f210713i;

    /* JADX INFO: renamed from: j */
    public final List f210714j;

    /* JADX INFO: renamed from: k */
    public final String f210715k;

    /* JADX INFO: renamed from: l */
    public final String f210716l;

    /* JADX INFO: renamed from: m */
    public final String f210717m;

    /* JADX INFO: renamed from: n */
    public final omq0 f210718n;

    /* JADX INFO: renamed from: o */
    public final omq0 f210719o;

    /* JADX INFO: renamed from: p */
    public final jsa0 f210720p;

    public smq0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, omq0 omq0Var, omq0 omq0Var2, jsa0 jsa0Var) {
        super(7);
        this.f210706b = i;
        this.f210707c = str;
        this.f210708d = str2;
        this.f210709e = str3;
        this.f210710f = str4;
        this.f210711g = str5;
        this.f210712h = str6;
        this.f210713i = str7;
        this.f210714j = list;
        this.f210715k = str8;
        this.f210716l = str9;
        this.f210717m = str10;
        this.f210718n = omq0Var;
        this.f210719o = omq0Var2;
        this.f210720p = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smq0)) {
            return false;
        }
        smq0 smq0Var = (smq0) obj;
        return this.f210706b == smq0Var.f210706b && wj50.m88271j(this.f210707c, smq0Var.f210707c) && wj50.m88271j(this.f210708d, smq0Var.f210708d) && wj50.m88271j(this.f210709e, smq0Var.f210709e) && wj50.m88271j(this.f210710f, smq0Var.f210710f) && wj50.m88271j(this.f210711g, smq0Var.f210711g) && wj50.m88271j(this.f210712h, smq0Var.f210712h) && wj50.m88271j(this.f210713i, smq0Var.f210713i) && wj50.m88271j(this.f210714j, smq0Var.f210714j) && wj50.m88271j(this.f210715k, smq0Var.f210715k) && wj50.m88271j(this.f210716l, smq0Var.f210716l) && wj50.m88271j(this.f210717m, smq0Var.f210717m) && wj50.m88271j(this.f210718n, smq0Var.f210718n) && wj50.m88271j(this.f210719o, smq0Var.f210719o) && wj50.m88271j(this.f210720p, smq0Var.f210720p);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f210706b) * 31;
        String str = this.f210707c;
        int iHashCode = (iM38547C + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f210708d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f210709e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f210710f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f210711g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f210712h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f210713i;
        int iM77244c = s571.m77244c((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.f210714j);
        String str8 = this.f210715k;
        int iHashCode7 = (iM77244c + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f210716l;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f210717m;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        omq0 omq0Var = this.f210718n;
        int iHashCode10 = (iHashCode9 + (omq0Var == null ? 0 : omq0Var.hashCode())) * 31;
        omq0 omq0Var2 = this.f210719o;
        int iHashCode11 = (iHashCode10 + (omq0Var2 == null ? 0 : omq0Var2.hashCode())) * 31;
        jsa0 jsa0Var = this.f210720p;
        return iHashCode11 + (jsa0Var != null ? jsa0Var.hashCode() : 0);
    }
}
