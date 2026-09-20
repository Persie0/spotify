package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class odz extends vdz implements hdz {

    /* JADX INFO: renamed from: a */
    public final xcz f164288a;

    /* JADX INFO: renamed from: b */
    public final gdz f164289b;

    public odz(xcz xczVar, gdz gdzVar) {
        this.f164288a = xczVar;
        this.f164289b = gdzVar;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f164289b;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f164288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odz)) {
            return false;
        }
        odz odzVar = (odz) obj;
        return wj50.m88271j(this.f164288a, odzVar.f164288a) && wj50.m88271j(this.f164289b, odzVar.f164289b);
    }

    public final int hashCode() {
        int iHashCode = this.f164288a.hashCode() * 31;
        gdz gdzVar = this.f164289b;
        return iHashCode + (gdzVar == null ? 0 : gdzVar.hashCode());
    }
}
