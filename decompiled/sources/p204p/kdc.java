package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kdc {

    /* JADX INFO: renamed from: a */
    public final l3a f121656a;

    /* JADX INFO: renamed from: b */
    public final xfr f121657b;

    /* JADX INFO: renamed from: c */
    public final String f121658c;

    public kdc(l3a l3aVar, xfr xfrVar, String str) {
        this.f121656a = l3aVar;
        this.f121657b = xfrVar;
        this.f121658c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdc)) {
            return false;
        }
        kdc kdcVar = (kdc) obj;
        return wj50.m88271j(this.f121656a, kdcVar.f121656a) && this.f121657b == kdcVar.f121657b && wj50.m88271j(this.f121658c, kdcVar.f121658c);
    }

    public final int hashCode() {
        int iHashCode = (this.f121657b.hashCode() + (this.f121656a.hashCode() * 31)) * 31;
        String str = this.f121658c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
