package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qh20 implements rh20 {

    /* JADX INFO: renamed from: a */
    public final long f188602a;

    public qh20(long j) {
        this.f188602a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh20) && this.f188602a == ((qh20) obj).f188602a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f188602a);
    }
}
