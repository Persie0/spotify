package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ffd extends gfd {

    /* JADX INFO: renamed from: e */
    public final String f68970e;

    /* JADX INFO: renamed from: f */
    public final long f68971f;

    /* JADX INFO: renamed from: g */
    public final long f68972g;

    /* JADX INFO: renamed from: h */
    public final String f68973h;

    public ffd(String str, long j, long j2, String str2) {
        this.f68970e = str;
        this.f68971f = j;
        this.f68972g = j2;
        this.f68973h = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f68973h;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f68970e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f68971f;
    }

    @Override // p204p.gfd
    /* JADX INFO: renamed from: G */
    public final long mo29011G() {
        return this.f68972g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffd)) {
            return false;
        }
        ffd ffdVar = (ffd) obj;
        return wj50.m88271j(this.f68970e, ffdVar.f68970e) && this.f68971f == ffdVar.f68971f && this.f68972g == ffdVar.f68972g && wj50.m88271j(this.f68973h, ffdVar.f68973h);
    }

    public final int hashCode() {
        return this.f68973h.hashCode() + dq60.m36605e(dq60.m36605e(this.f68970e.hashCode() * 31, this.f68971f, 31), this.f68972g, 31);
    }
}
