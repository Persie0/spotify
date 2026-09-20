package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x9t0 {

    /* JADX INFO: renamed from: a */
    public final boolean f259446a;

    public x9t0(boolean z) {
        this.f259446a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9t0) && this.f259446a == ((x9t0) obj).f259446a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259446a);
    }
}
