package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e6u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56763a;

    public e6u0(boolean z) {
        this.f56763a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6u0) && this.f56763a == ((e6u0) obj).f56763a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56763a);
    }
}
