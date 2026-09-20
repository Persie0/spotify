package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d281 {

    /* JADX INFO: renamed from: a */
    public final String f44508a;

    /* JADX INFO: renamed from: b */
    public final String f44509b;

    /* JADX INFO: renamed from: c */
    public final String f44510c;

    /* JADX INFO: renamed from: d */
    public final String f44511d;

    public d281(String str, String str2, String str3, String str4) {
        this.f44508a = str;
        this.f44509b = str2;
        this.f44510c = str3;
        this.f44511d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d281)) {
            return false;
        }
        d281 d281Var = (d281) obj;
        return wj50.m88271j(this.f44508a, d281Var.f44508a) && wj50.m88271j(this.f44509b, d281Var.f44509b) && wj50.m88271j(this.f44510c, d281Var.f44510c) && wj50.m88271j(this.f44511d, d281Var.f44511d);
    }

    public final int hashCode() {
        int iHashCode = this.f44508a.hashCode() * 31;
        String str = this.f44509b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44510c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44511d;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) - 637232924;
    }
}
