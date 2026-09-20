package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jdz extends vdz {

    /* JADX INFO: renamed from: a */
    public final xcz f111411a;

    /* JADX INFO: renamed from: b */
    public final boolean f111412b;

    public jdz(xcz xczVar, boolean z) {
        this.f111411a = xczVar;
        this.f111412b = z;
    }

    @Override // p204p.vdz
    /* JADX INFO: renamed from: c */
    public final xcz mo50365c() {
        return this.f111411a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdz)) {
            return false;
        }
        jdz jdzVar = (jdz) obj;
        return wj50.m88271j(this.f111411a, jdzVar.f111411a) && this.f111412b == jdzVar.f111412b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111412b) + (this.f111411a.hashCode() * 31);
    }
}
