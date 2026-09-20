package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ldz extends vdz implements hdz {

    /* JADX INFO: renamed from: a */
    public final xcz f132376a;

    /* JADX INFO: renamed from: b */
    public final wdz f132377b;

    /* JADX INFO: renamed from: c */
    public final gdz f132378c;

    public ldz(xcz xczVar, wdz wdzVar, gdz gdzVar) {
        this.f132376a = xczVar;
        this.f132377b = wdzVar;
        this.f132378c = gdzVar;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f132378c;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f132376a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldz)) {
            return false;
        }
        ldz ldzVar = (ldz) obj;
        return wj50.m88271j(this.f132376a, ldzVar.f132376a) && wj50.m88271j(this.f132377b, ldzVar.f132377b) && wj50.m88271j(this.f132378c, ldzVar.f132378c);
    }

    public final int hashCode() {
        int iHashCode = this.f132376a.hashCode() * 31;
        wdz wdzVar = this.f132377b;
        int iHashCode2 = (iHashCode + (wdzVar == null ? 0 : wdzVar.hashCode())) * 31;
        gdz gdzVar = this.f132378c;
        return iHashCode2 + (gdzVar != null ? gdzVar.hashCode() : 0);
    }
}
