package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dz01 extends kz01 {

    /* JADX INFO: renamed from: a */
    public final int f54483a;

    public dz01(int i) {
        this.f54483a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz01) && this.f54483a == ((dz01) obj).f54483a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54483a);
    }
}
