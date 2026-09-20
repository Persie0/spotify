package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cuz implements iuz {

    /* JADX INFO: renamed from: a */
    public final AbstractC1895gf f42254a;

    /* JADX INFO: renamed from: b */
    public final ybs f42255b;

    public cuz(AbstractC1895gf abstractC1895gf, ybs ybsVar) {
        this.f42254a = abstractC1895gf;
        this.f42255b = ybsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuz)) {
            return false;
        }
        cuz cuzVar = (cuz) obj;
        return wj50.m88271j(this.f42254a, cuzVar.f42254a) && wj50.m88271j(this.f42255b, cuzVar.f42255b);
    }

    public final int hashCode() {
        int iHashCode = this.f42254a.hashCode() * 31;
        ybs ybsVar = this.f42255b;
        return iHashCode + (ybsVar == null ? 0 : Float.hashCode(ybsVar.f271238a));
    }
}
