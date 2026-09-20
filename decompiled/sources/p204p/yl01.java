package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yl01 implements am01 {

    /* JADX INFO: renamed from: a */
    public final long f273873a;

    public yl01(long j) {
        this.f273873a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl01) && this.f273873a == ((yl01) obj).f273873a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f273873a);
    }
}
