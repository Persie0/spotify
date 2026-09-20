package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class crd {

    /* JADX INFO: renamed from: a */
    public final String f41265a;

    /* JADX INFO: renamed from: b */
    public final drd f41266b;

    /* JADX INFO: renamed from: c */
    public final wwu f41267c;

    public crd(String str, drd drdVar, wwu wwuVar) {
        this.f41265a = str;
        this.f41266b = drdVar;
        this.f41267c = wwuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crd)) {
            return false;
        }
        crd crdVar = (crd) obj;
        return wj50.m88271j(this.f41265a, crdVar.f41265a) && wj50.m88271j(this.f41266b, crdVar.f41266b) && wj50.m88271j(this.f41267c, crdVar.f41267c);
    }

    public final int hashCode() {
        int iHashCode = (this.f41266b.hashCode() + (this.f41265a.hashCode() * 31)) * 31;
        wwu wwuVar = this.f41267c;
        return iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode());
    }
}
