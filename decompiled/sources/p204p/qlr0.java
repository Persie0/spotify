package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qlr0 extends tlr0 {

    /* JADX INFO: renamed from: a */
    public final long f189905a;

    public qlr0(long j) {
        this.f189905a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlr0) && this.f189905a == ((qlr0) obj).f189905a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f189905a);
    }
}
