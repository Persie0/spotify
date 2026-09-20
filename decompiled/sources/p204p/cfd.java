package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cfd extends efd {

    /* JADX INFO: renamed from: c */
    public final String f37324c;

    /* JADX INFO: renamed from: d */
    public final long f37325d;

    /* JADX INFO: renamed from: e */
    public final long f37326e;

    /* JADX INFO: renamed from: f */
    public final String f37327f;

    public cfd(String str, long j, long j2, String str2) {
        this.f37324c = str;
        this.f37325d = j;
        this.f37326e = j2;
        this.f37327f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfd)) {
            return false;
        }
        cfd cfdVar = (cfd) obj;
        return wj50.m88271j(this.f37324c, cfdVar.f37324c) && this.f37325d == cfdVar.f37325d && this.f37326e == cfdVar.f37326e && wj50.m88271j(this.f37327f, cfdVar.f37327f);
    }

    public final int hashCode() {
        return this.f37327f.hashCode() + dq60.m36605e(dq60.m36605e(this.f37324c.hashCode() * 31, this.f37325d, 31), this.f37326e, 31);
    }

    @Override // p204p.efd
    /* JADX INFO: renamed from: o */
    public final String mo25808o() {
        return this.f37327f;
    }
}
