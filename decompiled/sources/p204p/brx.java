package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class brx implements irx {

    /* JADX INFO: renamed from: a */
    public final long f30177a;

    public brx(long j) {
        this.f30177a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brx) && this.f30177a == ((brx) obj).f30177a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30177a);
    }
}
