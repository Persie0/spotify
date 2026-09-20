package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pzy0 {

    /* JADX INFO: renamed from: a */
    public final String f183856a;

    /* JADX INFO: renamed from: b */
    public final String f183857b;

    /* JADX INFO: renamed from: c */
    public final String f183858c;

    /* JADX INFO: renamed from: d */
    public final String f183859d;

    public /* synthetic */ pzy0() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzy0)) {
            return false;
        }
        pzy0 pzy0Var = (pzy0) obj;
        return wj50.m88271j(this.f183856a, pzy0Var.f183856a) && wj50.m88271j(this.f183857b, pzy0Var.f183857b) && wj50.m88271j(this.f183858c, pzy0Var.f183858c) && wj50.m88271j(this.f183859d, pzy0Var.f183859d);
    }

    public final int hashCode() {
        String str = this.f183856a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f183857b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f183858c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f183859d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public pzy0(String str, String str2, String str3, String str4) {
        this.f183856a = str;
        this.f183857b = str2;
        this.f183858c = str3;
        this.f183859d = str4;
    }
}
