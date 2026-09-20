package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xet {

    /* JADX INFO: renamed from: a */
    public final dks f260769a;

    /* JADX INFO: renamed from: b */
    public final String f260770b;

    public xet(dks dksVar, String str) {
        this.f260769a = dksVar;
        this.f260770b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xet)) {
            return false;
        }
        xet xetVar = (xet) obj;
        return wj50.m88271j(this.f260769a, xetVar.f260769a) && wj50.m88271j(this.f260770b, xetVar.f260770b);
    }

    public final int hashCode() {
        return this.f260770b.hashCode() + (this.f260769a.hashCode() * 31);
    }
}
