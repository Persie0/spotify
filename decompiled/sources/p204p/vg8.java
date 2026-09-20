package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final long f241178a;

    public vg8(long j) {
        this.f241178a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg8) && this.f241178a == ((vg8) obj).f241178a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f241178a);
    }
}
