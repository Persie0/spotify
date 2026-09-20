package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xdy0 implements zdy0 {

    /* JADX INFO: renamed from: a */
    public final long f260570a;

    public xdy0(long j) {
        this.f260570a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdy0) && this.f260570a == ((xdy0) obj).f260570a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f260570a);
    }
}
