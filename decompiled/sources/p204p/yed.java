package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yed extends gfd {

    /* JADX INFO: renamed from: e */
    public final String f271972e;

    /* JADX INFO: renamed from: f */
    public final long f271973f;

    /* JADX INFO: renamed from: g */
    public final long f271974g;

    /* JADX INFO: renamed from: h */
    public final String f271975h;

    public yed(String str, long j, long j2, String str2) {
        this.f271972e = str;
        this.f271973f = j;
        this.f271974g = j2;
        this.f271975h = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f271975h;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f271972e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f271973f;
    }

    @Override // p204p.gfd
    /* JADX INFO: renamed from: G */
    public final long mo29011G() {
        return this.f271974g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yed)) {
            return false;
        }
        yed yedVar = (yed) obj;
        return wj50.m88271j(this.f271972e, yedVar.f271972e) && this.f271973f == yedVar.f271973f && this.f271974g == yedVar.f271974g && wj50.m88271j(this.f271975h, yedVar.f271975h);
    }

    public final int hashCode() {
        return this.f271975h.hashCode() + dq60.m36605e(dq60.m36605e(this.f271972e.hashCode() * 31, this.f271973f, 31), this.f271974g, 31);
    }
}
