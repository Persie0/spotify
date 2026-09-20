package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ftz {

    /* JADX INFO: renamed from: a */
    public final boolean f73352a;

    public ftz(boolean z) {
        this.f73352a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftz) && this.f73352a == ((ftz) obj).f73352a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73352a);
    }
}
