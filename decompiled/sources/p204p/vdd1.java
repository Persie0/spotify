package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vdd1 implements xdd1 {

    /* JADX INFO: renamed from: a */
    public final long f240399a;

    public vdd1(long j) {
        this.f240399a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdd1) && this.f240399a == ((vdd1) obj).f240399a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f240399a);
    }
}
