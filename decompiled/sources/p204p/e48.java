package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e48 extends hhg1 {

    /* JADX INFO: renamed from: d */
    public final boolean f56025d;

    public e48(boolean z) {
        this.f56025d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e48) && this.f56025d == ((e48) obj).f56025d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56025d);
    }
}
