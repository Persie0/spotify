package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ead implements lad {

    /* JADX INFO: renamed from: a */
    public final gcd f57623a;

    public ead(gcd gcdVar) {
        this.f57623a = gcdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ead) && this.f57623a == ((ead) obj).f57623a;
    }

    public final int hashCode() {
        return this.f57623a.hashCode();
    }
}
