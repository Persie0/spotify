package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eqz {

    /* JADX INFO: renamed from: a */
    public final boolean f61979a;

    /* JADX INFO: renamed from: b */
    public final int f61980b;

    public eqz(boolean z, int i) {
        this.f61979a = z;
        this.f61980b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqz)) {
            return false;
        }
        eqz eqzVar = (eqz) obj;
        return this.f61979a == eqzVar.f61979a && this.f61980b == eqzVar.f61980b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61980b) + (Boolean.hashCode(this.f61979a) * 31);
    }
}
