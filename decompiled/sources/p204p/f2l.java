package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f2l implements h2l {

    /* JADX INFO: renamed from: a */
    public final long f65205a;

    public f2l(long j) {
        this.f65205a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2l) && this.f65205a == ((f2l) obj).f65205a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f65205a);
    }
}
