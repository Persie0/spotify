package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qo81 implements vo81 {

    /* JADX INFO: renamed from: a */
    public final long f190837a;

    public qo81(long j) {
        this.f190837a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo81) && this.f190837a == ((qo81) obj).f190837a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f190837a);
    }
}
