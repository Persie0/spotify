package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tcc1 implements xcc1 {

    /* JADX INFO: renamed from: a */
    public final long f219072a;

    public tcc1(long j) {
        this.f219072a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcc1) && this.f219072a == ((tcc1) obj).f219072a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f219072a);
    }
}
