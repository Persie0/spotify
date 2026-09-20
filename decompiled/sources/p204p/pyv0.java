package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pyv0 implements ryv0 {

    /* JADX INFO: renamed from: a */
    public final long f183529a;

    public pyv0(long j) {
        this.f183529a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pyv0) && this.f183529a == ((pyv0) obj).f183529a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f183529a);
    }
}
