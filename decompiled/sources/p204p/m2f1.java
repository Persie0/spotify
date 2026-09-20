package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m2f1 {

    /* JADX INFO: renamed from: a */
    public final long f139334a;

    public m2f1(long j) {
        this.f139334a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof m2f1) && this.f139334a == ((m2f1) obj).f139334a;
    }

    public final int hashCode() {
        long j = this.f139334a;
        return (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return ikc0.m50938j(this.f139334a, ", webViewRequestMode=0}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
