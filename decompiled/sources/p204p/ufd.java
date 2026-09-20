package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ufd extends xfd {

    /* JADX INFO: renamed from: e */
    public final String f229752e;

    /* JADX INFO: renamed from: f */
    public final long f229753f;

    /* JADX INFO: renamed from: g */
    public final String f229754g;

    public ufd(long j, String str, String str2) {
        this.f229752e = str;
        this.f229753f = j;
        this.f229754g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f229754g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f229752e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f229753f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufd)) {
            return false;
        }
        ufd ufdVar = (ufd) obj;
        return wj50.m88271j(this.f229752e, ufdVar.f229752e) && this.f229753f == ufdVar.f229753f && wj50.m88271j(this.f229754g, ufdVar.f229754g);
    }

    public final int hashCode() {
        return this.f229754g.hashCode() + dq60.m36605e(this.f229752e.hashCode() * 31, this.f229753f, 31);
    }
}
