package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p9c1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final long f175214a;

    public p9c1(long j) {
        this.f175214a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9c1) && this.f175214a == ((p9c1) obj).f175214a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f175214a);
    }
}
