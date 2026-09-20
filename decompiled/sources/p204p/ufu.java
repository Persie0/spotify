package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ufu {

    /* JADX INFO: renamed from: a */
    public final kiu f229874a;

    /* JADX INFO: renamed from: b */
    public final kiu f229875b;

    /* JADX INFO: renamed from: c */
    public final long f229876c;

    /* JADX INFO: renamed from: d */
    public final long f229877d;

    /* JADX INFO: renamed from: e */
    public final long f229878e;

    public ufu(kiu kiuVar, kiu kiuVar2, long j, long j2, long j3) {
        this.f229874a = kiuVar;
        this.f229875b = kiuVar2;
        this.f229876c = j;
        this.f229877d = j2;
        this.f229878e = j3;
    }

    /* JADX INFO: renamed from: a */
    public static ufu m83024a(ufu ufuVar, long j, long j2, long j3) {
        kiu kiuVar = ufuVar.f229874a;
        kiu kiuVar2 = ufuVar.f229875b;
        ufuVar.getClass();
        return new ufu(kiuVar, kiuVar2, j, j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufu)) {
            return false;
        }
        ufu ufuVar = (ufu) obj;
        if (!this.f229874a.equals(ufuVar.f229874a) || !this.f229875b.equals(ufuVar.f229875b)) {
            return false;
        }
        long j = ufuVar.f229876c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f229876c, j) && as91.m27074b(this.f229877d, ufuVar.f229877d) && as91.m27074b(this.f229878e, ufuVar.f229878e);
    }

    public final int hashCode() {
        int iHashCode = (this.f229875b.hashCode() + (this.f229874a.hashCode() * 31)) * 31;
        int i = n6f.f150872l;
        return as91.m27075c(this.f229878e) + ms2.m62682g(ms2.m62682g(iHashCode, this.f229876c, 31), this.f229877d, 31);
    }
}
