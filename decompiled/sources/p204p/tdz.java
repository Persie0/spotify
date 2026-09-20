package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tdz extends vdz {

    /* JADX INFO: renamed from: a */
    public final xcz f219530a;

    /* JADX INFO: renamed from: b */
    public final boolean f219531b;

    public tdz(xcz xczVar, boolean z) {
        this.f219530a = xczVar;
        this.f219531b = z;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f219530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdz)) {
            return false;
        }
        tdz tdzVar = (tdz) obj;
        return wj50.m88271j(this.f219530a, tdzVar.f219530a) && this.f219531b == tdzVar.f219531b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219531b) + (this.f219530a.hashCode() * 31);
    }
}
