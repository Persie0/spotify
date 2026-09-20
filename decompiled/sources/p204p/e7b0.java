package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56892a;

    public e7b0(boolean z) {
        this.f56892a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7b0) && this.f56892a == ((e7b0) obj).f56892a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56892a);
    }
}
