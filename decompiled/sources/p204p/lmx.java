package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lmx {

    /* JADX INFO: renamed from: a */
    public final int f135042a;

    /* JADX INFO: renamed from: b */
    public final boolean f135043b;

    /* JADX INFO: renamed from: c */
    public final boolean f135044c;

    public lmx(int i, boolean z, boolean z2) {
        this.f135042a = i;
        this.f135043b = z;
        this.f135044c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmx)) {
            return false;
        }
        lmx lmxVar = (lmx) obj;
        return this.f135042a == lmxVar.f135042a && this.f135043b == lmxVar.f135043b && this.f135044c == lmxVar.f135044c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135044c) + s571.m77245d(edb.m38547C(this.f135042a) * 31, 31, this.f135043b);
    }
}
