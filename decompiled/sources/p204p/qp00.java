package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qp00 implements tp00 {

    /* JADX INFO: renamed from: a */
    public final long f191109a;

    public qp00(long j) {
        this.f191109a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp00) && this.f191109a == ((qp00) obj).f191109a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f191109a);
    }
}
