package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class swj0 {

    /* JADX INFO: renamed from: a */
    public final int f214675a;

    /* JADX INFO: renamed from: b */
    public final String f214676b;

    /* JADX INFO: renamed from: c */
    public final String f214677c;

    /* JADX INFO: renamed from: d */
    public final String f214678d;

    /* JADX INFO: renamed from: e */
    public final String f214679e;

    /* JADX INFO: renamed from: f */
    public final String f214680f;

    public swj0(int i, String str, String str2, String str3, String str4, String str5) {
        this.f214675a = i;
        this.f214676b = str;
        this.f214677c = str2;
        this.f214678d = str3;
        this.f214679e = str4;
        this.f214680f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swj0)) {
            return false;
        }
        swj0 swj0Var = (swj0) obj;
        return this.f214675a == swj0Var.f214675a && wj50.m88271j(this.f214676b, swj0Var.f214676b) && wj50.m88271j(this.f214677c, swj0Var.f214677c) && wj50.m88271j(this.f214678d, swj0Var.f214678d) && wj50.m88271j(this.f214679e, swj0Var.f214679e) && wj50.m88271j(this.f214680f, swj0Var.f214680f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f214675a) * 31;
        String str = this.f214676b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f214677c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f214678d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f214679e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f214680f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
