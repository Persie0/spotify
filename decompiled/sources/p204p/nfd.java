package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class nfd extends pfd {

    /* JADX INFO: renamed from: e */
    public final String f153319e;

    /* JADX INFO: renamed from: f */
    public final long f153320f;

    /* JADX INFO: renamed from: g */
    public final String f153321g;

    public nfd(long j, String str, String str2) {
        this.f153319e = str;
        this.f153320f = j;
        this.f153321g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f153321g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f153319e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f153320f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfd)) {
            return false;
        }
        nfd nfdVar = (nfd) obj;
        return wj50.m88271j(this.f153319e, nfdVar.f153319e) && this.f153320f == nfdVar.f153320f && wj50.m88271j(this.f153321g, nfdVar.f153321g);
    }

    public final int hashCode() {
        return this.f153321g.hashCode() + dq60.m36605e(this.f153319e.hashCode() * 31, this.f153320f, 31);
    }
}
