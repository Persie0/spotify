package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tjl {

    /* JADX INFO: renamed from: a */
    public final int f220957a;

    /* JADX INFO: renamed from: b */
    public final int f220958b;

    public tjl(int i, int i2) {
        this.f220957a = i;
        this.f220958b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjl)) {
            return false;
        }
        tjl tjlVar = (tjl) obj;
        return this.f220957a == tjlVar.f220957a && this.f220958b == tjlVar.f220958b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f220958b) + (edb.m38547C(this.f220957a) * 31);
    }
}
