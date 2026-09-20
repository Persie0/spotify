package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qrd1 extends srd1 {

    /* JADX INFO: renamed from: a */
    public final long f191824a;

    public qrd1(long j) {
        this.f191824a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrd1) && this.f191824a == ((qrd1) obj).f191824a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f191824a);
    }

    public /* synthetic */ qrd1() {
        this(0L);
    }
}
