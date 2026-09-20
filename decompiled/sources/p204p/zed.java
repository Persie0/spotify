package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zed extends dfd {

    /* JADX INFO: renamed from: e */
    public final String f281999e;

    /* JADX INFO: renamed from: f */
    public final long f282000f;

    /* JADX INFO: renamed from: g */
    public final long f282001g;

    /* JADX INFO: renamed from: h */
    public final String f282002h;

    public zed(String str, long j, long j2, String str2) {
        this.f281999e = str;
        this.f282000f = j;
        this.f282001g = j2;
        this.f282002h = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f282002h;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f281999e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f282000f;
    }

    @Override // p204p.gfd
    /* JADX INFO: renamed from: G */
    public final long mo29011G() {
        return this.f282001g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zed)) {
            return false;
        }
        zed zedVar = (zed) obj;
        return wj50.m88271j(this.f281999e, zedVar.f281999e) && this.f282000f == zedVar.f282000f && this.f282001g == zedVar.f282001g && wj50.m88271j(this.f282002h, zedVar.f282002h);
    }

    public final int hashCode() {
        return this.f282002h.hashCode() + dq60.m36605e(dq60.m36605e(this.f281999e.hashCode() * 31, this.f282000f, 31), this.f282001g, 31);
    }
}
