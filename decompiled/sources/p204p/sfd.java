package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sfd extends yfd {

    /* JADX INFO: renamed from: e */
    public final String f208529e;

    /* JADX INFO: renamed from: f */
    public final long f208530f;

    /* JADX INFO: renamed from: g */
    public final String f208531g;

    public sfd(long j, String str, String str2) {
        this.f208529e = str;
        this.f208530f = j;
        this.f208531g = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f208531g;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f208529e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f208530f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfd)) {
            return false;
        }
        sfd sfdVar = (sfd) obj;
        return wj50.m88271j(this.f208529e, sfdVar.f208529e) && this.f208530f == sfdVar.f208530f && wj50.m88271j(this.f208531g, sfdVar.f208531g);
    }

    public final int hashCode() {
        return this.f208531g.hashCode() + dq60.m36605e(this.f208529e.hashCode() * 31, this.f208530f, 31);
    }
}
