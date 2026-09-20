package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a6i0 implements e6i0 {

    /* JADX INFO: renamed from: a */
    public final boolean f12807a;

    public a6i0(boolean z) {
        this.f12807a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6i0) && this.f12807a == ((a6i0) obj).f12807a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12807a);
    }
}
