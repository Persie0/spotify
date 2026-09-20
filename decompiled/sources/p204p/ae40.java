package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ae40 implements be40 {

    /* JADX INFO: renamed from: a */
    public final int f14747a;

    public ae40(int i) {
        this.f14747a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae40) && this.f14747a == ((ae40) obj).f14747a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14747a);
    }
}
