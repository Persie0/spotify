package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c811 {

    /* JADX INFO: renamed from: a */
    public final String f35075a;

    /* JADX INFO: renamed from: b */
    public final String f35076b;

    /* JADX INFO: renamed from: c */
    public final String f35077c;

    /* JADX INFO: renamed from: d */
    public final rv01 f35078d;

    /* JADX INFO: renamed from: e */
    public final boolean f35079e;

    /* JADX INFO: renamed from: f */
    public final int f35080f;

    public c811(String str, String str2, String str3, rv01 rv01Var, boolean z, int i) {
        this.f35075a = str;
        this.f35076b = str2;
        this.f35077c = str3;
        this.f35078d = rv01Var;
        this.f35079e = z;
        this.f35080f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c811)) {
            return false;
        }
        c811 c811Var = (c811) obj;
        return wj50.m88271j(this.f35075a, c811Var.f35075a) && wj50.m88271j(this.f35076b, c811Var.f35076b) && wj50.m88271j(this.f35077c, c811Var.f35077c) && wj50.m88271j(this.f35078d, c811Var.f35078d) && this.f35079e == c811Var.f35079e && this.f35080f == c811Var.f35080f;
    }

    public final int hashCode() {
        int iHashCode = this.f35075a.hashCode() * 31;
        String str = this.f35076b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f35077c;
        return edb.m38547C(this.f35080f) + s571.m77245d((this.f35078d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f35079e);
    }
}
