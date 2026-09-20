package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class o4y0 implements q4y0 {

    /* JADX INFO: renamed from: a */
    public final String f161802a;

    /* JADX INFO: renamed from: b */
    public final Integer f161803b;

    /* JADX INFO: renamed from: c */
    public final String f161804c;

    /* JADX INFO: renamed from: d */
    public final aa3 f161805d;

    public o4y0(String str, Integer num, String str2, aa3 aa3Var) {
        this.f161802a = str;
        this.f161803b = num;
        this.f161804c = str2;
        this.f161805d = aa3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4y0)) {
            return false;
        }
        o4y0 o4y0Var = (o4y0) obj;
        return wj50.m88271j(this.f161802a, o4y0Var.f161802a) && wj50.m88271j(this.f161803b, o4y0Var.f161803b) && wj50.m88271j(this.f161804c, o4y0Var.f161804c) && wj50.m88271j(this.f161805d, o4y0Var.f161805d);
    }

    public final int hashCode() {
        int iHashCode = this.f161802a.hashCode() * 31;
        Integer num = this.f161803b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f161804c;
        return this.f161805d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
