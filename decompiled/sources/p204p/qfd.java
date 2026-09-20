package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qfd extends rfd {

    /* JADX INFO: renamed from: e */
    public final String f188169e;

    /* JADX INFO: renamed from: f */
    public final long f188170f;

    /* JADX INFO: renamed from: g */
    public final String f188171g;

    public qfd(long j, String str, String str2) {
        this.f188169e = str;
        this.f188170f = j;
        this.f188171g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f188171g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f188169e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f188170f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfd)) {
            return false;
        }
        qfd qfdVar = (qfd) obj;
        return wj50.m88271j(this.f188169e, qfdVar.f188169e) && this.f188170f == qfdVar.f188170f && wj50.m88271j(this.f188171g, qfdVar.f188171g);
    }

    public final int hashCode() {
        return this.f188171g.hashCode() + dq60.m36605e(this.f188169e.hashCode() * 31, this.f188170f, 31);
    }
}
