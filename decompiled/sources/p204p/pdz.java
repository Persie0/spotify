package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pdz extends vdz implements hdz {

    /* JADX INFO: renamed from: a */
    public final xcz f176574a;

    /* JADX INFO: renamed from: b */
    public final wdz f176575b;

    /* JADX INFO: renamed from: c */
    public final gdz f176576c;

    public pdz(xcz xczVar, wdz wdzVar, gdz gdzVar) {
        this.f176574a = xczVar;
        this.f176575b = wdzVar;
        this.f176576c = gdzVar;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f176576c;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f176574a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdz)) {
            return false;
        }
        pdz pdzVar = (pdz) obj;
        return wj50.m88271j(this.f176574a, pdzVar.f176574a) && wj50.m88271j(this.f176575b, pdzVar.f176575b) && wj50.m88271j(this.f176576c, pdzVar.f176576c);
    }

    public final int hashCode() {
        int iHashCode = this.f176574a.hashCode() * 31;
        wdz wdzVar = this.f176575b;
        int iHashCode2 = (iHashCode + (wdzVar == null ? 0 : wdzVar.hashCode())) * 31;
        gdz gdzVar = this.f176576c;
        return iHashCode2 + (gdzVar != null ? gdzVar.hashCode() : 0);
    }
}
