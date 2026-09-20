package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qdz extends vdz implements hdz {

    /* JADX INFO: renamed from: a */
    public final xcz f187794a;

    /* JADX INFO: renamed from: b */
    public final boolean f187795b;

    /* JADX INFO: renamed from: c */
    public final gdz f187796c;

    public qdz(xcz xczVar, boolean z, gdz gdzVar) {
        this.f187794a = xczVar;
        this.f187795b = z;
        this.f187796c = gdzVar;
    }

    @Override // p204p.hdz
    /* JADX INFO: renamed from: b */
    public final gdz mo47259b() {
        return this.f187796c;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f187794a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdz)) {
            return false;
        }
        qdz qdzVar = (qdz) obj;
        return wj50.m88271j(this.f187794a, qdzVar.f187794a) && this.f187795b == qdzVar.f187795b && wj50.m88271j(this.f187796c, qdzVar.f187796c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f187794a.hashCode() * 31, 31, this.f187795b);
        gdz gdzVar = this.f187796c;
        return iM77245d + (gdzVar == null ? 0 : gdzVar.hashCode());
    }
}
