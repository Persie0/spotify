package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tfd extends yfd {

    /* JADX INFO: renamed from: e */
    public final String f219916e;

    /* JADX INFO: renamed from: f */
    public final long f219917f;

    /* JADX INFO: renamed from: g */
    public final String f219918g;

    public tfd(long j, String str, String str2) {
        this.f219916e = str;
        this.f219917f = j;
        this.f219918g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f219918g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f219916e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f219917f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfd)) {
            return false;
        }
        tfd tfdVar = (tfd) obj;
        return wj50.m88271j(this.f219916e, tfdVar.f219916e) && this.f219917f == tfdVar.f219917f && wj50.m88271j(this.f219918g, tfdVar.f219918g);
    }

    public final int hashCode() {
        return this.f219918g.hashCode() + dq60.m36605e(this.f219916e.hashCode() * 31, this.f219917f, 31);
    }
}
