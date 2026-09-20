package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vk81 implements wk81 {

    /* JADX INFO: renamed from: a */
    public final long f242169a;

    public vk81(long j) {
        this.f242169a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk81) && this.f242169a == ((vk81) obj).f242169a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f242169a);
    }
}
