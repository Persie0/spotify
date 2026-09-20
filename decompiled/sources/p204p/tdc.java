package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tdc {

    /* JADX INFO: renamed from: a */
    public final udc f219276a;

    /* JADX INFO: renamed from: b */
    public final String f219277b;

    public tdc(udc udcVar, String str) {
        this.f219276a = udcVar;
        this.f219277b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdc)) {
            return false;
        }
        tdc tdcVar = (tdc) obj;
        return wj50.m88271j(this.f219276a, tdcVar.f219276a) && wj50.m88271j(this.f219277b, tdcVar.f219277b);
    }

    public final int hashCode() {
        return this.f219277b.hashCode() + (this.f219276a.f229224a.hashCode() * 31);
    }
}
