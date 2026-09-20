package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e2l implements h2l {

    /* JADX INFO: renamed from: a */
    public final long f55480a;

    public e2l(long j) {
        this.f55480a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m37611a() {
        return this.f55480a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2l) && this.f55480a == ((e2l) obj).f55480a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55480a);
    }
}
