package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hlx {

    /* JADX INFO: renamed from: a */
    public final int f92760a;

    /* JADX INFO: renamed from: b */
    public final int f92761b;

    public hlx(int i, int i2, edb edbVar) {
        this.f92760a = i;
        this.f92761b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlx)) {
            return false;
        }
        hlx hlxVar = (hlx) obj;
        return this.f92760a == hlxVar.f92760a && this.f92761b == hlxVar.f92761b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f92761b) + (Integer.hashCode(this.f92760a) * 31);
    }
}
