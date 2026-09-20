package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kfd extends mfd {

    /* JADX INFO: renamed from: e */
    public final String f122131e;

    /* JADX INFO: renamed from: f */
    public final long f122132f;

    /* JADX INFO: renamed from: g */
    public final String f122133g;

    public kfd(long j, String str, String str2) {
        this.f122131e = str;
        this.f122132f = j;
        this.f122133g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f122133g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f122131e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f122132f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfd)) {
            return false;
        }
        kfd kfdVar = (kfd) obj;
        return wj50.m88271j(this.f122131e, kfdVar.f122131e) && this.f122132f == kfdVar.f122132f && wj50.m88271j(this.f122133g, kfdVar.f122133g);
    }

    public final int hashCode() {
        return this.f122133g.hashCode() + dq60.m36605e(this.f122131e.hashCode() * 31, this.f122132f, 31);
    }
}
