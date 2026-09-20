package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class toa1 extends uoa1 {

    /* JADX INFO: renamed from: b */
    public final String f222213b;

    /* JADX INFO: renamed from: c */
    public final String f222214c;

    /* JADX INFO: renamed from: d */
    public final String f222215d;

    public toa1(String str, String str2, String str3) {
        super(0);
        this.f222213b = str;
        this.f222214c = str2;
        this.f222215d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toa1)) {
            return false;
        }
        toa1 toa1Var = (toa1) obj;
        return wj50.m88271j(this.f222213b, toa1Var.f222213b) && wj50.m88271j(this.f222214c, toa1Var.f222214c) && wj50.m88271j(this.f222215d, toa1Var.f222215d);
    }

    public final int hashCode() {
        int iHashCode = this.f222213b.hashCode() * 31;
        String str = this.f222214c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f222215d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
