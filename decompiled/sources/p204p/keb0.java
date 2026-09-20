package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class keb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final long f121843a;

    public keb0(long j) {
        this.f121843a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof keb0) && this.f121843a == ((keb0) obj).f121843a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f121843a);
    }
}
