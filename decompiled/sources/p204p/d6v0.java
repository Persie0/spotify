package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d6v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final pxj f45887a;

    public d6v0(pxj pxjVar) {
        this.f45887a = pxjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6v0) && this.f45887a == ((d6v0) obj).f45887a;
    }

    public final int hashCode() {
        pxj pxjVar = this.f45887a;
        if (pxjVar == null) {
            return 0;
        }
        return pxjVar.hashCode();
    }
}
