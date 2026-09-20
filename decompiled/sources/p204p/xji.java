package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xji {

    /* JADX INFO: renamed from: a */
    public final boolean f262138a;

    public xji(boolean z) {
        this.f262138a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xji) && this.f262138a == ((xji) obj).f262138a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f262138a);
    }
}
