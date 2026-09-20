package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dka0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final int f49944a;

    public dka0(int i) {
        this.f49944a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dka0) && this.f49944a == ((dka0) obj).f49944a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49944a);
    }
}
