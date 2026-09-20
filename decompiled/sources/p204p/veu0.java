package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class veu0 implements weu0 {

    /* JADX INFO: renamed from: a */
    public final long f240821a;

    public veu0(long j) {
        this.f240821a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof veu0) && this.f240821a == ((veu0) obj).f240821a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f240821a);
    }
}
