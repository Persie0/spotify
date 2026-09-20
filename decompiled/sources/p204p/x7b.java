package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x7b extends a8b {

    /* JADX INFO: renamed from: a */
    public final boolean f258867a;

    public x7b(boolean z) {
        this.f258867a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7b) && this.f258867a == ((x7b) obj).f258867a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258867a);
    }
}
