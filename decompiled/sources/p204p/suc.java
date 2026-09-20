package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class suc {

    /* JADX INFO: renamed from: a */
    public final int f214049a;

    /* JADX INFO: renamed from: b */
    public final int f214050b;

    public suc(int i, int i2) {
        this.f214049a = i;
        this.f214050b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suc)) {
            return false;
        }
        suc sucVar = (suc) obj;
        return this.f214049a == sucVar.f214049a && this.f214050b == sucVar.f214050b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f214050b) + (Integer.hashCode(this.f214049a) * 31);
    }
}
