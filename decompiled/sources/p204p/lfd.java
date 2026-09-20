package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lfd extends mfd {

    /* JADX INFO: renamed from: e */
    public final String f132903e;

    /* JADX INFO: renamed from: f */
    public final long f132904f;

    /* JADX INFO: renamed from: g */
    public final String f132905g;

    public lfd(long j, String str, String str2) {
        this.f132903e = str;
        this.f132904f = j;
        this.f132905g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f132905g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f132903e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f132904f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfd)) {
            return false;
        }
        lfd lfdVar = (lfd) obj;
        return wj50.m88271j(this.f132903e, lfdVar.f132903e) && this.f132904f == lfdVar.f132904f && wj50.m88271j(this.f132905g, lfdVar.f132905g);
    }

    public final int hashCode() {
        return this.f132905g.hashCode() + dq60.m36605e(this.f132903e.hashCode() * 31, this.f132904f, 31);
    }
}
