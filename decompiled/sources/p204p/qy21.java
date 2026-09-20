package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final long f193793a;

    public qy21(long j) {
        this.f193793a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy21) && this.f193793a == ((qy21) obj).f193793a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f193793a);
    }
}
