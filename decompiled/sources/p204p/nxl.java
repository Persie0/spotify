package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nxl {

    /* JADX INFO: renamed from: a */
    public final String f159509a;

    /* JADX INFO: renamed from: b */
    public final String f159510b;

    /* JADX INFO: renamed from: c */
    public final boolean f159511c;

    /* JADX INFO: renamed from: d */
    public final boolean f159512d;

    /* JADX INFO: renamed from: e */
    public final boolean f159513e;

    /* JADX INFO: renamed from: f */
    public final boolean f159514f;

    public nxl(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f159509a = str;
        this.f159510b = str2;
        this.f159511c = z;
        this.f159512d = z2;
        this.f159513e = z3;
        this.f159514f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxl)) {
            return false;
        }
        nxl nxlVar = (nxl) obj;
        return wj50.m88271j(this.f159509a, nxlVar.f159509a) && wj50.m88271j(this.f159510b, nxlVar.f159510b) && this.f159511c == nxlVar.f159511c && this.f159512d == nxlVar.f159512d && this.f159513e == nxlVar.f159513e && this.f159514f == nxlVar.f159514f;
    }

    public final int hashCode() {
        int iHashCode = this.f159509a.hashCode() * 31;
        String str = this.f159510b;
        return Boolean.hashCode(this.f159514f) + s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f159511c), 31, this.f159512d), 31, this.f159513e);
    }
}
