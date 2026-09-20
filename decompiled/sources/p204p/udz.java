package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class udz extends vdz {

    /* JADX INFO: renamed from: a */
    public final xcz f229349a;

    public udz(xcz xczVar) {
        this.f229349a = xczVar;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f229349a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udz) && wj50.m88271j(this.f229349a, ((udz) obj).f229349a);
    }

    public final int hashCode() {
        return this.f229349a.hashCode();
    }
}
