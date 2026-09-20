package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kdz extends vdz {

    /* JADX INFO: renamed from: a */
    public final xcz f121751a;

    public kdz(xcz xczVar) {
        this.f121751a = xczVar;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f121751a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdz) && wj50.m88271j(this.f121751a, ((kdz) obj).f121751a);
    }

    public final int hashCode() {
        return this.f121751a.hashCode();
    }
}
