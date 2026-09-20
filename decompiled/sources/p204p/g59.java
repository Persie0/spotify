package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g59 extends h59 {

    /* JADX INFO: renamed from: a */
    public final long f76616a;

    public g59(long j) {
        this.f76616a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g59) && this.f76616a == ((g59) obj).f76616a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76616a);
    }
}
