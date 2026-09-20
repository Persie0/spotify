package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vfd extends xfd {

    /* JADX INFO: renamed from: e */
    public final String f240951e;

    /* JADX INFO: renamed from: f */
    public final long f240952f;

    /* JADX INFO: renamed from: g */
    public final String f240953g;

    public vfd(long j, String str, String str2) {
        this.f240951e = str;
        this.f240952f = j;
        this.f240953g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f240953g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f240951e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f240952f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfd)) {
            return false;
        }
        vfd vfdVar = (vfd) obj;
        return wj50.m88271j(this.f240951e, vfdVar.f240951e) && this.f240952f == vfdVar.f240952f && wj50.m88271j(this.f240953g, vfdVar.f240953g);
    }

    public final int hashCode() {
        return this.f240953g.hashCode() + dq60.m36605e(this.f240951e.hashCode() * 31, this.f240952f, 31);
    }
}
