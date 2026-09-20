package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hfd extends jfd {

    /* JADX INFO: renamed from: e */
    public final String f90678e;

    /* JADX INFO: renamed from: f */
    public final long f90679f;

    /* JADX INFO: renamed from: g */
    public final String f90680g;

    public hfd(long j, String str, String str2) {
        this.f90678e = str;
        this.f90679f = j;
        this.f90680g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f90680g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f90678e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f90679f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfd)) {
            return false;
        }
        hfd hfdVar = (hfd) obj;
        return wj50.m88271j(this.f90678e, hfdVar.f90678e) && this.f90679f == hfdVar.f90679f && wj50.m88271j(this.f90680g, hfdVar.f90680g);
    }

    public final int hashCode() {
        return this.f90680g.hashCode() + dq60.m36605e(this.f90678e.hashCode() * 31, this.f90679f, 31);
    }
}
