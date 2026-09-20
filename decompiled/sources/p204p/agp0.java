package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class agp0 implements bgp0 {

    /* JADX INFO: renamed from: a */
    public final long f15469a;

    public agp0(long j) {
        this.f15469a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agp0) && this.f15469a == ((agp0) obj).f15469a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15469a);
    }
}
