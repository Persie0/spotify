package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ix0 {

    /* JADX INFO: renamed from: a */
    public final List f106538a;

    /* JADX INFO: renamed from: b */
    public final List f106539b;

    /* JADX INFO: renamed from: c */
    public final String f106540c;

    /* JADX INFO: renamed from: d */
    public final String f106541d;

    /* JADX INFO: renamed from: e */
    public final String f106542e;

    /* JADX INFO: renamed from: f */
    public final String f106543f;

    /* JADX INFO: renamed from: g */
    public final String f106544g;

    /* JADX INFO: renamed from: h */
    public final String f106545h;

    /* JADX INFO: renamed from: i */
    public final String f106546i;

    /* JADX INFO: renamed from: j */
    public final String f106547j;

    /* JADX INFO: renamed from: k */
    public final String f106548k;

    public ix0(List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f106538a = list;
        this.f106539b = list2;
        this.f106540c = str;
        this.f106541d = str2;
        this.f106542e = str3;
        this.f106543f = str4;
        this.f106544g = str5;
        this.f106545h = str6;
        this.f106546i = str7;
        this.f106547j = str8;
        this.f106548k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix0)) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        return wj50.m88271j(this.f106538a, ix0Var.f106538a) && wj50.m88271j(this.f106539b, ix0Var.f106539b) && wj50.m88271j(this.f106540c, ix0Var.f106540c) && wj50.m88271j(this.f106541d, ix0Var.f106541d) && wj50.m88271j(this.f106542e, ix0Var.f106542e) && wj50.m88271j(this.f106543f, ix0Var.f106543f) && wj50.m88271j(this.f106544g, ix0Var.f106544g) && wj50.m88271j(this.f106545h, ix0Var.f106545h) && wj50.m88271j(this.f106546i, ix0Var.f106546i) && wj50.m88271j(this.f106547j, ix0Var.f106547j) && wj50.m88271j(this.f106548k, ix0Var.f106548k);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f106538a.hashCode() * 31, 31, this.f106539b);
        String str = this.f106540c;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106541d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f106542e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f106543f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f106544g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f106545h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f106546i;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f106547j;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f106548k;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }
}
