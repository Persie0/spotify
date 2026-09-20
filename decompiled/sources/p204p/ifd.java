package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ifd extends jfd {

    /* JADX INFO: renamed from: e */
    public final String f101745e;

    /* JADX INFO: renamed from: f */
    public final long f101746f;

    /* JADX INFO: renamed from: g */
    public final String f101747g;

    public ifd(long j, String str, String str2) {
        this.f101745e = str;
        this.f101746f = j;
        this.f101747g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f101747g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f101745e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f101746f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifd)) {
            return false;
        }
        ifd ifdVar = (ifd) obj;
        return wj50.m88271j(this.f101745e, ifdVar.f101745e) && this.f101746f == ifdVar.f101746f && wj50.m88271j(this.f101747g, ifdVar.f101747g);
    }

    public final int hashCode() {
        return this.f101747g.hashCode() + dq60.m36605e(this.f101745e.hashCode() * 31, this.f101746f, 31);
    }
}
