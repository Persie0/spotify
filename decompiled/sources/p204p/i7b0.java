package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f99485a;

    public i7b0(boolean z) {
        this.f99485a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7b0) && this.f99485a == ((i7b0) obj).f99485a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99485a);
    }
}
