package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wqv {

    /* JADX INFO: renamed from: a */
    public final int f254179a;

    /* JADX INFO: renamed from: b */
    public final int f254180b;

    /* JADX INFO: renamed from: c */
    public final long f254181c;

    /* JADX INFO: renamed from: d */
    public final boolean f254182d;

    /* JADX INFO: renamed from: e */
    public final Long f254183e;

    public wqv(int i, int i2, long j, boolean z, Long l) {
        this.f254179a = i;
        this.f254180b = i2;
        this.f254181c = j;
        this.f254182d = z;
        this.f254183e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqv)) {
            return false;
        }
        wqv wqvVar = (wqv) obj;
        return this.f254179a == wqvVar.f254179a && this.f254180b == wqvVar.f254180b && this.f254181c == wqvVar.f254181c && this.f254182d == wqvVar.f254182d && wj50.m88271j(this.f254183e, wqvVar.f254183e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(dq60.m36605e(f710.m40938f(this.f254180b, edb.m38547C(this.f254179a) * 31, 31), this.f254181c, 31), 31, this.f254182d);
        Long l = this.f254183e;
        return iM77245d + (l == null ? 0 : l.hashCode());
    }
}
