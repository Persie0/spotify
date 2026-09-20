package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wfd extends xfd {

    /* JADX INFO: renamed from: e */
    public final String f250799e;

    /* JADX INFO: renamed from: f */
    public final long f250800f;

    /* JADX INFO: renamed from: g */
    public final String f250801g;

    public wfd(long j, String str, String str2) {
        this.f250799e = str;
        this.f250800f = j;
        this.f250801g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f250801g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f250799e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f250800f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfd)) {
            return false;
        }
        wfd wfdVar = (wfd) obj;
        return wj50.m88271j(this.f250799e, wfdVar.f250799e) && this.f250800f == wfdVar.f250800f && wj50.m88271j(this.f250801g, wfdVar.f250801g);
    }

    public final int hashCode() {
        return this.f250801g.hashCode() + dq60.m36605e(this.f250799e.hashCode() * 31, this.f250800f, 31);
    }
}
