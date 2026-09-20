package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class enx {

    /* JADX INFO: renamed from: a */
    public final cnx f61243a;

    /* JADX INFO: renamed from: b */
    public final dnx f61244b;

    public enx(cnx cnxVar, dnx dnxVar) {
        this.f61243a = cnxVar;
        this.f61244b = dnxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enx)) {
            return false;
        }
        enx enxVar = (enx) obj;
        return wj50.m88271j(this.f61243a, enxVar.f61243a) && wj50.m88271j(this.f61244b, enxVar.f61244b);
    }

    public final int hashCode() {
        int iHashCode = this.f61243a.hashCode() * 31;
        dnx dnxVar = this.f61244b;
        return iHashCode + (dnxVar == null ? 0 : dnxVar.hashCode());
    }
}
