package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vdc {

    /* JADX INFO: renamed from: a */
    public final udc f240376a;

    public vdc(udc udcVar) {
        this.f240376a = udcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdc) && wj50.m88271j(this.f240376a, ((vdc) obj).f240376a);
    }

    public final int hashCode() {
        udc udcVar = this.f240376a;
        if (udcVar == null) {
            return 0;
        }
        return udcVar.f229224a.hashCode();
    }
}
