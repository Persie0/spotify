package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k7m implements m7m {

    /* JADX INFO: renamed from: a */
    public final int f120160a;

    /* JADX INFO: renamed from: b */
    public final int f120161b;

    public k7m(int i, int i2) {
        this.f120160a = i;
        this.f120161b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7m)) {
            return false;
        }
        k7m k7mVar = (k7m) obj;
        return this.f120160a == k7mVar.f120160a && this.f120161b == k7mVar.f120161b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120161b) + (Integer.hashCode(this.f120160a) * 31);
    }
}
