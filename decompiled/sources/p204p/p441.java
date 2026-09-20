package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p441 implements q441 {

    /* JADX INFO: renamed from: a */
    public final int f173809a;

    public p441(int i) {
        this.f173809a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p441) && this.f173809a == ((p441) obj).f173809a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173809a);
    }
}
