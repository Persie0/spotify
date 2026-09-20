package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z1l0 implements a2l0 {

    /* JADX INFO: renamed from: a */
    public final long f278327a;

    public z1l0(long j) {
        this.f278327a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1l0) && this.f278327a == ((z1l0) obj).f278327a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f278327a);
    }
}
