package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ofd extends pfd {

    /* JADX INFO: renamed from: e */
    public final String f164716e;

    /* JADX INFO: renamed from: f */
    public final long f164717f;

    /* JADX INFO: renamed from: g */
    public final String f164718g;

    public ofd(long j, String str, String str2) {
        this.f164716e = str;
        this.f164717f = j;
        this.f164718g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f164718g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f164716e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f164717f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofd)) {
            return false;
        }
        ofd ofdVar = (ofd) obj;
        return wj50.m88271j(this.f164716e, ofdVar.f164716e) && this.f164717f == ofdVar.f164717f && wj50.m88271j(this.f164718g, ofdVar.f164718g);
    }

    public final int hashCode() {
        return this.f164718g.hashCode() + dq60.m36605e(this.f164716e.hashCode() * 31, this.f164717f, 31);
    }
}
