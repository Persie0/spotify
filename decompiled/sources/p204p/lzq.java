package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lzq implements k0r {

    /* JADX INFO: renamed from: a */
    public final boolean f138406a;

    /* JADX INFO: renamed from: b */
    public final rk7 f138407b;

    /* JADX INFO: renamed from: c */
    public final String f138408c;

    /* JADX INFO: renamed from: d */
    public final String f138409d;

    /* JADX INFO: renamed from: e */
    public final mrl f138410e;

    public lzq(boolean z, rk7 rk7Var, String str, String str2, mrl mrlVar) {
        this.f138406a = z;
        this.f138407b = rk7Var;
        this.f138408c = str;
        this.f138409d = str2;
        this.f138410e = mrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzq)) {
            return false;
        }
        lzq lzqVar = (lzq) obj;
        return this.f138406a == lzqVar.f138406a && this.f138407b == lzqVar.f138407b && wj50.m88271j(this.f138408c, lzqVar.f138408c) && wj50.m88271j(this.f138409d, lzqVar.f138409d) && wj50.m88271j(this.f138410e, lzqVar.f138410e);
    }

    public final int hashCode() {
        int iHashCode = (this.f138407b.hashCode() + (Boolean.hashCode(this.f138406a) * 31)) * 31;
        String str = this.f138408c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f138409d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        mrl mrlVar = this.f138410e;
        return iHashCode3 + (mrlVar != null ? mrlVar.hashCode() : 0);
    }
}
